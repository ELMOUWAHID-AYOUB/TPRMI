/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;


/**
 *
 * @author user
 */

public class Salle implements Serializable{
    int id ;
    String code;

    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }

    public Salle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
     @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
}
