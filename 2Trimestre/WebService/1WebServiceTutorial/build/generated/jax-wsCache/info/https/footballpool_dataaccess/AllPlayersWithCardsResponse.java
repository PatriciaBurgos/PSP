
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
 *         &lt;element name="AllPlayersWithCardsResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamPlayerCardInfo"/>
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
    "allPlayersWithCardsResult"
})
@XmlRootElement(name = "AllPlayersWithCardsResponse")
public class AllPlayersWithCardsResponse {

    @XmlElement(name = "AllPlayersWithCardsResult", required = true)
    protected ArrayOftTeamPlayerCardInfo allPlayersWithCardsResult;

    /**
     * Obtiene el valor de la propiedad allPlayersWithCardsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamPlayerCardInfo }
     *     
     */
    public ArrayOftTeamPlayerCardInfo getAllPlayersWithCardsResult() {
        return allPlayersWithCardsResult;
    }

    /**
     * Define el valor de la propiedad allPlayersWithCardsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamPlayerCardInfo }
     *     
     */
    public void setAllPlayersWithCardsResult(ArrayOftTeamPlayerCardInfo value) {
        this.allPlayersWithCardsResult = value;
    }

}
