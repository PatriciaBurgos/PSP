
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
 *         &lt;element name="PlayersWithCardsRankedResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamPlayerCardRankInfo"/>
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
    "playersWithCardsRankedResult"
})
@XmlRootElement(name = "PlayersWithCardsRankedResponse")
public class PlayersWithCardsRankedResponse {

    @XmlElement(name = "PlayersWithCardsRankedResult", required = true)
    protected ArrayOftTeamPlayerCardRankInfo playersWithCardsRankedResult;

    /**
     * Obtiene el valor de la propiedad playersWithCardsRankedResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamPlayerCardRankInfo }
     *     
     */
    public ArrayOftTeamPlayerCardRankInfo getPlayersWithCardsRankedResult() {
        return playersWithCardsRankedResult;
    }

    /**
     * Define el valor de la propiedad playersWithCardsRankedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamPlayerCardRankInfo }
     *     
     */
    public void setPlayersWithCardsRankedResult(ArrayOftTeamPlayerCardRankInfo value) {
        this.playersWithCardsRankedResult = value;
    }

}
