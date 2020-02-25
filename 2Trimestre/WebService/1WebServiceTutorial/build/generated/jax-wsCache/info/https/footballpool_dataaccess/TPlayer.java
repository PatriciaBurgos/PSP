
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tPlayer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPlayer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPlayer", propOrder = {
    "iId",
    "sName",
    "sFullName",
    "sFirstName",
    "sLastName"
})
public class TPlayer {

    protected int iId;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sFullName;
    @XmlElement(required = true)
    protected String sFirstName;
    @XmlElement(required = true)
    protected String sLastName;

    /**
     * Obtiene el valor de la propiedad iId.
     * 
     */
    public int getIId() {
        return iId;
    }

    /**
     * Define el valor de la propiedad iId.
     * 
     */
    public void setIId(int value) {
        this.iId = value;
    }

    /**
     * Obtiene el valor de la propiedad sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Define el valor de la propiedad sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Obtiene el valor de la propiedad sFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFullName() {
        return sFullName;
    }

    /**
     * Define el valor de la propiedad sFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFullName(String value) {
        this.sFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad sFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFirstName() {
        return sFirstName;
    }

    /**
     * Define el valor de la propiedad sFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFirstName(String value) {
        this.sFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad sLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLastName() {
        return sLastName;
    }

    /**
     * Define el valor de la propiedad sLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLastName(String value) {
        this.sLastName = value;
    }

}
