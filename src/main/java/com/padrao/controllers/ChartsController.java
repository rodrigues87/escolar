package com.padrao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartsController {

    @RequestMapping("/charts")
    public String dashboard() {

        return "charts";
    }
}
