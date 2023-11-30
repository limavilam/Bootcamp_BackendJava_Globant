package com.exampleAPI.egg.springbootrest.service.impl;

import org.springframework.stereotype.Service;

@Service
public class ClientService implements com.exampleAPI.egg.springbootrest.service.ClientService {
    @Override
    public String getOneClient() {

        String client = "{'name':'Lina', 'surname':'Avila'}";
        return null;
    }
}
