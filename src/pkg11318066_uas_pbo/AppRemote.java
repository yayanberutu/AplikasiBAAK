/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11318066_uas_pbo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ASUS
 */
public interface AppRemote extends Remote {
    void jalankan()throws RemoteException;

}
