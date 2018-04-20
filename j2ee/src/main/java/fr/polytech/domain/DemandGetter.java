package fr.polytech.domain;

import fr.polytech.datasource.Demand;

import java.util.List;

public interface DemandGetter {
    List<Demand> getAllDemands();
    Demand getDemand(String demandId);
}
