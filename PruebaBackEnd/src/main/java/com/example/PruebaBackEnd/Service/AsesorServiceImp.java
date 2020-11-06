package com.example.PruebaBackEnd.Service;

import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Repository.AsesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AsesorServiceImp implements AsesorService{

    @Autowired
    private AsesorRepository asesorRepository;

    @Override
    public List<AsesorModel> list() {
        return asesorRepository.findAll();
    }

    @Override
    public AsesorModel listId(int asesorid) {
        return asesorRepository.listId(asesorid);
    }

    @Override
    public AsesorModel add(AsesorModel a) {
        return asesorRepository.save(a);
    }

    @Override
    public AsesorModel edit(AsesorModel a) {
        return asesorRepository.save(a);
    }

    @Override
    public AsesorModel delete(int asesorid) {
        return null;
    }
}
