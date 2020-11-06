package com.example.PruebaBackEnd.Controller;

import com.example.PruebaBackEnd.Model.CityModel;
import com.example.PruebaBackEnd.Repository.CityRepository;
import com.example.PruebaBackEnd.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/CityController"})
public class CityController {

    @Autowired
    CityRepository cityRepository;
    CityService cityService;

    @GetMapping("/getCities")
    public List<CityModel>listCities() {
        return cityRepository.findAll();
    }
}
