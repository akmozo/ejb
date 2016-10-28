
package com.akmozo.ejb.imp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceDeviseService", targetNamespace = "http://imp.ejb.app.akmozo.com/", wsdlLocation = "http://localhost/app_ejb_imp-0.1/ServiceDevise?wsdl")
public class ServiceDeviseService
    extends Service
{

    private final static URL SERVICEDEVISESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEDEVISESERVICE_EXCEPTION;
    private final static QName SERVICEDEVISESERVICE_QNAME = new QName("http://imp.ejb.app.akmozo.com/", "ServiceDeviseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/app_ejb_imp-0.1/ServiceDevise?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEDEVISESERVICE_WSDL_LOCATION = url;
        SERVICEDEVISESERVICE_EXCEPTION = e;
    }

    public ServiceDeviseService() {
        super(__getWsdlLocation(), SERVICEDEVISESERVICE_QNAME);
    }

    public ServiceDeviseService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEDEVISESERVICE_QNAME, features);
    }

    public ServiceDeviseService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEDEVISESERVICE_QNAME);
    }

    public ServiceDeviseService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEDEVISESERVICE_QNAME, features);
    }

    public ServiceDeviseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceDeviseService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServiceDevise
     */
    @WebEndpoint(name = "ServiceDevisePort")
    public IServiceDevise getServiceDevisePort() {
        return super.getPort(new QName("http://imp.ejb.app.akmozo.com/", "ServiceDevisePort"), IServiceDevise.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceDevise
     */
    @WebEndpoint(name = "ServiceDevisePort")
    public IServiceDevise getServiceDevisePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://imp.ejb.app.akmozo.com/", "ServiceDevisePort"), IServiceDevise.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEDEVISESERVICE_EXCEPTION!= null) {
            throw SERVICEDEVISESERVICE_EXCEPTION;
        }
        return SERVICEDEVISESERVICE_WSDL_LOCATION;
    }

}