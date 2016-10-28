package com.akmozo.ejb.dao;

import com.akmozo.ejb.entity.Devise;
import com.akmozo.ejb.entity.Pays;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// CRUD : create, retrieve, Update, Delete
@Stateless
// by default, we don't need to write it
//@TransactionManagement(TransactionManagementType.CONTAINER)
public class DaoDevise implements IDaoDevise {

    //@Resource(mappedName = "java:/bankDataSource") // name from jboss's standalone.xml, line 142
    //public DataSource dataSource;
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager entityManager;

    @Override
    public Devise addDevise(Devise devise) {
        entityManager.persist(devise);
        return devise;
    }

    @Override
    public Devise updateDevise(Devise devise) {
        return entityManager.merge(devise);
    }

    @Override
    public Devise deleteDevise(Devise devise) {
        entityManager.remove(devise);
        return devise;
    }

    @Override
    public Devise getDevise(String codeDevise) {
        return entityManager
                .createQuery("From Devise d Left Join Fetch d.pays p Where d.code = :code", Devise.class)
                .setParameter("code", codeDevise)
                .getSingleResult();
    }

    @Override
    public Devise getDeviseByName(String monnaie) {
        return entityManager
                .createQuery("From Devise d Where d.monnaie = :monnaie", Devise.class)
                .setParameter("monnaie", monnaie)
                .getSingleResult();
    }

    @Override
    public List<Devise> getAllDevises() {
        return entityManager.createNamedQuery("getAllDevises", Devise.class).getResultList();
    }

    @Override
    public List<Pays> getPaysByDevise(Devise devise) {

        // utilisant ManyToMany
        List<Pays> pays = entityManager
                .createQuery("Select p From Pays p Join p.devise d Where d.code = :code", Pays.class)
                .setParameter("code", devise.getCode())
                .getResultList();

        // utilisant OneToMany
        /*
            Devise d = entityManager.find(Devise.class, devise.getCode());        
            // forcer hibernate de recuperer la liste de pays
            d.getPays().size();            
            return d.getPays(); 
         */
        return pays;
    }

    @Override
    public List<Pays> getPaysByDeviseCode(String paramCodeDevise) {
        List<Pays> pays = entityManager
                .createQuery("Select p From Pays p Join Fetch p.devise d Where d.code = :code", Pays.class)
                .setParameter("code", paramCodeDevise)
                .getResultList();
        return pays;
    }

}
