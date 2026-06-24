package rmiapplication;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author nitishkumarkc
 */
public class RmiServer {
    public static void main(String[] args) throws RemoteException{
        Registry rg = LocateRegistry.createRegistry(8006);
         CalculationImplementation cil = new CalculationImplementation();
         rg.rebind("Skeleton",cil);
         
    }
}
