package com.ebiggerr.cPP.domain;

import javax.validation.constraints.NotBlank;

public class request {

    //private String car_ID;
    @NotBlank
    private String symboling;
    @NotBlank
    private String carName;
    @NotBlank
    private String fueltype;
    @NotBlank
    private String aspiration;
    @NotBlank
    private String doornumber;
    @NotBlank
    private String carbody;
    @NotBlank
    private String drivewheel;
    @NotBlank
    private String enginelocation;
    @NotBlank
    private String wheelbase;
    @NotBlank
    private String carlength;
    @NotBlank
    private String carwidth;
    @NotBlank
    private String carheight;
    @NotBlank
    private String curbweight;
    @NotBlank
    private String enginetype;
    @NotBlank
    private String cylindernumber;
    @NotBlank
    private String enginesize;
    @NotBlank
    private String fuelsystem;
    @NotBlank
    private String boreratio;
    @NotBlank
    private String stroke;
    @NotBlank
    private String compressionratio;
    @NotBlank
    private String horsepower;
    @NotBlank
    private String peakrpm;
    @NotBlank
    private String citympg;
    @NotBlank
    private String highwaympg;

    public request(/*String car_ID,*/ String symboling, String carName, String fueltype, String aspiration, String doornumber, String carbody, String drivewheel, String enginelocation, String wheelbase, String carlength, String carwidth, String carheight, String curbweight, String enginetype, String cylindernumber, String enginesize, String fuelsystem, String boreratio, String stroke, String compressionratio, String horsepower, String peakrpm, String citympg, String highwaympg) {
        //this.car_ID = car_ID;
        this.symboling = symboling;
        this.carName = carName;
        this.fueltype = fueltype;
        this.aspiration = aspiration;
        this.doornumber = doornumber;
        this.carbody = carbody;
        this.drivewheel = drivewheel;
        this.enginelocation = enginelocation;
        this.wheelbase = wheelbase;
        this.carlength = carlength;
        this.carwidth = carwidth;
        this.carheight = carheight;
        this.curbweight = curbweight;
        this.enginetype = enginetype;
        this.cylindernumber = cylindernumber;
        this.enginesize = enginesize;
        this.fuelsystem = fuelsystem;
        this.boreratio = boreratio;
        this.stroke = stroke;
        this.compressionratio = compressionratio;
        this.horsepower = horsepower;
        this.peakrpm = peakrpm;
        this.citympg = citympg;
        this.highwaympg = highwaympg;
    }
/*
    public String getCar_ID() {
        return car_ID;
    }

    public void setCar_ID(String car_ID) {
        this.car_ID = car_ID;
    }*/

    public String getSymboling() {
        return symboling;
    }

    public void setSymboling(String symboling) {
        this.symboling = symboling;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getAspiration() {
        return aspiration;
    }

    public void setAspiration(String aspiration) {
        this.aspiration = aspiration;
    }

    public String getDoornumber() {
        return doornumber;
    }

    public void setDoornumber(String doornumber) {
        this.doornumber = doornumber;
    }

    public String getCarbody() {
        return carbody;
    }

    public void setCarbody(String carbody) {
        this.carbody = carbody;
    }

    public String getDrivewheel() {
        return drivewheel;
    }

    public void setDrivewheel(String drivewheel) {
        this.drivewheel = drivewheel;
    }

    public String getEnginelocation() {
        return enginelocation;
    }

    public void setEnginelocation(String enginelocation) {
        this.enginelocation = enginelocation;
    }

    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    public String getCarlength() {
        return carlength;
    }

    public void setCarlength(String carlength) {
        this.carlength = carlength;
    }

    public String getCarwidth() {
        return carwidth;
    }

    public void setCarwidth(String carwidth) {
        this.carwidth = carwidth;
    }

    public String getCarheight() {
        return carheight;
    }

    public void setCarheight(String carheight) {
        this.carheight = carheight;
    }

    public String getCurbweight() {
        return curbweight;
    }

    public void setCurbweight(String curbweight) {
        this.curbweight = curbweight;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public String getCylindernumber() {
        return cylindernumber;
    }

    public void setCylindernumber(String cylindernumber) {
        this.cylindernumber = cylindernumber;
    }

    public String getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize;
    }

    public String getFuelsystem() {
        return fuelsystem;
    }

    public void setFuelsystem(String fuelsystem) {
        this.fuelsystem = fuelsystem;
    }

    public String getBoreratio() {
        return boreratio;
    }

    public void setBoreratio(String boreratio) {
        this.boreratio = boreratio;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public String getCompressionratio() {
        return compressionratio;
    }

    public void setCompressionratio(String compressionratio) {
        this.compressionratio = compressionratio;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getPeakrpm() {
        return peakrpm;
    }

    public void setPeakrpm(String peakrpm) {
        this.peakrpm = peakrpm;
    }

    public String getCitympg() {
        return citympg;
    }

    public void setCitympg(String citympg) {
        this.citympg = citympg;
    }

    public String getHighwaympg() {
        return highwaympg;
    }

    public void setHighwaympg(String highwaympg) {
        this.highwaympg = highwaympg;
    }
}
