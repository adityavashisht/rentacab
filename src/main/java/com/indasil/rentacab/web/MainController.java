package com.indasil.rentacab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 10/14/15.
 */
@Controller

public class MainController {

    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
