package fr.polytech.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface AdminWebService {
    @WebMethod
    int addEvent();
}
