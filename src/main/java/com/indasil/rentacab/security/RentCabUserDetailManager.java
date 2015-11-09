package com.indasil.rentacab.security;

import com.indasil.rentacab.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;




/**
 * Created by vashishta on 10/20/15.
 */
@Component("rentCabUserDetailManager")
public class RentCabUserDetailManager implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public RentCabUser loadUserByUsername(String username) throws UsernameNotFoundException {

       return userMapper.loadUserByUsername(username);

    }
}
