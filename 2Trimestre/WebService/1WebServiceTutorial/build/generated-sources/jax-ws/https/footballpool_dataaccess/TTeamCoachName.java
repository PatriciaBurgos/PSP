
package https.footballpool_dataaccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tTeamCoachName complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTeamCoachName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sTeamName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCoachName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTeamCoachName", propOrder = {
    "sTeamName",
    "sCoachName"
})
public class TTeamCoachName {

    @XmlElement(required = true)
    protected String sTeamName;
    @XmlElement(required = true)
    protected String sCoachName;

    /**
     * Obtiene el valor de la propiedad sTeamName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTeamName() {
        return sTeamName;
    }

    /**
     * Define el valor de la propiedad sTeamName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTeamName(String value) {
        this.sTeamName = value;
    }

    /**
     * Obtiene el valor de la propiedad sCoachName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCoachName() {
        return sCoachName;
    }

    /**
     * Define el valor de la propiedad sCoachName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCoachName(String value) {
        this.sCoachName = value;
    }

}
