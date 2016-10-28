
package com.akmozo.ejb.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour devise complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="devise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pays" type="{http://api.ejb.app.akmozo.com/}pays" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taux" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devise", propOrder = {
    "code",
    "monnaie",
    "pays",
    "taux"
})
public class Devise {

    protected String code;
    protected String monnaie;
    @XmlElement(nillable = true)
    protected List<Pays> pays;
    protected Double taux;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� monnaie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonnaie() {
        return monnaie;
    }

    /**
     * D�finit la valeur de la propri�t� monnaie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonnaie(String value) {
        this.monnaie = value;
    }

    /**
     * Gets the value of the pays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pays }
     * 
     * 
     */
    public List<Pays> getPays() {
        if (pays == null) {
            pays = new ArrayList<Pays>();
        }
        return this.pays;
    }

    /**
     * Obtient la valeur de la propri�t� taux.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaux() {
        return taux;
    }

    /**
     * D�finit la valeur de la propri�t� taux.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaux(Double value) {
        this.taux = value;
    }

}
