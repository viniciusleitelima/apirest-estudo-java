package br.com.apirest.apirest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public  String getHome(){
        return "Ola, ok";
    }
}
