
package com.akmozo.ejb.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addDevise complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addDevise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devise" type="{http://api.ejb.app.akmozo.com/}devise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDevise", propOrder = {
    "devise"
})
public class AddDevise {

    protected Devise devise;

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

}
