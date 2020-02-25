
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
 *         &lt;element name="PlayersResult" type="{https://footballpool.dataaccess.eu}ArrayOftPlayer"/>
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
    "playersResult"
})
@XmlRootElement(name = "PlayersResponse")
public class PlayersResponse {

    @XmlElement(name = "PlayersResult", required = true)
    protected ArrayOftPlayer playersResult;

    /**
     * Obtiene el valor de la propiedad playersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftPlayer }
     *     
     */
    public ArrayOftPlayer getPlayersResult() {
        return playersResult;
    }

    /**
     * Define el valor de la propiedad playersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftPlayer }
     *     
     */
    public void setPlayersResult(ArrayOftPlayer value) {
        this.playersResult = value;
    }

}
