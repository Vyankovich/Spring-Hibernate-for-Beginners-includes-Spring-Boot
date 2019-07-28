package com.yankovich.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @Value("#{favorite_programming_language}")
    private Map<String, String> favorite_programming_language;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();
        // add student object to the model
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("theCountryOptions", countryOptions);
        theModel.addAttribute("theProgrammingLanguage", favorite_programming_language);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() +
                " " + theStudent.getLastName() + " from " + theStudent.getCountry() +
                " " + theStudent.getProgrammingLanguage());
        return "student-confirmation";
    }



}
