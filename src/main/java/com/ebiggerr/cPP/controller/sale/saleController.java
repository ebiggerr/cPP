package com.ebiggerr.cPP.controller.sale;

import com.ebiggerr.cPP.domain.authentication;
import com.ebiggerr.cPP.domain.request;
import com.ebiggerr.cPP.service.sales.salesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class saleController {

    private final salesService salesService;

    public saleController(salesService salesService){
        this.salesService=salesService;
    }


    @PostMapping(path = "/sales")
    public ResponseEntity<authentication> putUpANewCarIntoTheSystem(@Valid @RequestBody request request){

        String message = null;

        message = salesService.putUpNewRecord(request);

        return new ResponseEntity<authentication>( new authentication(message), HttpStatus.OK);
    }



}
