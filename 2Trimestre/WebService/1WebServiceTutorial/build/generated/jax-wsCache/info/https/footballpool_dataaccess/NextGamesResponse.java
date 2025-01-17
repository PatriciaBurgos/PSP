
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
 *         &lt;element name="NextGamesResult" type="{https://footballpool.dataaccess.eu}ArrayOftNextGame"/>
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
    "nextGamesResult"
})
@XmlRootElement(name = "NextGamesResponse")
public class NextGamesResponse {

    @XmlElement(name = "NextGamesResult", required = true)
    protected ArrayOftNextGame nextGamesResult;

    /**
     * Obtiene el valor de la propiedad nextGamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftNextGame }
     *     
     */
    public ArrayOftNextGame getNextGamesResult() {
        return nextGamesResult;
    }

    /**
     * Define el valor de la propiedad nextGamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftNextGame }
     *     
     */
    public void setNextGamesResult(ArrayOftNextGame value) {
        this.nextGamesResult = value;
    }

}
