package com.example.PruebaBackEnd.Repository;

import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AsesorRepository extends Repository<AsesorModel, Integer> {
    List<AsesorModel> findAll();
    AsesorModel save (AsesorModel c);
    void delete (AsesorModel c);
    @Query("SELECT a FROM AsesorModel a WHERE a.asesorid = :asesorid")
    AsesorModel listId(@Param("asesorid") int asesorid);
}
