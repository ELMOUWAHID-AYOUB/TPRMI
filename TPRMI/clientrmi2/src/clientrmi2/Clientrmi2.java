/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi2;

import config.Config;
import dao.IDao;
import entities.Machine;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author user
 */
public class Clientrmi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://"+Config.port+":"+Config.ip+"/dao");
            dao.create(new Machine("elite","HP",1000));
            dao.create(new Machine("ZERT","lenovo",2000));
            dao.create(new Machine("ETR","dell",3000));
            System.out.println(dao.findAll());
            System.out.println("fin");
            for(Machine m:dao.findAll()){
                System.out.println(m);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
