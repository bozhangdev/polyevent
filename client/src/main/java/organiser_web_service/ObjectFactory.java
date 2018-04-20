
package organiser_web_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the organiser_web_service package. 
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

    private final static QName _AddDemandResponse_QNAME = new QName("http://webservice.polytech.fr/", "addDemandResponse");
    private final static QName _AddDemand_QNAME = new QName("http://webservice.polytech.fr/", "addDemand");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: organiser_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddDemand }
     * 
     */
    public AddDemand createAddDemand() {
        return new AddDemand();
    }

    /**
     * Create an instance of {@link AddDemandResponse }
     * 
     */
    public AddDemandResponse createAddDemandResponse() {
        return new AddDemandResponse();
    }

    /**
     * Create an instance of {@link Demand }
     * 
     */
    public Demand createDemand() {
        return new Demand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDemandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polytech.fr/", name = "addDemandResponse")
    public JAXBElement<AddDemandResponse> createAddDemandResponse(AddDemandResponse value) {
        return new JAXBElement<AddDemandResponse>(_AddDemandResponse_QNAME, AddDemandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDemand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polytech.fr/", name = "addDemand")
    public JAXBElement<AddDemand> createAddDemand(AddDemand value) {
        return new JAXBElement<AddDemand>(_AddDemand_QNAME, AddDemand.class, null, value);
    }

}
