package cleytonorocha.com.github.ollamaai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cleytonorocha.com.github.ollamaai.service.PromptService;


@RestController
public class PromptController {

    @Autowired
    private PromptService promptService;
    
    @GetMapping("api/v1/generate")
    public String generate(@RequestParam(defaultValue = "Say anything", value = "promptMessage") String param) {
        return promptService.generate(param);
    }
    
}
