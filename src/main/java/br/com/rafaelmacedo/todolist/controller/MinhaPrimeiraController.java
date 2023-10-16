package br.com.rafaelmacedo.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amorDoRafa")
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String primeiraMensagem(){
        return "Eu amo minha esposa <3";
    }
    
}
