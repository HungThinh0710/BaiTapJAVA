import java.rmi.Remote;
import java.rmi.RemoteException;

public interface atmITF extends Remote{
	public int naptien(int inputmoney) throws RemoteException;
	public int ruttien(int outputmoney) throws RemoteException;
	public int sodu() throws RemoteException;
}
