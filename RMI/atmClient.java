import java.rmi.Naming;
import java.util.Scanner;

/*
 * Author: HungThinh0710
 * School: SICT_17IT2
 * Name Project: ATM by RMI
 * 
*/
public class atmClient {
	public static void atm_function() {
		try {
			Scanner keyb = new Scanner(System.in);
			atmITF cal = (atmITF) Naming.lookup("rmi://192.168.1.5/objectATM");
			int choosenumber = 0;
			for(int i = 0; i <= 2; i++) {
				if(i == 0) {
					System.out.print("\n ===== WELCOME TO SICT's ATM ===== \n"
							+ "\n Chon cac thanh phan sau day: "
							+ "\n 1. Nap tien vao tai khoan."
							+ "\n 2. Rut tien trong tai khoan"
							+ "\n 3. Kiem tra so du"
							+ "\n 4. Thoat"
							+ "\n Lua chon ==> ");
					choosenumber = keyb.nextInt();
				}
				if(i == 1) {
					switch(choosenumber) {
					case 1: 
						//Case 1 = nap tien
						System.out.print("\nSo tien ban muon nhap vao: ");
						int tiennhap = keyb.nextInt();
						cal.naptien(tiennhap);
						System.out.print("\nBan da nap vao ngan hang: "+tiennhap +"VND");
						i-=2;
						break;
					case 2:
						//Case 2 = rut tien
						System.out.print("\nSo tien ban muon rut: ");
						int tienrut = keyb.nextInt();
						cal.ruttien(tienrut);
						System.out.print("\n Ban da rut: "+tienrut+"VND tu ngan hang ");
						i-=2;
						break;
					case 3:
						// Kiem tra so du
						int soduTK = cal.sodu();
						System.out.print("\n SO DU HIEN TAI: "+ soduTK + "VND \n");
						i-=2;
						break;
					case 4: 
						i = 3;
						break;
					
					}
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("ATM Client connection");
			atm_function();
	}

}

