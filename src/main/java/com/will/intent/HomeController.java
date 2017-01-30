package com.will.intent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by marksmelendez on 1/15/17.
 */

@Controller
public class HomeController {


    @RequestMapping("/login")
    public String authenticate() {

        return "login";
    }






}
