package com.ebiggerr.cPP.domain;

public class result {

    private String predictedPrice;

    public result (String predictedPrice){
        this.predictedPrice = predictedPrice;
    }

    public String getPredictedPrice() {
        return predictedPrice;
    }

    public void setPredictedPrice(String predictedPrice) {
        this.predictedPrice = predictedPrice;
    }
}
