package com.ebiggerr.cPP.domain.extend;

import com.ebiggerr.cPP.domain.submission;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public class submissionWithImage extends submission {

    private MultipartFile image;

    public submissionWithImage(String name, String contactNumber, BigDecimal price, String symboling, String carName, String fueltype, String aspiration, String doornumber, String carbody, String drivewheel, String enginelocation, String wheelbase, String carlength, String carwidth, String carheight, String curbweight, String enginetype, String cylindernumber, String enginesize, String fuelsystem, String boreratio, String stroke, String compressionratio, String horsepower, String peakrpm, String citympg, String highwaympg) {
        super(name, contactNumber, price, symboling, carName, fueltype, aspiration, doornumber, carbody, drivewheel, enginelocation, wheelbase, carlength, carwidth, carheight, curbweight, enginetype, cylindernumber, enginesize, fuelsystem, boreratio, stroke, compressionratio, horsepower, peakrpm, citympg, highwaympg);
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
