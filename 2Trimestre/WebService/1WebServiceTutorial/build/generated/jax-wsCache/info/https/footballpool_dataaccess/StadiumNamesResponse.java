
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
 *         &lt;element name="StadiumNamesResult" type="{https://footballpool.dataaccess.eu}ArrayOfString"/>
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
    "stadiumNamesResult"
})
@XmlRootElement(name = "StadiumNamesResponse")
public class StadiumNamesResponse {

    @XmlElement(name = "StadiumNamesResult", required = true)
    protected ArrayOfString stadiumNamesResult;

    /**
     * Obtiene el valor de la propiedad stadiumNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getStadiumNamesResult() {
        return stadiumNamesResult;
    }

    /**
     * Define el valor de la propiedad stadiumNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setStadiumNamesResult(ArrayOfString value) {
        this.stadiumNamesResult = value;
    }

}
