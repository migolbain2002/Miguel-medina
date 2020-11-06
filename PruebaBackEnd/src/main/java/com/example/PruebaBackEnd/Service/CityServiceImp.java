package com.example.PruebaBackEnd.Service;

import com.example.PruebaBackEnd.Model.CityModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImp implements CityService{
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<CityModel> list() {
        return cityRepository.findAll();
    }
}
