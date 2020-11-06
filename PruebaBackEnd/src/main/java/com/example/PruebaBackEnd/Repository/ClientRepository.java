package com.example.PruebaBackEnd.Repository;

import java.io.Serializable;
import java.util.List;


import com.example.PruebaBackEnd.Model.ClientModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends Repository<ClientModel, Integer> {
    List<ClientModel>findAll();
    ClientModel save (ClientModel c);
    void delete (ClientModel c);
   @Query("SELECT c FROM ClientModel c WHERE c.clientid = :clientid")
    ClientModel listId(@Param("clientid") int clientid);

}
