package com.ebiggerr.cPP.controller;

import com.ebiggerr.cPP.domain.request;
import com.ebiggerr.cPP.domain.result;
import com.ebiggerr.cPP.service.wekaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    private final wekaService wekaService=new wekaService();

    private final String DEFAULT_SOURCE="csv";

    /**
     *
     * @param request request body to the endpoint, serialize
     * @return prediction result in [double] wrapped in @result class
     * @throws Exception Catch possible I/O Exception, and other possible exception
     */
    @GetMapping(path="/v1/api/prediction")
    public ResponseEntity<result> returnPrediction(@RequestBody request request) throws Exception {

        return new ResponseEntity<>(new result(String.valueOf( wekaService.generateResultFromRequestUsingLR(request,DEFAULT_SOURCE) )), HttpStatus.OK);

    }
}
