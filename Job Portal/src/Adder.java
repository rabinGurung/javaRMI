import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int sum(int x, int y) throws RemoteException;
}
