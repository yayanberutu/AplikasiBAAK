/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11318066_uas_pbo;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ASUS
 */
public class Client {
    private Client(){
        
       
    }
    public static void main(String[] args) throws RemoteException, AccessException, NotBoundException {
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         AppRemote stub = (AppRemote) registry.lookup("AppRemote"); 
         stub.jalankan();
         System.out.println("Remote method Invoked");
    }
    
}
