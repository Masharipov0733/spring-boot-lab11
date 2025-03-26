package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @GetMapping("home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("services")
    public String services() {
        return "<h2>Our Services</h2>"
                + "<ul>"
                + "<li>Websites</li>"
                + "<li>Flutter Development</li>"
                + "<li>Social Media Marketing</li>"
                + "</ul>";
    }

    @GetMapping("about")
    public String about() {
        return "This is a web application designed to demonstrate Spring Boot URL mapping.";
    }

    @GetMapping("faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>"
                + "<ul>"
                + "<li><b>Q:</b> What is this application about? <b>A:</b> A demo of Spring Boot URL mapping.</li>"
                + "<li><b>Q:</b> How can I contact support? <b>A:</b> Use the /contact-us page.</li>"
                + "</ul>";
    }

    @GetMapping("contact-us")
    public String contactUs() {
        return "<h2>Contact Us</h2>"
                + "<p>Email: o.masharipov@newuu.com</p>"
                + "<p>Phone: +998 90 737 0833</p>";
    }

    @GetMapping("team")
    public String team() {
        return "<h2>Meet Our Team</h2>"
                + "<ul>"
                + "<li>John Doe - CEO</li>"
                + "<li>Jane Smith - CTO</li>"
                + "<li>Michael Brown - Lead Developer</li>"
                + "</ul>";
    }

    @GetMapping("greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Twice the value of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("length/{text}")
    public String length(@PathVariable String text) {
        return "The length of \"" + text + "\" is " + text.length() + ".";
    }

    @GetMapping("reverse/{text}")
    public String reverse(@PathVariable String text) {
        return "The reverse of \"" + text + "\" is \"" + new StringBuilder(text).reverse().toString() + "\".";
    }

    @GetMapping("concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "Concatenation result: " + str1 + str2;
    }
}
