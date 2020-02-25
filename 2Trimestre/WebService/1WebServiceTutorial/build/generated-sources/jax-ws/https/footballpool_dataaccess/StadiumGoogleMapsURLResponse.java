
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StadiumGoogleMapsURLResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stadiumGoogleMapsURLResult"
})
@XmlRootElement(name = "StadiumGoogleMapsURLResponse")
public class StadiumGoogleMapsURLResponse {

    @XmlElement(name = "StadiumGoogleMapsURLResult", required = true)
    protected String stadiumGoogleMapsURLResult;

    /**
     * Obtiene el valor de la propiedad stadiumGoogleMapsURLResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadiumGoogleMapsURLResult() {
        return stadiumGoogleMapsURLResult;
    }

    /**
     * Define el valor de la propiedad stadiumGoogleMapsURLResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadiumGoogleMapsURLResult(String value) {
        this.stadiumGoogleMapsURLResult = value;
    }

}
