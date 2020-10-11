package com.padrao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utilities")
public class UtilitiesController {

    @RequestMapping("/colors")
    public String colors() {

        return "colors";
    }

    @RequestMapping("/border")
    public String border() {

        return "border";
    }

    @RequestMapping("/animations")
    public String animations() {

        return "animations";
    }

    @RequestMapping("/other")
    public String other() {

        return "other";
    }
}
