package com.example.PruebaBackEnd.Service;

import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.CitationModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import com.example.PruebaBackEnd.Repository.CitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitationServiceImp implements CitationService{
    @Autowired
    private CitationRepository citationRepository;


    @Override
    public List<CitationModel> list() {
        return citationRepository.findAll();
    }

    @Override
    public CitationModel listId(int citationid) {
        return citationRepository.listId(citationid);
    }

    @Override
    public CitationModel add(CitationModel c) {
        return citationRepository.save(c);
    }

    @Override
    public CitationModel edit(CitationModel c) {
        return citationRepository.save(c);
    }

    @Override
    public CitationModel delete(int citationid) {
        return null;
    }

    @Override
    public ClientModel listClientIdentification(String identification) {
        return citationRepository.listClientIdentification(identification);
    }

    @Override
    public AsesorModel listAsesorIdentification(String identification) {
        return citationRepository.listAsesorIdentification(identification);
    }
}
