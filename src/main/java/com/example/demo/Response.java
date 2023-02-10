package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;


public class Response {

    private String token;
    private String adminName;
    private String mobileNumber;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAdminName() {
        return adminName;

    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
