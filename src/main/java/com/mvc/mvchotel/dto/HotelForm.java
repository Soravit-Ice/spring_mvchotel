package com.mvc.mvchotel.dto;


public class HotelForm {

    private String status ;
    private Long ridroomReady;
    private String firstname;
    private String lastname;




    public HotelForm(Long ridroomReady, String status, String firstname , String lastname) {
        this.ridroomReady = ridroomReady;
        this.status = status;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRidroomReady() {
        return ridroomReady;
    }

    public void setRidroomReady(Long ridroomReady) {
        this.ridroomReady = ridroomReady;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
