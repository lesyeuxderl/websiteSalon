
package jdbcClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tambahAntrian complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tambahAntrian"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idJadwal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tambahAntrian", propOrder = {
    "idMember",
    "idJadwal",
    "tanggal"
})
public class TambahAntrian {

    protected String idMember;
    protected String idJadwal;
    protected String tanggal;

    /**
     * Gets the value of the idMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMember() {
        return idMember;
    }

    /**
     * Sets the value of the idMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMember(String value) {
        this.idMember = value;
    }

    /**
     * Gets the value of the idJadwal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdJadwal() {
        return idJadwal;
    }

    /**
     * Sets the value of the idJadwal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdJadwal(String value) {
        this.idJadwal = value;
    }

    /**
     * Gets the value of the tanggal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Sets the value of the tanggal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggal(String value) {
        this.tanggal = value;
    }

}
