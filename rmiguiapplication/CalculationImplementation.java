package rmiapplication;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author nitishkumarkc
 */
public class CalculationImplementation extends UnicastRemoteObject implements RemoteMethods {
    CalculationImplementation() throws RemoteException{
        super();
    }
    @Override
    public int square(int number){
        return number*number;
    }
}
