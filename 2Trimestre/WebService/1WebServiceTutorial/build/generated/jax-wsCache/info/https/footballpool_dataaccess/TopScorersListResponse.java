
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
 *         &lt;element name="TopScorersListResult" type="{https://footballpool.dataaccess.eu}ArrayOftTopScorerTop5"/>
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
    "topScorersListResult"
})
@XmlRootElement(name = "TopScorersListResponse")
public class TopScorersListResponse {

    @XmlElement(name = "TopScorersListResult", required = true)
    protected ArrayOftTopScorerTop5 topScorersListResult;

    /**
     * Obtiene el valor de la propiedad topScorersListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTopScorerTop5 }
     *     
     */
    public ArrayOftTopScorerTop5 getTopScorersListResult() {
        return topScorersListResult;
    }

    /**
     * Define el valor de la propiedad topScorersListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTopScorerTop5 }
     *     
     */
    public void setTopScorersListResult(ArrayOftTopScorerTop5 value) {
        this.topScorersListResult = value;
    }

}
