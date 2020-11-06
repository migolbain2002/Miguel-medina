package com.example.PruebaBackEnd.Controller;


import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Model.CountryModel;
import com.example.PruebaBackEnd.Repository.AsesorRepository;
import com.example.PruebaBackEnd.Repository.CityRepository;
import com.example.PruebaBackEnd.Repository.ClientRepository;
import com.example.PruebaBackEnd.Repository.CountryRepository;
import com.example.PruebaBackEnd.Service.AsesorService;
import com.example.PruebaBackEnd.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/AsesorController"})
public class AsesorController {

    @Autowired
    AsesorService asesorService;
    @Autowired
    AsesorRepository asesorRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/list")
    public List<AsesorModel> list(){
        return asesorRepository.findAll();
    }
    @PostMapping ("/add")
    public AsesorModel add(@RequestBody AsesorModel asesorModel){
        return asesorRepository.save(asesorModel);
    }

    @GetMapping (path = "/getAsesorbyId/{asesorid}")
    public AsesorModel getAsesorbyId(@PathVariable("asesorid") int asesorid){
        return asesorService.listId(asesorid);
    }

    @PostMapping("/updateAsesor")
    public AsesorModel update(@RequestBody AsesorModel c){
        return asesorRepository.save(c);
    }


    @GetMapping ("/getCountries")
    public List<CountryModel>listCountries() {
        return countryRepository.findAll();
    }
}

