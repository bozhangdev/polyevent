
package admin_web_service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdminWebService", targetNamespace = "http://webservice.polytech.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdminWebService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEvent", targetNamespace = "http://webservice.polytech.fr/", className = "admin_web_service.AddEvent")
    @ResponseWrapper(localName = "addEventResponse", targetNamespace = "http://webservice.polytech.fr/", className = "admin_web_service.AddEventResponse")
    public int addEvent();

}