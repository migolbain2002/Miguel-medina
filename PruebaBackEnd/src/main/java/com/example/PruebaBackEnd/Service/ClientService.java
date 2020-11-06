package com.example.PruebaBackEnd.Service;



import com.example.PruebaBackEnd.Model.ClientModel;

import java.util.List;

public interface ClientService {
    List<ClientModel> list();
    ClientModel listId(int clientid);
    ClientModel add(ClientModel c);
    ClientModel edit(ClientModel c);
    ClientModel delete(int clientid);
}
