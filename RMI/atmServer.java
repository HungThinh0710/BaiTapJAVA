import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class atmServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			atm callObject = new atm();
			LocateRegistry.createRegistry(1097);
			Naming.rebind("objectATM", callObject);
			System.out.print("Dang ky ATM_Server thanh cong");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

}
