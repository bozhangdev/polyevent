package fr.polytech.domain;

import fr.polytech.datasource.Event;

import java.util.List;

public interface EventGetter {
    Event getEventById(String id);
    List<Event> getAllEvents();
}
