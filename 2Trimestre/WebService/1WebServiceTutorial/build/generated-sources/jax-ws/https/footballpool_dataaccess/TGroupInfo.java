
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tGroupInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dFirstGameDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dLastGameDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGroupInfo", propOrder = {
    "iId",
    "iLevel",
    "sCode",
    "sDescription",
    "dFirstGameDate",
    "dLastGameDate"
})
public class TGroupInfo {

    protected int iId;
    protected int iLevel;
    @XmlElement(required = true)
    protected String sCode;
    @XmlElement(required = true)
    protected String sDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dFirstGameDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dLastGameDate;

    /**
     * Obtiene el valor de la propiedad iId.
     * 
     */
    public int getIId() {
        return iId;
    }

    /**
     * Define el valor de la propiedad iId.
     * 
     */
    public void setIId(int value) {
        this.iId = value;
    }

    /**
     * Obtiene el valor de la propiedad iLevel.
     * 
     */
    public int getILevel() {
        return iLevel;
    }

    /**
     * Define el valor de la propiedad iLevel.
     * 
     */
    public void setILevel(int value) {
        this.iLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad sCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCode() {
        return sCode;
    }

    /**
     * Define el valor de la propiedad sCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCode(String value) {
        this.sCode = value;
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
     * Obtiene el valor de la propiedad dFirstGameDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFirstGameDate() {
        return dFirstGameDate;
    }

    /**
     * Define el valor de la propiedad dFirstGameDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFirstGameDate(XMLGregorianCalendar value) {
        this.dFirstGameDate = value;
    }

    /**
     * Obtiene el valor de la propiedad dLastGameDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDLastGameDate() {
        return dLastGameDate;
    }

    /**
     * Define el valor de la propiedad dLastGameDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDLastGameDate(XMLGregorianCalendar value) {
        this.dLastGameDate = value;
    }

}
