
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tGroupStanding complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGroupStanding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iTeamId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sTeamName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iPlayed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iWon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iDraw" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iLost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iGoalsFor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iGoalsAgainst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iPlusMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGroupStanding", propOrder = {
    "iTeamId",
    "sTeamName",
    "iPlayed",
    "iWon",
    "iDraw",
    "iLost",
    "iGoalsFor",
    "iGoalsAgainst",
    "iPlusMin",
    "iPoints"
})
public class TGroupStanding {

    protected int iTeamId;
    @XmlElement(required = true)
    protected String sTeamName;
    protected int iPlayed;
    protected int iWon;
    protected int iDraw;
    protected int iLost;
    protected int iGoalsFor;
    protected int iGoalsAgainst;
    protected int iPlusMin;
    protected int iPoints;

    /**
     * Obtiene el valor de la propiedad iTeamId.
     * 
     */
    public int getITeamId() {
        return iTeamId;
    }

    /**
     * Define el valor de la propiedad iTeamId.
     * 
     */
    public void setITeamId(int value) {
        this.iTeamId = value;
    }

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
     * Obtiene el valor de la propiedad iPlayed.
     * 
     */
    public int getIPlayed() {
        return iPlayed;
    }

    /**
     * Define el valor de la propiedad iPlayed.
     * 
     */
    public void setIPlayed(int value) {
        this.iPlayed = value;
    }

    /**
     * Obtiene el valor de la propiedad iWon.
     * 
     */
    public int getIWon() {
        return iWon;
    }

    /**
     * Define el valor de la propiedad iWon.
     * 
     */
    public void setIWon(int value) {
        this.iWon = value;
    }

    /**
     * Obtiene el valor de la propiedad iDraw.
     * 
     */
    public int getIDraw() {
        return iDraw;
    }

    /**
     * Define el valor de la propiedad iDraw.
     * 
     */
    public void setIDraw(int value) {
        this.iDraw = value;
    }

    /**
     * Obtiene el valor de la propiedad iLost.
     * 
     */
    public int getILost() {
        return iLost;
    }

    /**
     * Define el valor de la propiedad iLost.
     * 
     */
    public void setILost(int value) {
        this.iLost = value;
    }

    /**
     * Obtiene el valor de la propiedad iGoalsFor.
     * 
     */
    public int getIGoalsFor() {
        return iGoalsFor;
    }

    /**
     * Define el valor de la propiedad iGoalsFor.
     * 
     */
    public void setIGoalsFor(int value) {
        this.iGoalsFor = value;
    }

    /**
     * Obtiene el valor de la propiedad iGoalsAgainst.
     * 
     */
    public int getIGoalsAgainst() {
        return iGoalsAgainst;
    }

    /**
     * Define el valor de la propiedad iGoalsAgainst.
     * 
     */
    public void setIGoalsAgainst(int value) {
        this.iGoalsAgainst = value;
    }

    /**
     * Obtiene el valor de la propiedad iPlusMin.
     * 
     */
    public int getIPlusMin() {
        return iPlusMin;
    }

    /**
     * Define el valor de la propiedad iPlusMin.
     * 
     */
    public void setIPlusMin(int value) {
        this.iPlusMin = value;
    }

    /**
     * Obtiene el valor de la propiedad iPoints.
     * 
     */
    public int getIPoints() {
        return iPoints;
    }

    /**
     * Define el valor de la propiedad iPoints.
     * 
     */
    public void setIPoints(int value) {
        this.iPoints = value;
    }

}
