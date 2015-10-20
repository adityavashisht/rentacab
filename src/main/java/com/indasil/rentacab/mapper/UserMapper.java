package com.indasil.rentacab.mapper;

import com.indasil.rentacab.security.RentCabUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by vashishta on 10/20/15.
 */
public interface UserMapper {
    public RentCabUser loadUserByUsername(@Param("username") String username);
}
