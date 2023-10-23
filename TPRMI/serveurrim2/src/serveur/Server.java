/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import dao.IDao;
import entities.Machine;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;

/**
 *
 * @author user
 */
public class Server {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao= new MachineService();
            LocateRegistry.createRegistry(1099);
            try {
                Naming.bind("rmi://localhost:1099/dao", dao);
            } catch (AlreadyBoundException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("En attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
 
        }
    }
    
    
}
