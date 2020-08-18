package com.example.tuto_gestion_de_stock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class CommandeClient implements Serializable {

    @Id //pour specifier que c'est l'id
    @GeneratedValue //pour dire que la valeur est generer automatiquement
    private Long IdCommandeClient ;

    public Long getIdCommandeClient() {
        return IdCommandeClient;
    }

    public void setIdCommandeClient(Long idCommandeClient) {
        IdCommandeClient = idCommandeClient;
    }
}
