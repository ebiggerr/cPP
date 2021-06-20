package com.ebiggerr.cPP.service.sales;

import com.ebiggerr.cPP.domain.submission;
import com.ebiggerr.cPP.entity.upForSales;
import com.ebiggerr.cPP.enumclass.status;
import com.ebiggerr.cPP.repository.accountRepo;
import com.ebiggerr.cPP.repository.salesRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class salesService {

    private final salesRepo salesRepo;
    private final accountRepo accountRepo;

    private final String SUCCESSFUL_OPERATION="Successful";
    private final String UNSUCCESSFUL_OPERATION="Failed";

    public salesService(salesRepo salesRepo, accountRepo accountRepo){
        this.salesRepo=salesRepo;
        this.accountRepo=accountRepo;
    }

    public String putUpNewRecord(submission userSubmission) {

        Optional<Long> accountIDFromDatabase = accountRepo.getIdByUsername( userSubmission.getName() );
        long accountid;
        if( accountIDFromDatabase.isPresent() ){
            accountid = accountIDFromDatabase.get();
        }
        else{
            return UNSUCCESSFUL_OPERATION;
        }
        upForSales newSales = new upForSales(
                Long.parseLong( userSubmission.getCar_ID() ) ,
                userSubmission.getSymboling(),
                userSubmission.getName(),
                userSubmission.getFueltype(),
                userSubmission.getAspiration(),
                userSubmission.getDoornumber(),
                userSubmission.getCarbody(),
                userSubmission.getDrivewheel(),
                userSubmission.getEnginelocation(),
                userSubmission.getWheelbase(),
                userSubmission.getCarlength(),
                userSubmission.getCarwidth(),
                userSubmission.getCarheight(),
                userSubmission.getCurbweight(),
                userSubmission.getEnginetype(),
                userSubmission.getCylindernumber(),
                userSubmission.getEnginesize(),
                userSubmission.getFuelsystem(),
                userSubmission.getBoreratio(),
                userSubmission.getStroke(),
                userSubmission.getCompressionratio(),
                userSubmission.getHorsepower(),
                userSubmission.getPeakrpm(),
                userSubmission.getCitympg(),
                userSubmission.getHighwaympg(),
                status.PENDING,
                userSubmission.getPrice(),
                accountid,
                LocalDateTime.now()
        );

        try {
            salesRepo.save(newSales);
        }catch (Exception e){
            return UNSUCCESSFUL_OPERATION;
        }

        return SUCCESSFUL_OPERATION;
    }

    public List<upForSales> getAllPutUpSalesByUsername(String username) {

        Optional<Long> accountIDFromDatabase = accountRepo.getIdByUsername( username );
        long accountID;
        if( accountIDFromDatabase.isPresent()){
            accountID= accountIDFromDatabase.get();
        }
        else{
            return null;
        }
        Optional<List<upForSales>> list = salesRepo.getAllOfAnId( accountID );

        return list.orElse(null);
    }
}
