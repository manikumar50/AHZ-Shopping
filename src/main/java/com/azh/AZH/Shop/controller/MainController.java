package com.azh.AZH.Shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    
    @GetMapping("/getMani")
    public String getIdByName()
    {
        return "hi im mani";
    }
}
