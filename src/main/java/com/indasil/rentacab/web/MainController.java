package com.indasil.rentacab.web;

import com.indasil.rentacab.security.CurrentUser;
import com.indasil.rentacab.security.RentCabUser;
import com.indasil.rentacab.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 10/14/15.
 */
@Controller
@Secured(value = {"ROLE_ADMIN","ROLE_SUPER_ADMIN"})
public class MainController {

    @Autowired
    private MainService mainService;

//    @Secured(value = "ROLE_ADMIN")
    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String main(@CurrentUser RentCabUser user) {

        System.out.println(user.getUsername());

        mainService.rent();
        return "main";
    }

    @RequestMapping(value="/second", method = RequestMethod.GET)
    public String second() {
        return "second";
    }
}
