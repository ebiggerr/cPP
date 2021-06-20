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

    private long symboling;

    private String carname;

    private String fueltype;

    private String aspiration;

    private String doornumber;

    private String carbody;

    private String drivewheel;

    private String enginelocation;

    private double wheelbase;

    private double carlength;

    private double carwidth;

    private double carheight;

    private long curbweight;

    private String enginetype;

    private String cylindernumber;

    private long enginesize;

    private String fuelsystem;

    private double boreratio;

    private double stroke;

    private double compressionratio;

    private long horsepower;

    private long peakrpm;

    private long citympg;

    private long highwaympg;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "salesstatus")
    @Type( type = "pgsql_enum" )
    private status status;

    @Column(name="price", nullable=true)
    private BigDecimal price;

    private long accountid;

    @Column(name="timestampadded", nullable=true)
    private LocalDateTime timestamp;

    public upForSales(long id, long symboling, String carname, String fueltype, String aspiration, String doornumber,
                      String carbody, String drivewheel, String enginelocation, double wheelbase, double carlength,
                      double carwidth, double carheight, long curbweight, String enginetype, String cylindernumber,
                      long enginesize, String fuelsystem, double boreratio,  double stroke, double compressionratio,
                      long horsepower, long peakrpm, long citympg, long highwaympg, status status, BigDecimal price,
                      long accountid, LocalDateTime timestamp) {
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

    public long getSymboling() {
        return symboling;
    }

    public void setSymboling(long symboling) {
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

    public double getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(double wheelbase) {
        this.wheelbase = wheelbase;
    }

    public double getCarlength() {
        return carlength;
    }

    public void setCarlength(double carlength) {
        this.carlength = carlength;
    }

    public double getCarwidth() {
        return carwidth;
    }

    public void setCarwidth(double carwidth) {
        this.carwidth = carwidth;
    }

    public double getCarheight() {
        return carheight;
    }

    public void setCarheight(double carheight) {
        this.carheight = carheight;
    }

    public long getCurbweight() {
        return curbweight;
    }

    public void setCurbweight(long curbweight) {
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

    public long getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(long enginesize) {
        this.enginesize = enginesize;
    }

    public String getFuelsystem() {
        return fuelsystem;
    }

    public void setFuelsystem(String fuelsystem) {
        this.fuelsystem = fuelsystem;
    }

    public double getBoreratio() {
        return boreratio;
    }

    public void setBoreratio(double boreratio) {
        this.boreratio = boreratio;
    }

    public double getStroke() {
        return stroke;
    }

    public void setStroke(double stroke) {
        this.stroke = stroke;
    }

    public double getCompressionratio() {
        return compressionratio;
    }

    public void setCompressionratio(double compressionratio) {
        this.compressionratio = compressionratio;
    }

    public long getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(long horsepower) {
        this.horsepower = horsepower;
    }

    public long getPeakrpm() {
        return peakrpm;
    }

    public void setPeakrpm(long peakrpm) {
        this.peakrpm = peakrpm;
    }

    public long getCitympg() {
        return citympg;
    }

    public void setCitympg(long citympg) {
        this.citympg = citympg;
    }

    public long getHighwaympg() {
        return highwaympg;
    }

    public void setHighwaympg(long highwaympg) {
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
