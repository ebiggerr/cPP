package com.ebiggerr.cPP.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

public class submission extends request {

    //disobey convention, it is the username in the table for the name fields
    //to find the account id and put it inside the salesrecord (database table) along with car's specification
    private String name;
    private String contactNumber;

    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private BigDecimal price;

    public submission(String name,String contactNumber,BigDecimal price,
                      String car_ID, String symboling, String carName, String fueltype, String aspiration, String doornumber, String carbody, String drivewheel, String enginelocation, String wheelbase, String carlength, String carwidth, String carheight, String curbweight, String enginetype, String cylindernumber, String enginesize, String fuelsystem, String boreratio, String stroke, String compressionratio, String horsepower, String peakrpm, String citympg, String highwaympg) {
        super(car_ID, symboling, carName, fueltype, aspiration, doornumber, carbody, drivewheel, enginelocation, wheelbase, carlength, carwidth, carheight, curbweight, enginetype, cylindernumber, enginesize, fuelsystem, boreratio, stroke, compressionratio, horsepower, peakrpm, citympg, highwaympg);
        this.name=name;
        this.contactNumber=contactNumber;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
