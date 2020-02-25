
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
 *         &lt;element name="AllPlayersWithRoleResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamPlayerName"/>
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
    "allPlayersWithRoleResult"
})
@XmlRootElement(name = "AllPlayersWithRoleResponse")
public class AllPlayersWithRoleResponse {

    @XmlElement(name = "AllPlayersWithRoleResult", required = true)
    protected ArrayOftTeamPlayerName allPlayersWithRoleResult;

    /**
     * Obtiene el valor de la propiedad allPlayersWithRoleResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamPlayerName }
     *     
     */
    public ArrayOftTeamPlayerName getAllPlayersWithRoleResult() {
        return allPlayersWithRoleResult;
    }

    /**
     * Define el valor de la propiedad allPlayersWithRoleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamPlayerName }
     *     
     */
    public void setAllPlayersWithRoleResult(ArrayOftTeamPlayerName value) {
        this.allPlayersWithRoleResult = value;
    }

}
