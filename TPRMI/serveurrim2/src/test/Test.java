/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        try {
            IDao<Salle> daoo= new SalleService();
            Salle m1= daoo.findById(1);
            Salle m2= daoo.findById(2);
            Salle m3= daoo.findById(3);
            Salle m4= daoo.findById(4);
            Salle m5= daoo.findById(5);
            Salle m6= daoo.findById(6);
            Salle m7= daoo.findById(7);
            Salle m8= daoo.findById(8);
            Salle m9= daoo.findById(9);
            Salle m10= daoo.findById(10);
            try {
                daoo.create(new Salle("salle1"));
                daoo.create(new Salle("salle2"));
                daoo.create(new Salle("salle3"));
                daoo.create(new Salle("salle4"));
                daoo.create(new Salle("salle5"));
                daoo.create(new Salle("salle6"));
                daoo.create(new Salle("salle7"));
                daoo.create(new Salle("salle8"));
                daoo.create(new Salle("salle9"));
                daoo.create(new Salle("salle10"));
                System.out.println("fin0");
                System.out.println(daoo.findAll());
                System.out.println("fin");
                for(Salle s:daoo.findAll()){
                    System.out.println(s);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                IDao<Machine> dao= new MachineService();
                dao.create(new Machine("elite","HP",1000,m3));
                dao.create(new Machine("ZERT","lenovo",2000,m5));
                dao.create(new Machine("ETR","dell",3000,m7));
                dao.create(new Machine("elite","HP",1000,m9));
                dao.create(new Machine("ZERT","lenovo",2000,m1));
                dao.create(new Machine("ETR","dell",3000,m2));
                dao.create(new Machine("elite","HP",1000,m4));
                dao.create(new Machine("ZERT","lenovo",2000,m6));
                dao.create(new Machine("ETR","dell",3000,m8));
                dao.create(new Machine("ETR","dell",3000,m10));
                System.out.println(dao.findAll());
                System.out.println("fin");
                for(Machine m:dao.findAll()){
                    System.out.println(m);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
