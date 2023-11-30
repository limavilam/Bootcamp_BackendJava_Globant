package com.exampleAPI.egg.springbootrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class client {

    @Id
    private Long clientId;
    private String name;
    private String email;
    private String phone;
    private String surname;


    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }
}
