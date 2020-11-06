package com.example.PruebaBackEnd.Repository;

import com.example.PruebaBackEnd.Model.AsesorModel;
import com.example.PruebaBackEnd.Model.CitationModel;
import com.example.PruebaBackEnd.Model.ClientModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CitationRepository extends Repository<CitationModel, Integer> {
    List<CitationModel> findAll();
    CitationModel save (CitationModel c);
    void delete (CitationModel c);

    @Query("SELECT c FROM CitationModel c WHERE c.citationid = :citationid")
    CitationModel listId(@Param("citationid") int citationid);

    @Query("SELECT c FROM ClientModel c WHERE c.identification = :identification")
    ClientModel listClientIdentification(@Param("identification") String identification);

    @Query("SELECT c FROM AsesorModel c WHERE c.identification = :identification")
    AsesorModel listAsesorIdentification(@Param("identification") String identification);

    @Query("select tc from CitationModel as tc inner join AsesorModel as ta on  tc.asesorid.asesorid = ta.asesorid  where ta.identification = :identification and tc.status = 'Activa'")
    List<CitationModel> getCitationsFromAsesor(@Param("identification") String identification);


}
