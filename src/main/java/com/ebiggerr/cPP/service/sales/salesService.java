package com.ebiggerr.cPP.service.sales;

import com.ebiggerr.cPP.domain.request;
import org.springframework.stereotype.Service;

@Service
public class salesService {

    //private final salesRepo salesRepo;

    private final String SUCCESSFUL_OPERATION="Successful";
    private final String UNSUCCESSFUL_OPERATION="Failed";

    public String putUpNewRecord(request request) {




        return UNSUCCESSFUL_OPERATION;
    }
}
