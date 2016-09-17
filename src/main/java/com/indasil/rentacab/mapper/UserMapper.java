package com.indasil.rentacab.mapper;

import com.indasil.rentacab.datatable.DataTablePageCriteria;
import com.indasil.rentacab.security.RentCabUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by vashishta on 10/20/15.
 */
public interface UserMapper {

    RentCabUser loadUserByUsername(@Param("username") String username);

    /**
     * Get a list of sorted/paginated users based on client request
     *
     * @param pageCriteria
     * @param search
     * @return
     */
    List<RentCabUser> getAll(@Param("pageCriteria") DataTablePageCriteria pageCriteria,
                             @Param("searchFilter") String search);
}
