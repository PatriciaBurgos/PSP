
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
 *         &lt;element name="ResultsAllGamesResult" type="{https://footballpool.dataaccess.eu}ArrayOftGameResult"/>
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
    "resultsAllGamesResult"
})
@XmlRootElement(name = "ResultsAllGamesResponse")
public class ResultsAllGamesResponse {

    @XmlElement(name = "ResultsAllGamesResult", required = true)
    protected ArrayOftGameResult resultsAllGamesResult;

    /**
     * Obtiene el valor de la propiedad resultsAllGamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGameResult }
     *     
     */
    public ArrayOftGameResult getResultsAllGamesResult() {
        return resultsAllGamesResult;
    }

    /**
     * Define el valor de la propiedad resultsAllGamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGameResult }
     *     
     */
    public void setResultsAllGamesResult(ArrayOftGameResult value) {
        this.resultsAllGamesResult = value;
    }

}
