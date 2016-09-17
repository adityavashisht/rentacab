package com.indasil.rentacab.service;

import com.indasil.rentacab.datatable.DataTablePageCriteria;
import com.indasil.rentacab.domain.Cab;
import com.indasil.rentacab.mapper.CabMapper;
import com.indasil.rentacab.mapper.UserMapper;
import com.indasil.rentacab.security.RentCabUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;


/**
 * Created by vashishta on 11/10/15.
 */
@Component
public class DataTableManager {

    @Autowired
    private CabMapper cabMapper;

    @Autowired
    private UserMapper userMapper;




    private String toLowerCase(String searchFilter) {
        String lowerCase = StringUtils.hasText(searchFilter) ? "%" + searchFilter.toLowerCase() + "%" : null;
        return lowerCase;
    }



    public Page<Cab> getAll(DataTablePageCriteria pageCriteria, String searchFilter) {
        List<Cab> cabList = cabMapper.getAll(pageCriteria, toLowerCase(searchFilter));
        int count = 0;
        for (Cab cab : cabList) {
            count = cab.getTotal();
            break;
        }
        return new PageImpl<Cab>(cabList, pageCriteria.getPageRequest(), count);
    }

    /**
     *
     * @param pageCriteria
     * @param searchFilter
     * @return
     */
    public Page<RentCabUser> getAllUsers(DataTablePageCriteria pageCriteria, String searchFilter) {
        List<RentCabUser> itemList = userMapper.getAll(pageCriteria, toLowerCase(searchFilter));
        int count = 0;
        for (RentCabUser user : itemList) {
            count = user.getTotal();
            break;
        }
        return new PageImpl<RentCabUser>(itemList, pageCriteria.getPageRequest(), count);
    }





}
