
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
 *         &lt;element name="AllStadiumInfoResult" type="{https://footballpool.dataaccess.eu}ArrayOftStadiumInfo"/>
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
    "allStadiumInfoResult"
})
@XmlRootElement(name = "AllStadiumInfoResponse")
public class AllStadiumInfoResponse {

    @XmlElement(name = "AllStadiumInfoResult", required = true)
    protected ArrayOftStadiumInfo allStadiumInfoResult;

    /**
     * Obtiene el valor de la propiedad allStadiumInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public ArrayOftStadiumInfo getAllStadiumInfoResult() {
        return allStadiumInfoResult;
    }

    /**
     * Define el valor de la propiedad allStadiumInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public void setAllStadiumInfoResult(ArrayOftStadiumInfo value) {
        this.allStadiumInfoResult = value;
    }

}
