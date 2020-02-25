
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bYellow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iGameNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "bYellow",
    "iGameNumber"
})
@XmlRootElement(name = "Cards")
public class Cards {

    protected boolean bYellow;
    protected int iGameNumber;

    /**
     * Obtiene el valor de la propiedad bYellow.
     * 
     */
    public boolean isBYellow() {
        return bYellow;
    }

    /**
     * Define el valor de la propiedad bYellow.
     * 
     */
    public void setBYellow(boolean value) {
        this.bYellow = value;
    }

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

}
