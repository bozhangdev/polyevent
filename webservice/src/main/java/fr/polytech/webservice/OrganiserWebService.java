package fr.polytech.webservice;


import fr.polytech.datasource.Demand;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrganiserWebService {
    @WebMethod
    int addDemand(Demand demand);
}
