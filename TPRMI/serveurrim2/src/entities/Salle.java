/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
//@NamedNativeQuery(name = "findAllNative",query = "select * from salle",resultClass = Salle.class)
@NamedQuery(name = "findAllS",query = "from Salle")
public class Salle implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    String code;
    
    public Salle() {
    }
    @OneToMany(mappedBy = "salle" , fetch = FetchType.EAGER)
      private List<Machine> machines;
    public Salle(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
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
