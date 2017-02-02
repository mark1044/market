package com.will.intent;

import com.will.intent.data.mapping.MarketUser;
import com.will.intent.data.repo.MarketUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marksmelendez on 1/15/17.
 */

@Controller
public class HomeController {


    @Autowired
    MarketUserRepository userRepository;

    @RequestMapping("/login")
    public String authenticate() {

        return "login";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String displayRegister(MarketUser marketUser) {

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(MarketUser marketUser) {


        System.out.println(marketUser.getEmail());
        userRepository.save(marketUser);

        return "redirect:login";
    }



}
