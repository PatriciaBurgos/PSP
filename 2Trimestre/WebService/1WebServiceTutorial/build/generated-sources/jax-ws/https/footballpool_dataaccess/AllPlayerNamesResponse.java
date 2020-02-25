
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
 *         &lt;element name="AllPlayerNamesResult" type="{https://footballpool.dataaccess.eu}ArrayOftPlayerName"/>
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
    "allPlayerNamesResult"
})
@XmlRootElement(name = "AllPlayerNamesResponse")
public class AllPlayerNamesResponse {

    @XmlElement(name = "AllPlayerNamesResult", required = true)
    protected ArrayOftPlayerName allPlayerNamesResult;

    /**
     * Obtiene el valor de la propiedad allPlayerNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftPlayerName }
     *     
     */
    public ArrayOftPlayerName getAllPlayerNamesResult() {
        return allPlayerNamesResult;
    }

    /**
     * Define el valor de la propiedad allPlayerNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftPlayerName }
     *     
     */
    public void setAllPlayerNamesResult(ArrayOftPlayerName value) {
        this.allPlayerNamesResult = value;
    }

}
