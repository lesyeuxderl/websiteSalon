
package jdbcClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jasa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jasa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hargaJasa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idJasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namaJasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jasa", propOrder = {
    "hargaJasa",
    "idJasa",
    "namaJasa"
})
public class Jasa {

    protected Integer hargaJasa;
    protected String idJasa;
    protected String namaJasa;

    /**
     * Gets the value of the hargaJasa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHargaJasa() {
        return hargaJasa;
    }

    /**
     * Sets the value of the hargaJasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHargaJasa(Integer value) {
        this.hargaJasa = value;
    }

    /**
     * Gets the value of the idJasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdJasa() {
        return idJasa;
    }

    /**
     * Sets the value of the idJasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdJasa(String value) {
        this.idJasa = value;
    }

    /**
     * Gets the value of the namaJasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaJasa() {
        return namaJasa;
    }

    /**
     * Sets the value of the namaJasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaJasa(String value) {
        this.namaJasa = value;
    }

}
