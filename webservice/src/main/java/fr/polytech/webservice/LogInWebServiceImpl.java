package fr.polytech.webservice;

import javax.jws.WebService;

@WebService
public class LogInWebServiceImpl implements LogInWebService {
    @Override
    public String logIn(String id, String passWord) {
        if (id.equals("Organiser")){
            return id;
        }
        if (id.equals("Admin")){
            return id;
        }
        else {
            return "error";
        }
    }
}
