
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tGameResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGameResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iGameNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtLocalPlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtUTCPlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeamName1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeamName2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iScoreTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iScoreTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRedCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iYellowCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bFinished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iPenaltiesWonTeam1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iPenaltiesWonTeam2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGameResult", propOrder = {
    "iGameNumber",
    "sDescription",
    "dtLocalPlayDateTime",
    "dtUTCPlayDateTime",
    "sTeamName1",
    "sTeamName2",
    "iScoreTeam1",
    "iScoreTeam2",
    "iRedCards",
    "iYellowCards",
    "sGroupCode",
    "bFinished",
    "iPenaltiesWonTeam1",
    "iPenaltiesWonTeam2"
})
public class TGameResult {

    protected int iGameNumber;
    @XmlElement(required = true)
    protected String sDescription;
    @XmlElement(required = true)
    protected String dtLocalPlayDateTime;
    @XmlElement(required = true)
    protected String dtUTCPlayDateTime;
    @XmlElement(required = true)
    protected String sTeamName1;
    @XmlElement(required = true)
    protected String sTeamName2;
    protected int iScoreTeam1;
    protected int iScoreTeam2;
    protected int iRedCards;
    protected int iYellowCards;
    @XmlElement(required = true)
    protected String sGroupCode;
    protected boolean bFinished;
    protected int iPenaltiesWonTeam1;
    protected int iPenaltiesWonTeam2;

    /**
     * Obtiene el valor de la propiedad iGameNumber.
     * 
     */
    public int getIGameNumber() {
        return iGameNumber;
    }

    /**
     * Define el valor de la propiedad iGameNumber.
     * 
     */
    public void setIGameNumber(int value) {
        this.iGameNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad sDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDescription() {
        return sDescription;
    }

    /**
     * Define el valor de la propiedad sDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDescription(String value) {
        this.sDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad dtLocalPlayDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtLocalPlayDateTime() {
        return dtLocalPlayDateTime;
    }

    /**
     * Define el valor de la propiedad dtLocalPlayDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtLocalPlayDateTime(String value) {
        this.dtLocalPlayDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dtUTCPlayDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtUTCPlayDateTime() {
        return dtUTCPlayDateTime;
    }

    /**
     * Define el valor de la propiedad dtUTCPlayDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtUTCPlayDateTime(String value) {
        this.dtUTCPlayDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeamName1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeamName1() {
        return sTeamName1;
    }

    /**
     * Define el valor de la propiedad sTeamName1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeamName1(String value) {
        this.sTeamName1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeamName2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeamName2() {
        return sTeamName2;
    }

    /**
     * Define el valor de la propiedad sTeamName2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeamName2(String value) {
        this.sTeamName2 = value;
    }

    /**
     * Obtiene el valor de la propiedad iScoreTeam1.
     * 
     */
    public int getIScoreTeam1() {
        return iScoreTeam1;
    }

    /**
     * Define el valor de la propiedad iScoreTeam1.
     * 
     */
    public void setIScoreTeam1(int value) {
        this.iScoreTeam1 = value;
    }

    /**
     * Obtiene el valor de la propiedad iScoreTeam2.
     * 
     */
    public int getIScoreTeam2() {
        return iScoreTeam2;
    }

    /**
     * Define el valor de la propiedad iScoreTeam2.
     * 
     */
    public void setIScoreTeam2(int value) {
        this.iScoreTeam2 = value;
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
     * Obtiene el valor de la propiedad sGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGroupCode() {
        return sGroupCode;
    }

    /**
     * Define el valor de la propiedad sGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGroupCode(String value) {
        this.sGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bFinished.
     * 
     */
    public boolean isBFinished() {
        return bFinished;
    }

    /**
     * Define el valor de la propiedad bFinished.
     * 
     */
    public void setBFinished(boolean value) {
        this.bFinished = value;
    }

    /**
     * Obtiene el valor de la propiedad iPenaltiesWonTeam1.
     * 
     */
    public int getIPenaltiesWonTeam1() {
        return iPenaltiesWonTeam1;
    }

    /**
     * Define el valor de la propiedad iPenaltiesWonTeam1.
     * 
     */
    public void setIPenaltiesWonTeam1(int value) {
        this.iPenaltiesWonTeam1 = value;
    }

    /**
     * Obtiene el valor de la propiedad iPenaltiesWonTeam2.
     * 
     */
    public int getIPenaltiesWonTeam2() {
        return iPenaltiesWonTeam2;
    }

    /**
     * Define el valor de la propiedad iPenaltiesWonTeam2.
     * 
     */
    public void setIPenaltiesWonTeam2(int value) {
        this.iPenaltiesWonTeam2 = value;
    }

}
