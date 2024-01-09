package ru.maxima.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/old-hello-world")
    public String oldSayHello(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");


        System.out.println(name + ":" + surname);
        return "hello";
    }
    @GetMapping("/new-hello-world")
    public String sayHello(@RequestParam("name") String name,
                           @RequestParam("surname") String surname) {
        System.out.println(name + ":" + surname);
        System.out.println("You are inside your controller");
        return "hello";
    }

    @GetMapping("/name")
    public String sayHelloAirat() {
        return "name";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
