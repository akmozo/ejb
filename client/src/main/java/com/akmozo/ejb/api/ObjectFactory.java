
package com.akmozo.ejb.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akmozo.app.ejb.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDevise_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getDevise");
    private final static QName _AddDeviseResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "addDeviseResponse");
    private final static QName _GetPaysByDeviseResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getPaysByDeviseResponse");
    private final static QName _Convert_QNAME = new QName("http://api.ejb.app.akmozo.com/", "convert");
    private final static QName _GetPaysByDevise_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getPaysByDevise");
    private final static QName _GetDevisesResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getDevisesResponse");
    private final static QName _GetDeviseResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getDeviseResponse");
    private final static QName _AddDevise_QNAME = new QName("http://api.ejb.app.akmozo.com/", "addDevise");
    private final static QName _ConvertResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "convertResponse");
    private final static QName _GetPaysByDeviseCode_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getPaysByDeviseCode");
    private final static QName _GetPaysByDeviseCodeResponse_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getPaysByDeviseCodeResponse");
    private final static QName _GetDevises_QNAME = new QName("http://api.ejb.app.akmozo.com/", "getDevises");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akmozo.app.ejb.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDevises }
     * 
     */
    public GetDevises createGetDevises() {
        return new GetDevises();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link GetPaysByDeviseCode }
     * 
     */
    public GetPaysByDeviseCode createGetPaysByDeviseCode() {
        return new GetPaysByDeviseCode();
    }

    /**
     * Create an instance of {@link GetPaysByDeviseCodeResponse }
     * 
     */
    public GetPaysByDeviseCodeResponse createGetPaysByDeviseCodeResponse() {
        return new GetPaysByDeviseCodeResponse();
    }

    /**
     * Create an instance of {@link AddDevise }
     * 
     */
    public AddDevise createAddDevise() {
        return new AddDevise();
    }

    /**
     * Create an instance of {@link GetDevisesResponse }
     * 
     */
    public GetDevisesResponse createGetDevisesResponse() {
        return new GetDevisesResponse();
    }

    /**
     * Create an instance of {@link GetDeviseResponse }
     * 
     */
    public GetDeviseResponse createGetDeviseResponse() {
        return new GetDeviseResponse();
    }

    /**
     * Create an instance of {@link GetPaysByDevise }
     * 
     */
    public GetPaysByDevise createGetPaysByDevise() {
        return new GetPaysByDevise();
    }

    /**
     * Create an instance of {@link GetPaysByDeviseResponse }
     * 
     */
    public GetPaysByDeviseResponse createGetPaysByDeviseResponse() {
        return new GetPaysByDeviseResponse();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link GetDevise }
     * 
     */
    public GetDevise createGetDevise() {
        return new GetDevise();
    }

    /**
     * Create an instance of {@link AddDeviseResponse }
     * 
     */
    public AddDeviseResponse createAddDeviseResponse() {
        return new AddDeviseResponse();
    }

    /**
     * Create an instance of {@link Devise }
     * 
     */
    public Devise createDevise() {
        return new Devise();
    }

    /**
     * Create an instance of {@link Pays }
     * 
     */
    public Pays createPays() {
        return new Pays();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getDevise")
    public JAXBElement<GetDevise> createGetDevise(GetDevise value) {
        return new JAXBElement<GetDevise>(_GetDevise_QNAME, GetDevise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDeviseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "addDeviseResponse")
    public JAXBElement<AddDeviseResponse> createAddDeviseResponse(AddDeviseResponse value) {
        return new JAXBElement<AddDeviseResponse>(_AddDeviseResponse_QNAME, AddDeviseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaysByDeviseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getPaysByDeviseResponse")
    public JAXBElement<GetPaysByDeviseResponse> createGetPaysByDeviseResponse(GetPaysByDeviseResponse value) {
        return new JAXBElement<GetPaysByDeviseResponse>(_GetPaysByDeviseResponse_QNAME, GetPaysByDeviseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<Convert>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaysByDevise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getPaysByDevise")
    public JAXBElement<GetPaysByDevise> createGetPaysByDevise(GetPaysByDevise value) {
        return new JAXBElement<GetPaysByDevise>(_GetPaysByDevise_QNAME, GetPaysByDevise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getDevisesResponse")
    public JAXBElement<GetDevisesResponse> createGetDevisesResponse(GetDevisesResponse value) {
        return new JAXBElement<GetDevisesResponse>(_GetDevisesResponse_QNAME, GetDevisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getDeviseResponse")
    public JAXBElement<GetDeviseResponse> createGetDeviseResponse(GetDeviseResponse value) {
        return new JAXBElement<GetDeviseResponse>(_GetDeviseResponse_QNAME, GetDeviseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDevise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "addDevise")
    public JAXBElement<AddDevise> createAddDevise(AddDevise value) {
        return new JAXBElement<AddDevise>(_AddDevise_QNAME, AddDevise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<ConvertResponse>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaysByDeviseCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getPaysByDeviseCode")
    public JAXBElement<GetPaysByDeviseCode> createGetPaysByDeviseCode(GetPaysByDeviseCode value) {
        return new JAXBElement<GetPaysByDeviseCode>(_GetPaysByDeviseCode_QNAME, GetPaysByDeviseCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaysByDeviseCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getPaysByDeviseCodeResponse")
    public JAXBElement<GetPaysByDeviseCodeResponse> createGetPaysByDeviseCodeResponse(GetPaysByDeviseCodeResponse value) {
        return new JAXBElement<GetPaysByDeviseCodeResponse>(_GetPaysByDeviseCodeResponse_QNAME, GetPaysByDeviseCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ejb.app.akmozo.com/", name = "getDevises")
    public JAXBElement<GetDevises> createGetDevises(GetDevises value) {
        return new JAXBElement<GetDevises>(_GetDevises_QNAME, GetDevises.class, null, value);
    }

}
