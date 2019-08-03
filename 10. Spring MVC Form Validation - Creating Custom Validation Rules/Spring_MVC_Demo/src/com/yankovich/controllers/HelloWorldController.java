package com.yankovich.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // controller method to show the initial  HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // add a new controller method to read form data and
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model) {

        // read the request parameter from the html form
        String theName = request.getParameter("studentName");
        // convert the data to uppercase
        theName = theName.toUpperCase();
        //create the message
        String result = "Hi! " + theName;
        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersion3(@RequestParam("studentName") String theName, Model model) {

        // convert the data to uppercase
        theName = theName.toUpperCase();
        //create the message
        String result = "Hejka v3! " + theName;
        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
