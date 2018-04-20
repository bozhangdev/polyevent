package fr.polytech.datasource;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.validation.constraints.NotNull;


@Entity
public class Staff extends User implements Serializable {

    @NotNull
    private String departement;

    public Staff(){
        // Necessary for JPA instantiation process
    }

    public Staff(String n,String e, String d){
        super(n,e);
        departement = d;

    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String d){
        departement =  d;
    }

    @Override
    public boolean equals(Object o){
        if(super.equals(o)){
            if (!(o instanceof User))
                return false;
            else{
                Staff staff = (Staff) o;
                return getDepartement() != null ? ! getDepartement().equals(staff.getDepartement()) : staff.getDepartement() != null;
            }
        }
        else
            return false;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = 31 * result + (getDepartement() != null ? getDepartement().hashCode() : 0);
        return result;
    }

}