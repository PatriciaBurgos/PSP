
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
 *         &lt;element name="MatchDatesResult" type="{https://footballpool.dataaccess.eu}ArrayOfdate"/>
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
    "matchDatesResult"
})
@XmlRootElement(name = "MatchDatesResponse")
public class MatchDatesResponse {

    @XmlElement(name = "MatchDatesResult", required = true)
    protected ArrayOfdate matchDatesResult;

    /**
     * Obtiene el valor de la propiedad matchDatesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfdate }
     *     
     */
    public ArrayOfdate getMatchDatesResult() {
        return matchDatesResult;
    }

    /**
     * Define el valor de la propiedad matchDatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfdate }
     *     
     */
    public void setMatchDatesResult(ArrayOfdate value) {
        this.matchDatesResult = value;
    }

}
