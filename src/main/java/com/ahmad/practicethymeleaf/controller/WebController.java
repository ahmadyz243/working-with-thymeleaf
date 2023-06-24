package com.ahmad.practicethymeleaf.controller;

import com.ahmad.practicethymeleaf.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class WebController {

    @RequestMapping
    public ModelAndView index(ModelAndView modelAndView) {

        modelAndView.addObject("serverTime", new Date())
                .setViewName("index");

        List<Student> students = Arrays.asList(
                new Student(1, "Ali", "M"),
                new Student(2, "Hassan", "M"),
                new Student(3, "Abbas", "M"),
                new Student(4, "Zahra", "F")
                );

        modelAndView.addObject("students", students);

        modelAndView.addObject("student", new Student(5, "Ghasem", "M"));

        return modelAndView;

    }

    @PostMapping("/print-student")
    public ModelAndView printStudent(Student student, ModelAndView modelAndView, BindingResult errors){
        System.out.println(student);

        return index(modelAndView);
    }

}
