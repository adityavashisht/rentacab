package com.indasil.rentacab.web;

import com.indasil.rentacab.datatable.DataTableRequest;
import com.indasil.rentacab.datatable.DataTableResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 11/9/15.
 */
@Controller
@RequestMapping("/list")
@Secured(value = {"ROLE_ADMIN","ROLE_SUPER_ADMIN"})
public class CabsController {

    /**
     *
     * @return
     */
    @RequestMapping(value = "/cabs", method = RequestMethod.GET)
    public String list() {
        return "listCabs";
    }

    /**
     *
     * @param dataTableRequest
     * @return
     */
    @RequestMapping(value = "/ajax", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataTableResponse> ajax(@RequestBody DataTableRequest dataTableRequest) {

        System.out.println(dataTableRequest);

        DataTableResponse response = new DataTableResponse();
        return new ResponseEntity<DataTableResponse>(response, HttpStatus.OK);
    }
}
