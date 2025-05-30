package utez.edu.mx.cv_jcr_9a2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin
public class User1Controller {
    @GetMapping()
    public String userMessage(){
        return "Hola usuario 1";
    }
}
