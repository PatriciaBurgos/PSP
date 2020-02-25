
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
 *         &lt;element name="iGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "iGroupId",
    "iLevel"
})
@XmlRootElement(name = "ResultsAllGames")
public class ResultsAllGames {

    protected int iGroupId;
    protected int iLevel;

    /**
     * Obtiene el valor de la propiedad iGroupId.
     * 
     */
    public int getIGroupId() {
        return iGroupId;
    }

    /**
     * Define el valor de la propiedad iGroupId.
     * 
     */
    public void setIGroupId(int value) {
        this.iGroupId = value;
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

}
