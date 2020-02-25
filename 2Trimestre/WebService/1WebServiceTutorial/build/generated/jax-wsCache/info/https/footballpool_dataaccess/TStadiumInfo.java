
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tStadiumInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tStadiumInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iSeatsCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sWikipediaURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGoogleMapsURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStadiumInfo", propOrder = {
    "sName",
    "iSeatsCapacity",
    "sCityName",
    "sWikipediaURL",
    "sGoogleMapsURL"
})
public class TStadiumInfo {

    @XmlElement(required = true)
    protected String sName;
    protected int iSeatsCapacity;
    @XmlElement(required = true)
    protected String sCityName;
    @XmlElement(required = true)
    protected String sWikipediaURL;
    @XmlElement(required = true)
    protected String sGoogleMapsURL;

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
     * Obtiene el valor de la propiedad iSeatsCapacity.
     * 
     */
    public int getISeatsCapacity() {
        return iSeatsCapacity;
    }

    /**
     * Define el valor de la propiedad iSeatsCapacity.
     * 
     */
    public void setISeatsCapacity(int value) {
        this.iSeatsCapacity = value;
    }

    /**
     * Obtiene el valor de la propiedad sCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCityName() {
        return sCityName;
    }

    /**
     * Define el valor de la propiedad sCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCityName(String value) {
        this.sCityName = value;
    }

    /**
     * Obtiene el valor de la propiedad sWikipediaURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWikipediaURL() {
        return sWikipediaURL;
    }

    /**
     * Define el valor de la propiedad sWikipediaURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWikipediaURL(String value) {
        this.sWikipediaURL = value;
    }

    /**
     * Obtiene el valor de la propiedad sGoogleMapsURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGoogleMapsURL() {
        return sGoogleMapsURL;
    }

    /**
     * Define el valor de la propiedad sGoogleMapsURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGoogleMapsURL(String value) {
        this.sGoogleMapsURL = value;
    }

}
