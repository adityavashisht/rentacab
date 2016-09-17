package com.indasil.rentacab.web;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 11/9/15.
 */
@Controller
@RequestMapping("/user")
@Secured(value = {"ROLE_ADMIN", "ROLE_SUPER_ADMIN"})
public class UserController {

    /**
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "listUsers";
    }





}
