package runner;

/**
 * Created by py on 2017/10/19.
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.RemoteHelper;


public class ClientRunner {
    private RemoteHelper remoteHelper;

    public ClientRunner() {
        linkToServer();
        //initGUI();
    }

    private void linkToServer() {
        try {
            remoteHelper = RemoteHelper.getInstance();
            remoteHelper.setRemote(Naming.lookup("rmi://localhost:8888/DataRemoteObject"));
            System.out.println("linked");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ClientRunner cr = new ClientRunner();

    }
}