
package com.akmozo.ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@NamedQuery(name = "getAllDevises", query = "Select d From Devise d")
public class Pays  implements Serializable {

    @Id
    private String codePays;
    private String nom;
    private String capitale;
    
    @ManyToOne
    @JoinColumn(name = "code_devise")
    private Devise devise;

    public Pays(String codePays, String nom, String capitale) {
        this.codePays = codePays;
        this.nom = nom;
        this.capitale = capitale;
    }

    public Pays() {
    }
    
    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }
    
    
    
}
