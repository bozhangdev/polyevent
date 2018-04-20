package fr.polytech.domain;

import fr.polytech.datasource.Event;

import java.util.List;

public interface EventSetter {
    boolean addEvent(Event event);
    Event deleteEvent(String id);
    Event modifierEvent(Event event, String eventId);
}
