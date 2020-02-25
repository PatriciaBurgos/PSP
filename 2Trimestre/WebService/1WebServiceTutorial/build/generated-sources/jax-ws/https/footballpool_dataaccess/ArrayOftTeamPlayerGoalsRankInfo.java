
package https.footballpool_dataaccess;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOftTeamPlayerGoalsRankInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftTeamPlayerGoalsRankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tTeamPlayerGoalsRankInfo" type="{https://footballpool.dataaccess.eu}tTeamPlayerGoalsRankInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftTeamPlayerGoalsRankInfo", propOrder = {
    "tTeamPlayerGoalsRankInfo"
})
public class ArrayOftTeamPlayerGoalsRankInfo {

    @XmlElement(nillable = true)
    protected List<TTeamPlayerGoalsRankInfo> tTeamPlayerGoalsRankInfo;

    /**
     * Gets the value of the tTeamPlayerGoalsRankInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTeamPlayerGoalsRankInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTeamPlayerGoalsRankInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTeamPlayerGoalsRankInfo }
     * 
     * 
     */
    public List<TTeamPlayerGoalsRankInfo> getTTeamPlayerGoalsRankInfo() {
        if (tTeamPlayerGoalsRankInfo == null) {
            tTeamPlayerGoalsRankInfo = new ArrayList<TTeamPlayerGoalsRankInfo>();
        }
        return this.tTeamPlayerGoalsRankInfo;
    }

}
