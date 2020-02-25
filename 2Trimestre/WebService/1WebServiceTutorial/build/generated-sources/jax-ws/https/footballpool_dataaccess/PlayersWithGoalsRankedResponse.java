
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
 *         &lt;element name="PlayersWithGoalsRankedResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamPlayerGoalsRankInfo"/>
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
    "playersWithGoalsRankedResult"
})
@XmlRootElement(name = "PlayersWithGoalsRankedResponse")
public class PlayersWithGoalsRankedResponse {

    @XmlElement(name = "PlayersWithGoalsRankedResult", required = true)
    protected ArrayOftTeamPlayerGoalsRankInfo playersWithGoalsRankedResult;

    /**
     * Obtiene el valor de la propiedad playersWithGoalsRankedResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamPlayerGoalsRankInfo }
     *     
     */
    public ArrayOftTeamPlayerGoalsRankInfo getPlayersWithGoalsRankedResult() {
        return playersWithGoalsRankedResult;
    }

    /**
     * Define el valor de la propiedad playersWithGoalsRankedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamPlayerGoalsRankInfo }
     *     
     */
    public void setPlayersWithGoalsRankedResult(ArrayOftTeamPlayerGoalsRankInfo value) {
        this.playersWithGoalsRankedResult = value;
    }

}
