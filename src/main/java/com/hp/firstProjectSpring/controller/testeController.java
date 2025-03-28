package com.hp.firstProjectSpring.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class testeController {
//  @RequestMapping(value = "/te", method = {RequestMethod.POST})

    @PostMapping("/te")
    public String imprimeNome(@RequestParam String nome){
    return "Oi, "+ nome;
    }
}
