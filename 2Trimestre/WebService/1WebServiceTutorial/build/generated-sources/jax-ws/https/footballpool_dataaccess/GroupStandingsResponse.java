
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
 *         &lt;element name="GroupStandingsResult" type="{https://footballpool.dataaccess.eu}ArrayOftGroupStanding"/>
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
    "groupStandingsResult"
})
@XmlRootElement(name = "GroupStandingsResponse")
public class GroupStandingsResponse {

    @XmlElement(name = "GroupStandingsResult", required = true)
    protected ArrayOftGroupStanding groupStandingsResult;

    /**
     * Obtiene el valor de la propiedad groupStandingsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGroupStanding }
     *     
     */
    public ArrayOftGroupStanding getGroupStandingsResult() {
        return groupStandingsResult;
    }

    /**
     * Define el valor de la propiedad groupStandingsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGroupStanding }
     *     
     */
    public void setGroupStandingsResult(ArrayOftGroupStanding value) {
        this.groupStandingsResult = value;
    }

}
