package com.ebiggerr.cPP.controller;

import com.ebiggerr.cPP.domain.request;
import com.ebiggerr.cPP.domain.result;
import com.ebiggerr.cPP.service.wekaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class mainController {

    private final wekaService wekaService=new wekaService();

    private final String DEFAULT_SOURCE="csv";

    /**
     *
     * @param request request body to the endpoint, serialize
     * @return prediction result in [double] wrapped in @result class
     * @throws Exception Catch possible I/O Exception, and other possible exception
     */
    @PostMapping(path="/prediction", consumes = "application/json", produces = "application/json")
    public ResponseEntity<result> returnPrediction(@Valid @RequestBody request request) throws Exception {

        return new ResponseEntity<>(new result(String.valueOf( wekaService.generateResultFromRequestUsingLR(request,DEFAULT_SOURCE) )), HttpStatus.OK);

    }
}
