
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
 *         &lt;element name="StadiumInfoResult" type="{https://footballpool.dataaccess.eu}tStadiumInfo"/>
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
    "stadiumInfoResult"
})
@XmlRootElement(name = "StadiumInfoResponse")
public class StadiumInfoResponse {

    @XmlElement(name = "StadiumInfoResult", required = true)
    protected TStadiumInfo stadiumInfoResult;

    /**
     * Obtiene el valor de la propiedad stadiumInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TStadiumInfo }
     *     
     */
    public TStadiumInfo getStadiumInfoResult() {
        return stadiumInfoResult;
    }

    /**
     * Define el valor de la propiedad stadiumInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TStadiumInfo }
     *     
     */
    public void setStadiumInfoResult(TStadiumInfo value) {
        this.stadiumInfoResult = value;
    }

}
