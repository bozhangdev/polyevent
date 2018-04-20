package fr.polytech.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface LogInWebService {
    @WebMethod
    String logIn(String id, String passWord);
}
