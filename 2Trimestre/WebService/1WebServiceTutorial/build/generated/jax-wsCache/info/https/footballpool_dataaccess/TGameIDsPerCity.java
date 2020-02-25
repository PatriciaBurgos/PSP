
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tGameIDsPerCity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGameIDsPerCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iGameIDs" type="{https://footballpool.dataaccess.eu}ArrayOfInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGameIDsPerCity", propOrder = {
    "sCity",
    "iGameIDs"
})
public class TGameIDsPerCity {

    @XmlElement(required = true)
    protected String sCity;
    @XmlElement(required = true)
    protected ArrayOfInt iGameIDs;

    /**
     * Obtiene el valor de la propiedad sCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCity() {
        return sCity;
    }

    /**
     * Define el valor de la propiedad sCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCity(String value) {
        this.sCity = value;
    }

    /**
     * Obtiene el valor de la propiedad iGameIDs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIGameIDs() {
        return iGameIDs;
    }

    /**
     * Define el valor de la propiedad iGameIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIGameIDs(ArrayOfInt value) {
        this.iGameIDs = value;
    }

}
