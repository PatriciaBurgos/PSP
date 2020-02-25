
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tTeamPlayerGoalsRankInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTeamPlayerGoalsRankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iGoals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTeamPlayerGoalsRankInfo", propOrder = {
    "iRank",
    "iid",
    "sName",
    "iGoals"
})
public class TTeamPlayerGoalsRankInfo {

    protected int iRank;
    @XmlElement(name = "iID")
    protected int iid;
    @XmlElement(required = true)
    protected String sName;
    protected int iGoals;

    /**
     * Obtiene el valor de la propiedad iRank.
     * 
     */
    public int getIRank() {
        return iRank;
    }

    /**
     * Define el valor de la propiedad iRank.
     * 
     */
    public void setIRank(int value) {
        this.iRank = value;
    }

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
     * Obtiene el valor de la propiedad iGoals.
     * 
     */
    public int getIGoals() {
        return iGoals;
    }

    /**
     * Define el valor de la propiedad iGoals.
     * 
     */
    public void setIGoals(int value) {
        this.iGoals = value;
    }

}
