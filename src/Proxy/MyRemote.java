package Proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    //Every remote method call is considered ‘risky’. Declaring
    //RemoteException on every method forces the client
    //to pay attention and acknowledge that things
    //might not work.
    public String sayHello() throws RemoteException;
}
