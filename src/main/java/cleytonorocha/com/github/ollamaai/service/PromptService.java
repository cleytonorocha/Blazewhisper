package cleytonorocha.com.github.ollamaai.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    private final OllamaChatModel ollamaChatModel;

    public PromptService(OllamaChatModel ollamaChatModel){
        this.ollamaChatModel = ollamaChatModel;

    }
    
    public String generate(String prompt){
        ChatResponse response = ollamaChatModel.call(
            new Prompt(prompt, OllamaOptions.create()
            .withModel(OllamaModel.LLAMA2_UNCENSORED.getModelName()))
        );
        return response.getResult().getOutput().getContent();
    }

}
