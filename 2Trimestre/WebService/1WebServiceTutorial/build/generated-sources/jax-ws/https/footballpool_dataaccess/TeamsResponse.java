
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
 *         &lt;element name="TeamsResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeam"/>
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
    "teamsResult"
})
@XmlRootElement(name = "TeamsResponse")
public class TeamsResponse {

    @XmlElement(name = "TeamsResult", required = true)
    protected ArrayOftTeam teamsResult;

    /**
     * Obtiene el valor de la propiedad teamsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeam }
     *     
     */
    public ArrayOftTeam getTeamsResult() {
        return teamsResult;
    }

    /**
     * Define el valor de la propiedad teamsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeam }
     *     
     */
    public void setTeamsResult(ArrayOftTeam value) {
        this.teamsResult = value;
    }

}
