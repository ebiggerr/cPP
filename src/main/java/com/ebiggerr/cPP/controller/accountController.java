package com.ebiggerr.cPP.controller;

import com.ebiggerr.cPP.domain.account;
import com.ebiggerr.cPP.domain.authentication;
import com.ebiggerr.cPP.service.accountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class accountController {

    private final accountService accountService;

    public accountController(accountService accountService){
        this.accountService=accountService;
    }

    /**
     *
     * @param account child class of acccount @accountRequest carrying username and password in the request body
     * @return Message of the operation successful : "Successful" ? "Unauthorized"
     */
    @PostMapping(path="/authenticate")
    public ResponseEntity<authentication> loginOfAnAccount(@RequestBody account.accountRequest account){

        String message = accountService.loginOfAnAccount(account);

        return new ResponseEntity<authentication>( new authentication(message), HttpStatus.OK);
    }

    /**
     *
     * @param account child class of account @accountRequest carrying username and password for registration purpose
     * @return Message of the operation successful : "Successful" ? "Failed"
     */
    @PostMapping
    public ResponseEntity<authentication> registrationOfAnAccount(@RequestBody account.accountRequest account){

        String message = accountService.registrationOfAnAccount(account);

        return new ResponseEntity<authentication>( new authentication(message), HttpStatus.OK);
    }

}
