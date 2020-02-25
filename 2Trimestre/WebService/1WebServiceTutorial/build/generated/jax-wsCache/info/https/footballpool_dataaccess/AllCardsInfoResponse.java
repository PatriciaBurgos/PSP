
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AllCardsInfoResult" type="{https://footballpool.dataaccess.eu}ArrayOftAllCardsInfo"/>
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
    "allCardsInfoResult"
})
@XmlRootElement(name = "AllCardsInfoResponse")
public class AllCardsInfoResponse {

    @XmlElement(name = "AllCardsInfoResult", required = true)
    protected ArrayOftAllCardsInfo allCardsInfoResult;

    /**
     * Obtiene el valor de la propiedad allCardsInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftAllCardsInfo }
     *     
     */
    public ArrayOftAllCardsInfo getAllCardsInfoResult() {
        return allCardsInfoResult;
    }

    /**
     * Define el valor de la propiedad allCardsInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftAllCardsInfo }
     *     
     */
    public void setAllCardsInfoResult(ArrayOftAllCardsInfo value) {
        this.allCardsInfoResult = value;
    }

}
