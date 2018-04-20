package fr.polytech.webservice;

import fr.polytech.datasource.Demand;
import fr.polytech.domain.DemandSetter;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
public class OrganiserWebServiceImpl implements OrganiserWebService {
    @EJB
    private DemandSetter setter;
    @Override
    public int addDemand(Demand demand) {
        return setter.addDemand(new Demand());
    }
}
