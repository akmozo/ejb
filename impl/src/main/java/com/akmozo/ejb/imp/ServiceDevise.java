
package com.akmozo.ejb.imp;

import com.akmozo.ejb.api.IServiceDevise;
import com.akmozo.ejb.dao.IDaoDevise;
import com.akmozo.ejb.entity.Devise;
import com.akmozo.ejb.entity.Pays;
import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@DeclareRoles({"admin,guest,test"})
@WebService(endpointInterface = "com.akmozo.ejb.api.IServiceDevise")
public class ServiceDevise implements IServiceDevise {
    
    // to DOA class
    /*
        @Resource(mappedName = "java:/bankDataSource") // name from jboss's standalone.xml, line 142
        public DataSource dataSource;

        @PersistenceContext(unitName = "persistenceUnit")
        private EntityManager entityManager;
    */
    
    @EJB
    private IDaoDevise daoDevise;

    public IDaoDevise getDaoDevise() {
        return daoDevise;
    }

    public void setDaoDevise(IDaoDevise daoDevise) {
        this.daoDevise = daoDevise;
    }
    
    @Override
    //@RolesAllowed({"test"})
    @PermitAll
    public Devise getDevise(String codeDevise) { 
        return daoDevise.getDevise(codeDevise);
    }    
    
    // using DataSource
    //@Override
    /*public Devise _getDevise(String codeDevise) {
        Devise devise = null;
        //return new Devise(codeDevise, "monnaie " + codeDevise, 1.31);
        
        String req = "Select * From devise Where code = ?";
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement preStatement = connection.prepareStatement(req);
            preStatement.setString(1, codeDevise);
            ResultSet results = preStatement.executeQuery();
            if(results.next()){
                devise = new Devise(codeDevise, results.getString("monnaie"), results.getDouble("taux"));
            }            
            results.close();
            preStatement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDevise.class.getName()).log(Level.SEVERE, null, ex);            
        } finally {
            try {
                connection.close();
            } catch(Exception e){ }
        }        
        return devise;
    }*/

    @Override
    @PermitAll
    public List<Devise> getDevises() {       
        return daoDevise.getAllDevises();
        //entityManager.createQuery("From Devise d").getResultList();
    }

    @Override
    //@RolesAllowed("admin")
    @PermitAll
    public double convert(double montant, String in, String out) {
        Devise deviseIn = daoDevise.getDevise(in);
        return montant * deviseIn.getTaux();
    }

    @Override
    @PermitAll
    public Devise addDevise(Devise devise) {        
        return daoDevise.addDevise(devise);
        //entityManager.merge(devise); 
    }
    
    @PermitAll 
    public List<Pays> getPaysByDevise(Devise devise) {        
        return daoDevise.getPaysByDevise(devise);
    }    

    @Override
    @PermitAll
    public List<Pays> getPaysByDeviseCode(String paramCodeDevise) {
        return daoDevise.getPaysByDeviseCode(paramCodeDevise);
    }
    
}
