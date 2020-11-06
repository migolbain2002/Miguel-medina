package com.example.PruebaBackEnd.Repository;


import com.example.PruebaBackEnd.Model.CountryModel;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CountryRepository extends Repository<CountryModel, Integer> {
    List<CountryModel>findAll();
}
