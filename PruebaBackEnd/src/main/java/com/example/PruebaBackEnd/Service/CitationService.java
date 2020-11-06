package com.example.PruebaBackEnd.Service;

import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.CitationModel;
import com.example.PruebaBackEnd.Model.ClientModel;

import java.util.List;

public interface CitationService {
    List<CitationModel> list();
    ClientModel listClientIdentification(String identification);
    AsesorModel listAsesorIdentification(String identification);
    CitationModel listId(int citationid);
    CitationModel add(CitationModel c);
    CitationModel edit(CitationModel c);
    CitationModel delete(int citationid);
}
