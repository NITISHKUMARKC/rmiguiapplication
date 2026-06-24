package rmiapplication;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author nitishkumarkc
 */
public class RmiClient {
    public static void main(String[] args) throws RemoteException{
        try{
        Registry rg = LocateRegistry.getRegistry("localhost", 8006);
        RemoteMethods stub = (RemoteMethods) rg.lookup("Skeleton");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int result = stub.square(number);
        System.out.println("Square of number is:"+result); 
       }catch(Exception e){
        e.printStackTrace();
    }
}
}