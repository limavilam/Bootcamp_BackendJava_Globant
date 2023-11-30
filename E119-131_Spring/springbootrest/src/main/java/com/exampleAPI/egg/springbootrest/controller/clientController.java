package com.exampleAPI.egg.springbootrest.controller;

import ch.qos.logback.core.net.server.Client;
import com.exampleAPI.egg.springbootrest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class clientController {

    private final ClientService clientService;

    @Autowired
    public clientController(ClientService clientService){
        this.clientService = clientService;
    }


    @GetMapping("/one") //localhost:8081/client/one)
    public ResponseEntity<String> getOneClient(){
        String client = clientService.getOneClient();
        return new ResponseEntity<>("Soy un nuevo cliente", HttpStatus.OK);
    }



}
