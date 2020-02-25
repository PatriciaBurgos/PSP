
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tAllCardsInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tAllCardsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iMinute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sTeam1Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeam1Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeam2Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeam2Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sPlayerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iYellow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAllCardsInfo", propOrder = {
    "dDate",
    "iMinute",
    "sTeam1Name",
    "sTeam1Flag",
    "sTeam2Name",
    "sTeam2Flag",
    "sPlayerName",
    "iYellow",
    "iRed"
})
public class TAllCardsInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dDate;
    protected int iMinute;
    @XmlElement(required = true)
    protected String sTeam1Name;
    @XmlElement(required = true)
    protected String sTeam1Flag;
    @XmlElement(required = true)
    protected String sTeam2Name;
    @XmlElement(required = true)
    protected String sTeam2Flag;
    @XmlElement(required = true)
    protected String sPlayerName;
    protected int iYellow;
    protected int iRed;

    /**
     * Obtiene el valor de la propiedad dDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDate() {
        return dDate;
    }

    /**
     * Define el valor de la propiedad dDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDate(XMLGregorianCalendar value) {
        this.dDate = value;
    }

    /**
     * Obtiene el valor de la propiedad iMinute.
     * 
     */
    public int getIMinute() {
        return iMinute;
    }

    /**
     * Define el valor de la propiedad iMinute.
     * 
     */
    public void setIMinute(int value) {
        this.iMinute = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam1Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam1Name() {
        return sTeam1Name;
    }

    /**
     * Define el valor de la propiedad sTeam1Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam1Name(String value) {
        this.sTeam1Name = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam1Flag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam1Flag() {
        return sTeam1Flag;
    }

    /**
     * Define el valor de la propiedad sTeam1Flag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam1Flag(String value) {
        this.sTeam1Flag = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam2Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam2Name() {
        return sTeam2Name;
    }

    /**
     * Define el valor de la propiedad sTeam2Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam2Name(String value) {
        this.sTeam2Name = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam2Flag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam2Flag() {
        return sTeam2Flag;
    }

    /**
     * Define el valor de la propiedad sTeam2Flag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam2Flag(String value) {
        this.sTeam2Flag = value;
    }

    /**
     * Obtiene el valor de la propiedad sPlayerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlayerName() {
        return sPlayerName;
    }

    /**
     * Define el valor de la propiedad sPlayerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlayerName(String value) {
        this.sPlayerName = value;
    }

    /**
     * Obtiene el valor de la propiedad iYellow.
     * 
     */
    public int getIYellow() {
        return iYellow;
    }

    /**
     * Define el valor de la propiedad iYellow.
     * 
     */
    public void setIYellow(int value) {
        this.iYellow = value;
    }

    /**
     * Obtiene el valor de la propiedad iRed.
     * 
     */
    public int getIRed() {
        return iRed;
    }

    /**
     * Define el valor de la propiedad iRed.
     * 
     */
    public void setIRed(int value) {
        this.iRed = value;
    }

}
