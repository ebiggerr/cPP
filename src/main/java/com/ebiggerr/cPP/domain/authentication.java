package com.ebiggerr.cPP.domain;

public class authentication {

    private String status;

    public authentication(String status){
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
