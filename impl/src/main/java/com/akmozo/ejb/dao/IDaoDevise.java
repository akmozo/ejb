
package com.akmozo.ejb.dao;

import com.akmozo.ejb.entity.Devise;
import com.akmozo.ejb.entity.Pays;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IDaoDevise {

    Devise addDevise(Devise devise);
    Devise deleteDevise(Devise devise);
    List<Devise> getAllDevises();
    Devise getDevise(String codeDevise);
    Devise getDeviseByName(String monnaie);
    Devise updateDevise(Devise devise);    
    List<Pays> getPaysByDevise(Devise devise);    
    List<Pays> getPaysByDeviseCode(String codeDevise);
    
}
