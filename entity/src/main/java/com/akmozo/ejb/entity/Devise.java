
package com.akmozo.ejb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "getAllDevises", query = "Select d From Devise d")
public class Devise implements Serializable {

    @Id
    private String code;    // EUR, USD, TND
    private String monnaie; // Euro, Dollar US, Dinar Tunisien
    private Double taux;    // % dollar
    
    @OneToMany(mappedBy = "devise") //, fetch = FetchType.EAGER)
    private List<Pays> pays;    
    
    public Devise(String code, String monnaie, Double taux) {
        this.code = code;
        this.monnaie = monnaie;
        this.taux = taux;
    }

    public Devise() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMonnaie() {
        return monnaie;
    }

    public void setMonnaie(String monnaie) {
        this.monnaie = monnaie;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public List<Pays> getPays() {
        return pays;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
    }
    
}
