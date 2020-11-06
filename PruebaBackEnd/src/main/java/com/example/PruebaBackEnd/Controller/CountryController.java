package com.example.PruebaBackEnd.Controller;

import com.example.PruebaBackEnd.Model.CountryModel;
import com.example.PruebaBackEnd.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/CountryController"})
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/getCountries")
    public List<CountryModel> listCountries() {
        return countryRepository.findAll();
    }
}
