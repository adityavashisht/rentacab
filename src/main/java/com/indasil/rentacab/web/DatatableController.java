package com.indasil.rentacab.web;

import com.indasil.rentacab.datatable.DataTablePageCriteria;
import com.indasil.rentacab.datatable.DataTableRequest;
import com.indasil.rentacab.datatable.DataTableResponse;
import com.indasil.rentacab.domain.Cab;
import com.indasil.rentacab.security.RentCabUser;
import com.indasil.rentacab.service.DataTableManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 9/17/16.
 */
@Controller
@RequestMapping(value = "/datatable")
public class DatatableController {


    @Autowired
    private DataTableManager dataTableManager;

    /**
     * @param dataTableRequest
     * @return
     */
    @RequestMapping(value = "/cab", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataTableResponse> ajax(@RequestBody DataTableRequest dataTableRequest) {

        DataTablePageCriteria pageCriteria = GridHelper.forSortingAndPaging(dataTableRequest);

        // Fetch result as a "single" page of Cab items
        Page<Cab> page = dataTableManager.getAll(pageCriteria, dataTableRequest.getSearch().getValue());

        // Extract response from Page and convert to a Datatable happy format
        DataTableResponse dataTableResponse = GridHelper.extract(page);

        return new ResponseEntity<DataTableResponse>(dataTableResponse, HttpStatus.OK);
    }


    /**
     * @param dataTableRequest
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataTableResponse> users(@RequestBody DataTableRequest dataTableRequest) {

        DataTablePageCriteria pageCriteria = GridHelper.forSortingAndPaging(dataTableRequest);

        // Fetch result as a "single" page of Cab items
        Page<RentCabUser> page = dataTableManager.getAllUsers(pageCriteria, dataTableRequest.getSearch().getValue());

        // Extract response from Page and convert to a Datatable happy format
        DataTableResponse dataTableResponse = GridHelper.extract(page);

        return new ResponseEntity<DataTableResponse>(dataTableResponse, HttpStatus.OK);
    }


}
