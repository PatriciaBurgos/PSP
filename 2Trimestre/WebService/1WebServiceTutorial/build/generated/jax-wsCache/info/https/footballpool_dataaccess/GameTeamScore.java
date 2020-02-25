
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
 *         &lt;element name="iGameNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iTeamId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "iGameNumber",
    "iTeamId"
})
@XmlRootElement(name = "GameTeamScore")
public class GameTeamScore {

    protected int iGameNumber;
    protected int iTeamId;

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

}
