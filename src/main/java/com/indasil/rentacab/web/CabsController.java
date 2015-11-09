package com.indasil.rentacab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 11/9/15.
 */
@Controller
@RequestMapping("/list")
public class CabsController {

    @RequestMapping(value="/cabs", method = RequestMethod.GET)
    public String list() {
        return "listCabs";
    }
}
