
package com.akmozo.ejb.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pays complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codePays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devise" type="{http://api.ejb.app.akmozo.com/}devise" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pays", propOrder = {
    "capitale",
    "codePays",
    "devise",
    "nom"
})
public class Pays {

    protected String capitale;
    protected String codePays;
    protected Devise devise;
    protected String nom;

    /**
     * Obtient la valeur de la propri�t� capitale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitale() {
        return capitale;
    }

    /**
     * D�finit la valeur de la propri�t� capitale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitale(String value) {
        this.capitale = value;
    }

    /**
     * Obtient la valeur de la propri�t� codePays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePays() {
        return codePays;
    }

    /**
     * D�finit la valeur de la propri�t� codePays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePays(String value) {
        this.codePays = value;
    }

    /**
     * Obtient la valeur de la propri�t� devise.
     * 
     * @return
     *     possible object is
     *     {@link Devise }
     *     
     */
    public Devise getDevise() {
        return devise;
    }

    /**
     * D�finit la valeur de la propri�t� devise.
     * 
     * @param value
     *     allowed object is
     *     {@link Devise }
     *     
     */
    public void setDevise(Devise value) {
        this.devise = value;
    }

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

}
