package br.com.rocket.main.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class PrimeiroController {


    @GetMapping("/primeiroMetodo/{id}")
    public String test(@PathVariable(name = "id")  String id){
        return "ola mundo" + id;
    }

}
