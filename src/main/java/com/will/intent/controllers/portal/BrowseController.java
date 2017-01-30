package com.will.intent.controllers.portal;

import com.will.intent.data.session.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by marksmelendez on 1/18/17.
 */
@Controller
public class BrowseController {

    @Autowired
    MongoOperations mongo;

    @Autowired
    private Profile userProfile;



    @RequestMapping("/")
    public String index(Authentication authentication, Model model) {
        long count = mongo.getCollection("app").count();
        System.out.println("*************"+count);
        model.addAttribute("count", Long.toString(count));
        model.addAttribute("user", authentication.getName());

        return "portal/BrowseView";
    }
}
