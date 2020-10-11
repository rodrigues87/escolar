package com.padrao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/components")
public class ComponentsController {

    @RequestMapping("/buttons")
    public String buttons() {

        return "buttons";
    }

    @RequestMapping("/cards")
    public String cards() {

        return "cards";
    }

}
