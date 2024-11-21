package com.azh.AZH.Shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @GetMapping("/")
    public String Hello()
    {
        return "Say Hello";
    }
    @GetMapping("/getAny")
    public String getIdByName()
    {
        return "hi im mani";
    }
}