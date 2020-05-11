/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11318066_uas_pbo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class Server extends Main {

    public Server() {
    }
    
    public static void main(String[] args) throws RemoteException {
        try{
          Main obj = new Main();
          AppRemote stub = (AppRemote) UnicastRemoteObject.exportObject(obj, 0);
          Registry registry = LocateRegistry.getRegistry();
          
          registry.bind("AppRemote", stub);
            System.err.println("Server Ready");
        }catch(Exception e){
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
