package com.example.PruebaBackEnd.Controller;


import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.CitationModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Model.CountryModel;
import com.example.PruebaBackEnd.Repository.CitationRepository;
import com.example.PruebaBackEnd.Repository.CityRepository;
import com.example.PruebaBackEnd.Repository.ClientRepository;
import com.example.PruebaBackEnd.Repository.CountryRepository;
import com.example.PruebaBackEnd.Service.CitationService;
import com.example.PruebaBackEnd.Service.CityService;
import com.example.PruebaBackEnd.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping({"/CitationController"})
public class CitationController {
    @Autowired
    CitationService citationService;
    @Autowired
    CitationRepository citationRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/list")
    public List<CitationModel> list(){
        return citationRepository.findAll();
    }
    @PostMapping ("/add")
    public CitationModel add(@RequestBody CitationModel citationModel){
        return citationRepository.save(citationModel);
    }

    @GetMapping (path = "/getCitationbyId/{citationid}")
    public CitationModel getCitationbyId(@PathVariable("citationid") int citationid){
        return citationService.listId(citationid);
    }

    @PostMapping("/updateCitation")
    public CitationModel update(@RequestBody CitationModel c){
        return citationRepository.save(c);
    }


    @GetMapping ("/getCountries")
    public List<CountryModel>listCountries() {
        return countryRepository.findAll();

    }

    @GetMapping (path = "/getClientbyIdentification/{identification}")
    public ClientModel getCitationbyIdentification(@PathVariable("identification") String identification){
        return citationService.listClientIdentification(identification);
    }

    @GetMapping (path = "/getAsesorbyIdentification/{identification}")
    public AsesorModel getAsesorbyIdentification(@PathVariable("identification") String identification){
        return citationService.listAsesorIdentification(identification);
    }

    @GetMapping (path = "/getCitationsbyAsesor/{identification}")
    public List<CitationModel> getCitationsbyAsesor(@PathVariable("identification") String identification){
        return citationRepository.getCitationsFromAsesor(identification);
    }

}
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<