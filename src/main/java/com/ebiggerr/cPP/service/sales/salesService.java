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

        //get accountid using username in the system
        Optional<Long> accountIDFromDatabase = accountRepo.getIdByUsername( userSubmission.getName() );
        long maxIDIncrement = salesRepo.getMaxID()+1;
        long accountid;
        if( accountIDFromDatabase.isPresent() ){
            accountid = accountIDFromDatabase.get();
        }
        else{
            return UNSUCCESSFUL_OPERATION;
        }
        upForSales newSales = new upForSales(
                maxIDIncrement,
                Long.parseLong( userSubmission.getSymboling() ),
                userSubmission.getCarName(),
                userSubmission.getFueltype(),
                userSubmission.getAspiration(),
                userSubmission.getDoornumber(),
                userSubmission.getCarbody(),
                userSubmission.getDrivewheel(),
                userSubmission.getEnginelocation(),
                Double.parseDouble(userSubmission.getWheelbase() ),
                Double.parseDouble( userSubmission.getCarlength() ),
                Double.parseDouble( userSubmission.getCarwidth() ),
                Double.parseDouble(userSubmission.getCarheight() ),
                Long.parseLong( userSubmission.getCurbweight() ),
                userSubmission.getEnginetype(),
                userSubmission.getCylindernumber(),
                Long.parseLong( userSubmission.getEnginesize() ),
                userSubmission.getFuelsystem(),
                Double.parseDouble( userSubmission.getBoreratio() ),
                Double.parseDouble( userSubmission.getStroke()) ,
                Double.parseDouble( userSubmission.getCompressionratio() ),
                Long.parseLong(  userSubmission.getHorsepower() ),
                Long.parseLong( userSubmission.getPeakrpm() ),
                Long.parseLong( userSubmission.getCitympg() ),
                Long.parseLong( userSubmission.getHighwaympg() ),
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

    public List<upForSales> getAllPutUpPendingSalesByUsername(String username) {

        Optional<Long> accountIDFromDatabase = accountRepo.getIdByUsername( username );
        long accountID;
        if( accountIDFromDatabase.isPresent()){
            accountID= accountIDFromDatabase.get();
        }
        else{
            return null;
        }
        Optional<List<upForSales>> pendingSalesList = salesRepo.getByAccountidIsAndStatusIs( accountID );

        return pendingSalesList.orElse(null);
    }


}
