package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPresenter {
    @GetMapping("/hello")
    public String name(){
        return "Hello World";
    }
}
