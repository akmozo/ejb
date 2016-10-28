package com.akmozo.ejb.api;

import com.akmozo.ejb.entity.Devise;
import com.akmozo.ejb.entity.Pays;
import java.util.List;
import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebService;

//@Local
@Remote
@WebService
public interface IServiceDevise {
    
    Devise addDevise(@WebParam(name = "devise") Devise devise);
    Devise getDevise(@WebParam(name = "codeDevise") String codeDevise);
    
    List<Devise> getDevises();
    
    double convert(@WebParam(name = "montant") double montant, @WebParam(name = "in") String in, @WebParam(name = "out") String out);

    List<Pays> getPaysByDevise(@WebParam(name = "devise") Devise devise);
    List<Pays> getPaysByDeviseCode(@WebParam(name = "codeDevise") String codeDevise);
    
}
