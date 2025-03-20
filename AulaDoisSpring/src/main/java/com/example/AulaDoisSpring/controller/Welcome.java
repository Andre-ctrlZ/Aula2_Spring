package com.example.AulaDoisSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/")
    public String welcome(){
        return "bem-vindo ao projeto aula";
    }

    @RequestMapping("/curso")
    public String curso(){
        return "Curso: Desenvolvimento de Sistemas";
    }

    @RequestMapping("/dev")
    public String dev(){
        return "Desenvolvido por Andre-CtrlZ";
    }
}
