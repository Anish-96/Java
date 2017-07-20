import java.rmi.*;

public interface RemoteInterface extends Remote
{
  //for now, i will be taking add method as my base method to represent RMI
  public int add(int x, int y) throws RemoteException;
}