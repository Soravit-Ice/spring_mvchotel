package com.mvc.mvchotel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonProperty("RID")
    private Long rid ;

    @JsonProperty("Firstname")
    private String firstname;

    @JsonProperty("Lastname")
    private String lastname;

    @JsonProperty("Status")
    private String status;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
