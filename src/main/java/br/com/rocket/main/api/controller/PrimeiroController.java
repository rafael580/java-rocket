package br.com.rocket.main.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/")
@RestController
public class PrimeiroController {


    @GetMapping("/primeiroMetodo/{id}")
    public String test(@PathVariable(name = "id")  String id){
        return "ola mundo" + id;
    }

    @GetMapping("/metodoqueryparams")
    public String metodocomqueryparams(@RequestParam String id){
        return "o query é : " +  id;
    }


    @GetMapping("/metodoqueryparams2")
    public String metodocomqueryparams(@RequestParam Map<String,String> allparams){
        return "o query é : " +  allparams.entrySet();
    }

}
