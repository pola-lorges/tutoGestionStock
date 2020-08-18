package com.example.tuto_gestion_de_stock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class Utilisateur implements Serializable {

    @Id //pour specifier que c'est l'id
    @GeneratedValue //pour dire que la valeur est generer automatiquement
    private Long IdUtilisateur ;

    public Long getIdUtilisateur() {
        return IdUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        IdUtilisateur = idUtilisateur;
    }
}
