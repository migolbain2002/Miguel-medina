package com.example.PruebaBackEnd.Service;

import com.example.PruebaBackEnd.Model.AsesorModel;


import java.util.List;

public interface AsesorService {
    List<AsesorModel> list();
    AsesorModel listId(int asesorid);
    AsesorModel add(AsesorModel a);
    AsesorModel edit(AsesorModel a);
    AsesorModel delete(int asesorid);
}

