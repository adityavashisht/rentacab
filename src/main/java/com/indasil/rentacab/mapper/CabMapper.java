package com.indasil.rentacab.mapper;

import com.indasil.rentacab.datatable.DataTablePageCriteria;
import com.indasil.rentacab.domain.Cab;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by vashishta on 11/9/15.
 */
public interface CabMapper {

    List<Cab> getAll(@Param("pageCriteria") DataTablePageCriteria pageCriteria);
}
