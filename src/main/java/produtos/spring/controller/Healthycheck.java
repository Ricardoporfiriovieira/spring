package produtos.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Healthycheck {
 
    @GetMapping
    public String healthyCheck(){
        return "Message Ok";
    }

}
