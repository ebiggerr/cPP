package com.ebiggerr.cPP.service;

import com.ebiggerr.cPP.domain.account;
import com.ebiggerr.cPP.repository.accountRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class accountService {

    private final String SUCCESSFUL_LOGIN="Successful";
    private final String UNSUCCESSFUL_LOGIN="Unauthorized";
    private final String UNSUCCESSFUL_REGISTER="FAILED";

    private final accountRepo accountRepo;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private Logger logger = LoggerFactory.getLogger(accountService.class);

    public accountService(accountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    /**
     *
     * @param account account object carrying username and password
     * @return [String] status of the operation successful : "Successful" ? "Unauthorized"
     */
    public String loginOfAnAccount(account.accountRequest account){

        Optional<account.accountRequest> retrievedAccount = accountRepo.getByUsername( account.getUsername() );

        if( retrievedAccount.isPresent() ) {
            boolean matchPassword = passwordEncoder.matches(account.getPassword(), retrievedAccount.get().getPassword());

            if(matchPassword){
                logger.info( "[ACCOUNT] with Username of [ " + account.getUsername() + " ] logged in.");
                return SUCCESSFUL_LOGIN;
            }
            else{
                return UNSUCCESSFUL_LOGIN;
            }
        }
        else {
            return UNSUCCESSFUL_LOGIN;
        }
    }

    /**
     *
     * @param account account object carrying username and password for registration
     * @return [String] status of the operation successful : "Successful" ? "Failed"
     */
    public String registrationOfAnAccount(account.accountRequest account) {




        return UNSUCCESSFUL_REGISTER;
    }
}
