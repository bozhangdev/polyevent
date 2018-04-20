package fr.polytech.datasource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int capacity;
    private String description;
    private boolean hasProjector;
    private boolean hasLoudSpeaker;

    public Room(){

    }

    public Room(int c, String d, boolean p, boolean l){
        capacity = c;
        description = d;
        hasLoudSpeaker = l;
        hasProjector = p;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getId(){
        return id;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public boolean isHasLoudSpeaker() {
        return hasLoudSpeaker;
    }

    public void setHasLoudSpeaker(boolean hasLoudSpeaker) {
        this.hasLoudSpeaker = hasLoudSpeaker;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Order))
            return false;
        Room room = (Room) o;
        if(getDescription() != null ? !getDescription().equals(room.getDescription()) : room.getDescription() != null)
            return false;
        return getId() == room.getId();
    }

    @Override
    public int hashCode() {
        int result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
