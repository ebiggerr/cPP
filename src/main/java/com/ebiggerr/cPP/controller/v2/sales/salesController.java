package com.ebiggerr.cPP.controller.v2.sales;

import com.ebiggerr.cPP.domain.authentication;
import com.ebiggerr.cPP.domain.extend.submissionWithImage;
import com.ebiggerr.cPP.domain.submission;
import com.ebiggerr.cPP.service.sales.salesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/api/v2")
public class salesController {

    private final salesService salesService;

    public salesController(salesService salesService){
        this.salesService=salesService;
    }

    @PostMapping(path="/sales")
    public ResponseEntity<authentication> putUpANewCarIntoTheSystemWithImage(@Valid @ModelAttribute submissionWithImage userSubmission) throws IOException {

        String message = null;

        //System.out.println( userSubmission.getContactNumber());
        //System.out.println( userSubmission.getPrice() );

        message = salesService.putUpNewRecordWithImage(userSubmission);

        return new ResponseEntity<authentication>( new authentication(message), HttpStatus.OK);
    }
}
