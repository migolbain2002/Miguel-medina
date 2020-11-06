package com.example.PruebaBackEnd.Service;


import com.example.PruebaBackEnd.Model.CityModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Repository.CityRepository;
import com.example.PruebaBackEnd.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientServiceImp implements ClientService{
    @Autowired
    private ClientRepository repository;
    private CityRepository cityRepository;

    @Override
    public List<ClientModel>list() {
        return repository.findAll();
    }

    @Override
    public ClientModel listId (int clientid){
        return repository.listId(clientid);
    }

    @Override
    public ClientModel add(ClientModel c) {
        return repository.save(c);
    }

    @Override
    public ClientModel edit(ClientModel c) {
        return repository.save(c);
    }

    @Override
    public ClientModel delete(int clientid) {
        return null;
    }
}
