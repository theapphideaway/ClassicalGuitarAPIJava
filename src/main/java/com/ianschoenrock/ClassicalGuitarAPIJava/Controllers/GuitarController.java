package com.ianschoenrock.ClassicalGuitarAPIJava.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuitarController {
    @RequestMapping("/guitars")
    public String getGuitars(){
        return "Guitars";
    }
}
