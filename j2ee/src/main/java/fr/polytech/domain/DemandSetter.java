package fr.polytech.domain;

import fr.polytech.datasource.Demand;

import javax.ejb.Local;

public interface DemandSetter {
    int addDemand(Demand demand);
    Demand deleteDemand(String demandId);
    Demand modifyDemand(Demand demand, String id);
}
