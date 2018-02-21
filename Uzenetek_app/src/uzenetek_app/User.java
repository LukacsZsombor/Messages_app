package uzenetek_app;


import uzenetek_app.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diak
 */
public class User {
    
    int id;
    String nev;
    
    Set<Message> beerkezo;
    Set<Message> kimeno;

    public User(int id, String nev) {
        this.id = id;
        this.nev = nev;
        this.beerkezo = new HashSet<>();
        this.kimeno = new HashSet<>();
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nev=" + nev + ", beerkezo=" + beerkezo + ", kimeno=" + kimeno + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nev);
        hash = 29 * hash + Objects.hashCode(this.beerkezo);
        hash = 29 * hash + Objects.hashCode(this.kimeno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.beerkezo, other.beerkezo)) {
            return false;
        }
        if (!Objects.equals(this.kimeno, other.kimeno)) {
            return false;
        }
        return true;
    }
  
    public void ujFogadott(Message m) {
        
        beerkezo.add(m);
        
    }
    
    public void ujKimeno(Message m) {
        
        kimeno.add(m);
        
    }
    
    
    
}
