package rmiapplication;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author nitishkumarkc
 */
public interface RemoteMethods extends Remote {
    int square(int number) throws RemoteException;
}
