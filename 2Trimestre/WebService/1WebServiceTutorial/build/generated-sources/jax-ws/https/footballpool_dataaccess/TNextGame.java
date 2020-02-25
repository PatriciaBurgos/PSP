
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tNextGame complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tNextGame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iGameNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sLocalDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sUTCDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeam1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sTeam2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNextGame", propOrder = {
    "iGameNumber",
    "sLocalDateTime",
    "sutcDateTime",
    "sTeam1",
    "sTeam2"
})
public class TNextGame {

    protected int iGameNumber;
    @XmlElement(required = true)
    protected String sLocalDateTime;
    @XmlElement(name = "sUTCDateTime", required = true)
    protected String sutcDateTime;
    @XmlElement(required = true)
    protected String sTeam1;
    @XmlElement(required = true)
    protected String sTeam2;

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
     * Obtiene el valor de la propiedad sLocalDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLocalDateTime() {
        return sLocalDateTime;
    }

    /**
     * Define el valor de la propiedad sLocalDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLocalDateTime(String value) {
        this.sLocalDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad sutcDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUTCDateTime() {
        return sutcDateTime;
    }

    /**
     * Define el valor de la propiedad sutcDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUTCDateTime(String value) {
        this.sutcDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam1() {
        return sTeam1;
    }

    /**
     * Define el valor de la propiedad sTeam1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam1(String value) {
        this.sTeam1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sTeam2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeam2() {
        return sTeam2;
    }

    /**
     * Define el valor de la propiedad sTeam2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeam2(String value) {
        this.sTeam2 = value;
    }

}
