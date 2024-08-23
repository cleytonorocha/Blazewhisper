package cleytonorocha.com.github.ollamaai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Url {
    
    @GetMapping("")
    public String padrao() {
        return "index";
    }
    
    @GetMapping("index")
    public String index() {
        return "index";
    }
    
}
