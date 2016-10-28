
package com.akmozo.app.web;

import com.akmozo.ejb.api.IServiceDevise;
import com.akmozo.ejb.entity.Devise;
import com.akmozo.ejb.entity.Pays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class DeviseMBean {
    
    @EJB // == @Autowired
    private IServiceDevise serviceDevise;
    
    private String codeDevise;
    private Devise devise;
    private Devise newDevise;
    private List<Devise> devises;
    private List<Pays> pays;

    public DeviseMBean() {
    }
    @PostConstruct
    protected void init(){
        newDevise = new Devise();
    }

    public IServiceDevise getServiceDevise() {
        return serviceDevise;
    }

    public void setServiceDevise(IServiceDevise serviceDevise) {
        this.serviceDevise = serviceDevise;
    }

    public Devise getNewDevise() {
        return newDevise;
    }

    public void setNewDevise(Devise newDevise) {
        this.newDevise = newDevise;
    }

    public String getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(String codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }
    
    public String search(){
        
        String next = null;
        
        try {
            devise = serviceDevise.getDevise(codeDevise);
            System.out.println("Devise : " + devise.getMonnaie());
        }catch(Exception e){
            System.err.println("--------------");
        }
        
        return next;
        
    }
    
    public Devise addDevise(){        
        return serviceDevise.addDevise(newDevise);        
    }
    
    public void test(String txt){
        
        System.err.println("");
        System.err.println("txt : " + txt);
        System.err.println("");
        
    }
    
    public List<Pays> getPaysByDevise(ActionEvent event){
        
        Devise devise = (Devise) event.getComponent().getAttributes().get("devise");
        
        pays = serviceDevise.getPaysByDevise(devise);
        
        System.err.println("Pays of  : " + devise.getMonnaie());
        pays.stream().forEach((py) -> {
            System.err.println("Pays : " + py.getNom());
        });
        
        return pays;
    }
    
    public List<Devise> getDevises(){        
        return serviceDevise.getDevises();
    }

    public List<Pays> getPays() {
        return pays;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
    }    
    
}
