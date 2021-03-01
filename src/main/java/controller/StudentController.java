package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("name", "Hello World!");
        return modelAndView;
    }

    @GetMapping("/list")
    public String listStudent() {
        return "list";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("name", "Hello!");
        modelAndView.addObject("age", "18");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @GetMapping("/search")
    // /search?name="Tên của tham số truyền vào"
    public ModelAndView search(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("search", name);
        modelAndView.addObject("a", name);
        return modelAndView;
    }

}
