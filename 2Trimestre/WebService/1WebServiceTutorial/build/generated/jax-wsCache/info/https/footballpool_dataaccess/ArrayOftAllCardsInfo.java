
package https.footballpool_dataaccess;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOftAllCardsInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftAllCardsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tAllCardsInfo" type="{https://footballpool.dataaccess.eu}tAllCardsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftAllCardsInfo", propOrder = {
    "tAllCardsInfo"
})
public class ArrayOftAllCardsInfo {

    @XmlElement(nillable = true)
    protected List<TAllCardsInfo> tAllCardsInfo;

    /**
     * Gets the value of the tAllCardsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tAllCardsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAllCardsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAllCardsInfo }
     * 
     * 
     */
    public List<TAllCardsInfo> getTAllCardsInfo() {
        if (tAllCardsInfo == null) {
            tAllCardsInfo = new ArrayList<TAllCardsInfo>();
        }
        return this.tAllCardsInfo;
    }

}
