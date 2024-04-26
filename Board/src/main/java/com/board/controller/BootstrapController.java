package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootstrapController
{
    @GetMapping("/")
    public String index(Model model)
    {
        return "bootstrap/index";
    }
    
    @GetMapping("/resume")
    public String resume(Model model)
    {
        return "bootstrap/resume";
    }
    
    @GetMapping("/projects")
    public String projects(Model model)
    {
        return "bootstrap/projects";
    }
    
    @GetMapping("/contact")
    public String contact(Model model)
    {
        return "bootstrap/contact";
    }
}