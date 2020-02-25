
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
 *         &lt;element name="sTeamName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "sTeamName",
    "bSelected"
})
@XmlRootElement(name = "TeamPlayers")
public class TeamPlayers {

    @XmlElement(required = true)
    protected String sTeamName;
    protected boolean bSelected;

    /**
     * Obtiene el valor de la propiedad sTeamName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeamName() {
        return sTeamName;
    }

    /**
     * Define el valor de la propiedad sTeamName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeamName(String value) {
        this.sTeamName = value;
    }

    /**
     * Obtiene el valor de la propiedad bSelected.
     * 
     */
    public boolean isBSelected() {
        return bSelected;
    }

    /**
     * Define el valor de la propiedad bSelected.
     * 
     */
    public void setBSelected(boolean value) {
        this.bSelected = value;
    }

}
