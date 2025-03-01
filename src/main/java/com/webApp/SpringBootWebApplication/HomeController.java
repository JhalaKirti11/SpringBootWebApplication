package com.webApp.SpringBootWebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// we can use any way to return the text
// either RestController annotation or @ResponseBody annotation...
// if we don't use any of them then the return statement will return the page with that name
// (like here-Hello world, welcome to Home-Controller page...)
// not the text.


@RestController
public class HomeController {
    
    @RequestMapping("/")    // here, the home route is optional, but good to specify...
    // @ResponseBody
    public String getHomePage(){
        System.out.println("This is Home-Controller page.");
        return "Hello world, welcome to Home-Controller page...";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("This is about page...");
        return "Hello, This is about page where you will get the information...";
    }
}
