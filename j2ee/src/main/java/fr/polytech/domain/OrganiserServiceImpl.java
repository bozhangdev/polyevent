package fr.polytech.domain;

import fr.polytech.datasource.Demand;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "OrganiserService")
@Local({DemandSetter.class, DemandGetter.class})
public class OrganiserServiceImpl implements DemandSetter, DemandGetter {
    @Override
    public int addDemand(Demand demand) {
        return 1;

    }

    @Override
    public Demand deleteDemand(String demandId) {
        return null;
    }

    @Override
    public Demand modifyDemand(Demand demand, String id) {
        return null;
    }

    @Override
    public List<Demand> getAllDemands() {
        return null;
    }

    @Override
    public Demand getDemand(String demandId) {
        return null;
    }

}
