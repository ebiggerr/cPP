package com.ebiggerr.cPP.controller.sale;

import com.ebiggerr.cPP.domain.authentication;
import com.ebiggerr.cPP.domain.request;
import com.ebiggerr.cPP.domain.submission;
import com.ebiggerr.cPP.entity.upForSales;
import com.ebiggerr.cPP.service.sales.salesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class saleController {

    private final salesService salesService;

    public saleController(salesService salesService){
        this.salesService=salesService;
    }

    /**
     *
     * @param username username of the account
     * @return list of cars that have been put up for sales no matter sold,archived,cancelled or pending (salestatus)
     */
    @GetMapping(path ="/sales/{username}")
    public ResponseEntity<List<upForSales>> returnListOfSalesPutUp(@PathVariable String username){

        return new ResponseEntity<>(salesService.getAllPutUpSalesByUsername(username), HttpStatus.OK);
    }

    /**
     *
     * @param userSubmission POST request body from the user
     * @return status of the operation successful : "Successful" ? "Failed"
     */
    @PostMapping(path = "/sales")
    public ResponseEntity<authentication> putUpANewCarIntoTheSystem(@Valid @RequestBody submission userSubmission){

        String message = null;

        //System.out.println( userSubmission.getContactNumber());
        //System.out.println( userSubmission.getPrice() );

        message = salesService.putUpNewRecord(userSubmission);

        return new ResponseEntity<authentication>( new authentication(message), HttpStatus.OK);
    }



}
