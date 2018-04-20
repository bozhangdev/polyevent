package fr.polytech.domain;

import fr.polytech.datasource.Material;

public interface EventFinanceManager {
    int getRequiredMaterialQuantiy(Material material);
    boolean setEventPaid(String eventId);
}
