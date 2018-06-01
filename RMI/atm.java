import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class atm extends UnicastRemoteObject implements atmITF {
	private int mymoney;
	public atm() throws RemoteException{
		super();
	}
	public int naptien(int inputmoney) {
		mymoney+= inputmoney;
		return inputmoney; //Tra ve tien nap vao
	}
	public int ruttien(int outputmoney) {
		mymoney-= outputmoney;
		return outputmoney; //Tra ve tien da rut
	}
	public int sodu() {
		return mymoney; //kiem tra sodu
	}
}
