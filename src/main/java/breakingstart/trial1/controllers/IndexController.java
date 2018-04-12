package breakingstart.trial1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by saurabh on 2/10/17.
 */

@Controller
@RequestMapping("/spitter")
public class IndexController {

    //@GetMapping("/")
    @RequestMapping("/init")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue");
        return "index";
    }
}
