package com.ebiggerr.cPP.entity;

import com.ebiggerr.cPP.enumclass.PostgreSQLEnumType;
import com.ebiggerr.cPP.enumclass.status;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name="salesrecord")
@TypeDef(
        name = "pgsql_enum",
        typeClass = PostgreSQLEnumType.class
)
public class upForSales {

    @Id
    private long id;

    private String symboling;

    private String carname;

    private String fueltype;

    private String aspiration;

    private String doornumber;

    private String carbody;

    private String drivewheel;

    private String enginelocation;

    private String wheelbase;

    private String carlength;

    private String carwidth;

    private String carheight;

    private String curbweight;

    private String enginetype;

    private String cylindernumber;

    private String enginesize;

    private String fuelsystem;

    private String boreratio;

    private String stroke;

    private String compressionratio;

    private String horsepower;

    private String peakrpm;

    private String citympg;

    private String highwaympg;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "salesstatus")
    @Type( type = "pgsql_enum" )
    private status status;

    @Column(name="price", nullable=true)
    private BigDecimal price;

    private long accountid;

    @Column(name="timestampadded", nullable=true)
    private LocalDateTime timestamp;

    public upForSales(long id, String symboling, String carname, String fueltype, String aspiration, String doornumber, String carbody, String drivewheel, String enginelocation, String wheelbase, String carlength, String carwidth, String carheight, String curbweight, String enginetype, String cylindernumber, String enginesize, String fuelsystem, String boreratio, String stroke, String compressionratio, String horsepower, String peakrpm, String citympg, String highwaympg, status status, BigDecimal price, long accountid, LocalDateTime timestamp) {
        this.id = id;
        this.symboling = symboling;
        this.carname = carname;
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
        this.status = status;
        this.price = price;
        this.accountid = accountid;
        this.timestamp = timestamp;
    }

    public upForSales(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSymboling() {
        return symboling;
    }

    public void setSymboling(String symboling) {
        this.symboling = symboling;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getAccountid() {
        return accountid;
    }

    public void setAccountid(long accountid) {
        this.accountid = accountid;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
}
