package fr.polytech.datasource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String passwd;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "Invalid Email")
    private String email;

    public User(){
        // Necessary for JPA instantiation process
    }

    public User(String pw, String e){
        passwd = pw;
        email = e;
    }

    public String getPasswd() {
        return passwd;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() { return email; }

    public void setEmail(String e){ email = e; }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        if(getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null)
            return false;
        return getPasswd() != null ? !getPasswd().equals(user.getPasswd()) : user.getPasswd() != null;
    }

    @Override
    public int hashCode() {
        int result = getEmail() != null ? getEmail().hashCode() : 0;
        result = 31 * result + (getPasswd() != null ? getPasswd().hashCode() : 0);
        return result;
    }

}
