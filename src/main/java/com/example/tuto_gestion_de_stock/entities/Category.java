package com.example.tuto_gestion_de_stock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity

public class Category implements Serializable {

    @Id //pour specifier que c'est l'id
    @GeneratedValue //pour dire que la valeur est generer automatiquement
    private Long IdCategory ;

    private Long CodeCategory ;

    private String DesigntionCategory;

    @OneToMany(mappedBy = "category")
    private List<Article> articles ;

    public Long getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(Long idCategory) {
        IdCategory = idCategory;
    }

    public Long getCodeCategory() {
        return CodeCategory;
    }

    public void setCodeCategory(Long codeCategory) {
        CodeCategory = codeCategory;
    }

    public String getDesigntionCategory() {
        return DesigntionCategory;
    }

    public void setDesigntionCategory(String designtionCategory) {
        DesigntionCategory = designtionCategory;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
