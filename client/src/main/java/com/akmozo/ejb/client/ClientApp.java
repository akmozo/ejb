/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akmozo.ejb.client;

import com.akmozo.app.ejb.api.IServiceDevise;
import com.akmozo.ejb.api.Pays;
import com.akmozo.ejb.imp.ServiceDeviseService;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author stagiaire
 */
public class ClientApp {
    
    public static void main(String[] args) {
        
        String strURL = "http://localhost/app_ejb_imp-0.1/ServiceDevise?wsdl";
        
        try {
            
            URL url = new URL(strURL);
            
            com.akmozo.ejb.imp.IServiceDevise deviseService = (new ServiceDeviseService(url)).getServiceDevisePort();
            
            //IServiceDevise deviseService = (new ServiceDeviseService(url)).getServiceDevisePort();
            
            List<Pays> pays = deviseService.getPaysByDeviseCode("EUR");
            
            System.err.println("Pays de EUR : " + pays.size());
            
        } catch (Exception ex) {
            System.out.printf("Caught Exception: %s\n", ex.getMessage());
        }
    }    

    public static void old2Main(String[] args) {

        Properties props = new Properties(); //java.util

        try {
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
            props.put(Context.PROVIDER_URL, "remote://localhost:4447"); // http-remoting://localhost:8080 for wildfly 8,9
            
            props.put(Context.SECURITY_PRINCIPAL, "user1");
            props.put(Context.SECURITY_CREDENTIALS, "user@001");

            props.put("jboss.naming.client.ejb.context", true); 

            Context jndiContext = new InitialContext(props);

            String jndiName = "app_ear-0.1/app_ejb_imp-0.1/ServiceDevise!com.akmozo.app.ejb.api.IServiceDevise";
            IServiceDevise ejbDevise = (IServiceDevise) jndiContext.lookup(jndiName);
            
            System.out.println("30 euros = " + ejbDevise.convert(30, "EUR", "USD") + " dollar");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void oldMain(String[] args) {

        try {

            final Properties env = new Properties();

            env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
            env.put(Context.PROVIDER_URL, "remote://localhost:4447");

            // remote://localhost:4447 for Jboss7.1 , http-remoting://localhost:8080 for wildfly 8,9
            env.put(Context.SECURITY_PRINCIPAL, "admin"); // username : "admin" , "guest" , "..."
            env.put(Context.SECURITY_CREDENTIALS, "admin"); //password : "pwd", "guest007"
            //avec utilisateur ajouté via la commande JBOSS_7_HOME/bin/add-user
            //et roles associés admin,guest,.... sur partie "ApplicationRealm" .
            env.put("jboss.naming.client.ejb.context", true);

            InitialContext remoteContext = new InitialContext(env);

            // sans "ejb:" et sans // pour version de jndiName sans jboss-ejb-client.properties et sans
            // props.setProperty(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
            IServiceDevise ejbDevise = (IServiceDevise) remoteContext.lookup(""
                    + ""
                    + "app_ear-0.1/app_ejb_imp-0.1/ServiceDevise!com.akmozo.app.ejb.api.IServiceDevise");
            
            System.out.println("10 dollars = " + ejbDevise.convert(10, "USD", "EUR") + " euros");

        } catch (NamingException ex) {
            Logger.getLogger(ClientApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
