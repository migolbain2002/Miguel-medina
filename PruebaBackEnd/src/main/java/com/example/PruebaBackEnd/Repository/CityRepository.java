package com.example.PruebaBackEnd.Repository;

import com.example.PruebaBackEnd.Model.CityModel;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CityRepository extends Repository<CityModel, Integer> {

    List<CityModel>findAll();
}
