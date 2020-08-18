package com.example.tuto_gestion_de_stock.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Article implements Serializable {

    @Id //pour specifier que c'est l'id
    @GeneratedValue //pour dire que la valeur est generer automatiquement
    private Long IdArticle ;

    private String CodeArticle ;

    private String DesignationArticle;

    private BigDecimal PrixUnitaireHT ;

    private BigDecimal TauxTVA;

    private BigDecimal PrixUnitaireTTC ;

    private String Photo ;

    @ManyToOne
    @JoinColumn(name = "IdCategory")
    private Category category ;

    public Long getIdArticle() {
        return IdArticle;
    }

    public void setIdArticle(Long idArticle) {
        IdArticle = idArticle;
    }

    public String getCodeArticle() {
        return CodeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        CodeArticle = codeArticle;
    }

    public String getDesignationArticle() {
        return DesignationArticle;
    }

    public void setDesignationArticle(String designationArticle) {
        DesignationArticle = designationArticle;
    }

    public BigDecimal getPrixUnitaireHT() {
        return PrixUnitaireHT;
    }

    public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
        PrixUnitaireHT = prixUnitaireHT;
    }

    public BigDecimal getTauxTVA() {
        return TauxTVA;
    }

    public void setTauxTVA(BigDecimal tauxTVA) {
        TauxTVA = tauxTVA;
    }

    public BigDecimal getPrixUnitaireTTC() {
        return PrixUnitaireTTC;
    }

    public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
        PrixUnitaireTTC = prixUnitaireTTC;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
