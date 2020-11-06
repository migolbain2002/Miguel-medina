package com.example.PruebaBackEnd.Controller;


import ch.qos.logback.core.net.server.Client;
import com.example.PruebaBackEnd.Model.CityModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Model.CountryModel;
import com.example.PruebaBackEnd.Repository.CityRepository;
import com.example.PruebaBackEnd.Repository.ClientRepository;
import com.example.PruebaBackEnd.Repository.CountryRepository;
import com.example.PruebaBackEnd.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;


@CrossOrigin(origins = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/ClientController"})
public class ClientController {
    @Autowired
    ClientService clientService;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;

    @GetMapping ("/list")
    public List<ClientModel>list(){
        return clientRepository.findAll();
    }
    @PostMapping ("/add")
    public ClientModel add(@RequestBody ClientModel clientModel){
        return clientRepository.save(clientModel);
    }

    @GetMapping (path = "/getClientbyId/{clientid}")
    public ClientModel getClientbyId(@PathVariable("clientid") int clientid){
        return clientService.listId(clientid);
    }

    @PostMapping("/updateClient")
    public ClientModel update(@RequestBody ClientModel c){
        return clientRepository.save(c);
    }


    @GetMapping ("/getCountries")
    public List<CountryModel>listCountries() {
        return countryRepository.findAll();
    }
}
