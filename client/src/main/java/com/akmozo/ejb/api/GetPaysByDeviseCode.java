
package com.akmozo.ejb.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPaysByDeviseCode complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPaysByDeviseCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeDevise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaysByDeviseCode", propOrder = {
    "codeDevise"
})
public class GetPaysByDeviseCode {

    protected String codeDevise;

    /**
     * Obtient la valeur de la propri�t� codeDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDevise() {
        return codeDevise;
    }

    /**
     * D�finit la valeur de la propri�t� codeDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDevise(String value) {
        this.codeDevise = value;
    }

}
