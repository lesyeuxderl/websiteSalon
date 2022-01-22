
package jdbcClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jdbcClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CekKuota_QNAME = new QName("http://webservicesalon/", "cekKuota");
    private final static QName _CekKuotaResponse_QNAME = new QName("http://webservicesalon/", "cekKuotaResponse");
    private final static QName _Hello_QNAME = new QName("http://webservicesalon/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webservicesalon/", "helloResponse");
    private final static QName _ShowJasa_QNAME = new QName("http://webservicesalon/", "showJasa");
    private final static QName _ShowJasaResponse_QNAME = new QName("http://webservicesalon/", "showJasaResponse");
    private final static QName _TambahAntrian_QNAME = new QName("http://webservicesalon/", "tambahAntrian");
    private final static QName _TambahAntrianResponse_QNAME = new QName("http://webservicesalon/", "tambahAntrianResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jdbcClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CekKuota }
     * 
     */
    public CekKuota createCekKuota() {
        return new CekKuota();
    }

    /**
     * Create an instance of {@link CekKuotaResponse }
     * 
     */
    public CekKuotaResponse createCekKuotaResponse() {
        return new CekKuotaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ShowJasa }
     * 
     */
    public ShowJasa createShowJasa() {
        return new ShowJasa();
    }

    /**
     * Create an instance of {@link ShowJasaResponse }
     * 
     */
    public ShowJasaResponse createShowJasaResponse() {
        return new ShowJasaResponse();
    }

    /**
     * Create an instance of {@link TambahAntrian }
     * 
     */
    public TambahAntrian createTambahAntrian() {
        return new TambahAntrian();
    }

    /**
     * Create an instance of {@link TambahAntrianResponse }
     * 
     */
    public TambahAntrianResponse createTambahAntrianResponse() {
        return new TambahAntrianResponse();
    }

    /**
     * Create an instance of {@link Jasa }
     * 
     */
    public Jasa createJasa() {
        return new Jasa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekKuota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "cekKuota")
    public JAXBElement<CekKuota> createCekKuota(CekKuota value) {
        return new JAXBElement<CekKuota>(_CekKuota_QNAME, CekKuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekKuotaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "cekKuotaResponse")
    public JAXBElement<CekKuotaResponse> createCekKuotaResponse(CekKuotaResponse value) {
        return new JAXBElement<CekKuotaResponse>(_CekKuotaResponse_QNAME, CekKuotaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowJasa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "showJasa")
    public JAXBElement<ShowJasa> createShowJasa(ShowJasa value) {
        return new JAXBElement<ShowJasa>(_ShowJasa_QNAME, ShowJasa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowJasaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "showJasaResponse")
    public JAXBElement<ShowJasaResponse> createShowJasaResponse(ShowJasaResponse value) {
        return new JAXBElement<ShowJasaResponse>(_ShowJasaResponse_QNAME, ShowJasaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahAntrian }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "tambahAntrian")
    public JAXBElement<TambahAntrian> createTambahAntrian(TambahAntrian value) {
        return new JAXBElement<TambahAntrian>(_TambahAntrian_QNAME, TambahAntrian.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahAntrianResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesalon/", name = "tambahAntrianResponse")
    public JAXBElement<TambahAntrianResponse> createTambahAntrianResponse(TambahAntrianResponse value) {
        return new JAXBElement<TambahAntrianResponse>(_TambahAntrianResponse_QNAME, TambahAntrianResponse.class, null, value);
    }

}
