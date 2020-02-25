
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GroupFirstGameDateResult" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "groupFirstGameDateResult"
})
@XmlRootElement(name = "GroupFirstGameDateResponse")
public class GroupFirstGameDateResponse {

    @XmlElement(name = "GroupFirstGameDateResult", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar groupFirstGameDateResult;

    /**
     * Obtiene el valor de la propiedad groupFirstGameDateResult.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGroupFirstGameDateResult() {
        return groupFirstGameDateResult;
    }

    /**
     * Define el valor de la propiedad groupFirstGameDateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGroupFirstGameDateResult(XMLGregorianCalendar value) {
        this.groupFirstGameDateResult = value;
    }

}
