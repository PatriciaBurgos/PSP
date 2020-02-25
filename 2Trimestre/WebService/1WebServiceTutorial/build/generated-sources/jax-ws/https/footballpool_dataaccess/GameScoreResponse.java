
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
 *         &lt;element name="GameScoreResult" type="{https://footballpool.dataaccess.eu}tGameResult"/>
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
    "gameScoreResult"
})
@XmlRootElement(name = "GameScoreResponse")
public class GameScoreResponse {

    @XmlElement(name = "GameScoreResult", required = true)
    protected TGameResult gameScoreResult;

    /**
     * Obtiene el valor de la propiedad gameScoreResult.
     * 
     * @return
     *     possible object is
     *     {@link TGameResult }
     *     
     */
    public TGameResult getGameScoreResult() {
        return gameScoreResult;
    }

    /**
     * Define el valor de la propiedad gameScoreResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TGameResult }
     *     
     */
    public void setGameScoreResult(TGameResult value) {
        this.gameScoreResult = value;
    }

}
