
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tTeamPlayerCardInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTeamPlayerCardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iYellowCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRedCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTeamPlayerCardInfo", propOrder = {
    "iid",
    "sName",
    "iYellowCards",
    "iRedCards"
})
public class TTeamPlayerCardInfo {

    @XmlElement(name = "iID")
    protected int iid;
    @XmlElement(required = true)
    protected String sName;
    protected int iYellowCards;
    protected int iRedCards;

    /**
     * Obtiene el valor de la propiedad iid.
     * 
     */
    public int getIID() {
        return iid;
    }

    /**
     * Define el valor de la propiedad iid.
     * 
     */
    public void setIID(int value) {
        this.iid = value;
    }

    /**
     * Obtiene el valor de la propiedad sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Define el valor de la propiedad sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Obtiene el valor de la propiedad iYellowCards.
     * 
     */
    public int getIYellowCards() {
        return iYellowCards;
    }

    /**
     * Define el valor de la propiedad iYellowCards.
     * 
     */
    public void setIYellowCards(int value) {
        this.iYellowCards = value;
    }

    /**
     * Obtiene el valor de la propiedad iRedCards.
     * 
     */
    public int getIRedCards() {
        return iRedCards;
    }

    /**
     * Define el valor de la propiedad iRedCards.
     * 
     */
    public void setIRedCards(int value) {
        this.iRedCards = value;
    }

}
