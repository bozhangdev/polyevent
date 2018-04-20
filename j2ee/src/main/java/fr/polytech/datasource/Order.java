package fr.polytech.datasource;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int price;

    private boolean isPaid = false;

    private boolean isRefused = false;

    private boolean isBought = false;

    private String description;

    public Order(){
        // Necessary for JPA instantiation process
    }
    public Order(int p, String d){
        price = p;
        description = d;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isBought() {
        return isBought;
    }

    public boolean isPaid(){
        return isPaid;
    }

    public boolean isRefused() {
        return isRefused;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setRefused(boolean refused) {
        isRefused = refused;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public void setDesription(String desription) {
        this.description = desription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Order))
            return false;
        Order order = (Order) o;
        if(getDescription() != null ? !getDescription().equals(order.getDescription()) : order.getDescription() != null)
            return false;
        return getId() == order.getId();
    }

    @Override
    public int hashCode() {
        int result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
