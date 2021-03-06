package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokesController {
    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(value = "/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getChuckNorrisJoke());
        return "chucknorris";
    }
}
