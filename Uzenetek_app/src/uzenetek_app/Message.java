package uzenetek_app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diak
 */
public class Message {
 
    String torzs;
    User Felado;
    User címzett;

    public Message(String torzs, User Felado, User címzett) {
        this.torzs = torzs;
        this.Felado = Felado;
        this.címzett = címzett;
    }

    @Override
    public String toString() {
        return "Message{" + "torzs=" + torzs + '}';
    }
    
    
    
    
    
}
