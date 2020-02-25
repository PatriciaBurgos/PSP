
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
 *         &lt;element name="AllTeamCoachNamesResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamCoachName"/>
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
    "allTeamCoachNamesResult"
})
@XmlRootElement(name = "AllTeamCoachNamesResponse")
public class AllTeamCoachNamesResponse {

    @XmlElement(name = "AllTeamCoachNamesResult", required = true)
    protected ArrayOftTeamCoachName allTeamCoachNamesResult;

    /**
     * Obtiene el valor de la propiedad allTeamCoachNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamCoachName }
     *     
     */
    public ArrayOftTeamCoachName getAllTeamCoachNamesResult() {
        return allTeamCoachNamesResult;
    }

    /**
     * Define el valor de la propiedad allTeamCoachNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamCoachName }
     *     
     */
    public void setAllTeamCoachNamesResult(ArrayOftTeamCoachName value) {
        this.allTeamCoachNamesResult = value;
    }

}
