
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tGameLevelInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tGameLevelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dFirstGame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iFirstGameID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dLastGame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iLastGameID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGameLevelInfo", propOrder = {
    "iLevel",
    "dFirstGame",
    "iFirstGameID",
    "dLastGame",
    "iLastGameID"
})
public class TGameLevelInfo {

    protected int iLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dFirstGame;
    protected int iFirstGameID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dLastGame;
    protected int iLastGameID;

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
     * Obtiene el valor de la propiedad dFirstGame.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFirstGame() {
        return dFirstGame;
    }

    /**
     * Define el valor de la propiedad dFirstGame.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFirstGame(XMLGregorianCalendar value) {
        this.dFirstGame = value;
    }

    /**
     * Obtiene el valor de la propiedad iFirstGameID.
     * 
     */
    public int getIFirstGameID() {
        return iFirstGameID;
    }

    /**
     * Define el valor de la propiedad iFirstGameID.
     * 
     */
    public void setIFirstGameID(int value) {
        this.iFirstGameID = value;
    }

    /**
     * Obtiene el valor de la propiedad dLastGame.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDLastGame() {
        return dLastGame;
    }

    /**
     * Define el valor de la propiedad dLastGame.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDLastGame(XMLGregorianCalendar value) {
        this.dLastGame = value;
    }

    /**
     * Obtiene el valor de la propiedad iLastGameID.
     * 
     */
    public int getILastGameID() {
        return iLastGameID;
    }

    /**
     * Define el valor de la propiedad iLastGameID.
     * 
     */
    public void setILastGameID(int value) {
        this.iLastGameID = value;
    }

}
