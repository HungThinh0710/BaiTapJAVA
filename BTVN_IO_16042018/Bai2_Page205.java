package IO_Stream;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2_Page205 extends JFrame {

	private JPanel contentPane;
	private JTextField tfHoTen;
	private JTextField tfNgaysinh;
	private JTextField tfEmail;
	private JTextField tfSdt;
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private int i = 1; //em gán i để kiểm tra lần nhấn
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_Page205 frame = new Bai2_Page205();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bai2_Page205() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfHoTen = new JTextField();
		tfHoTen.setBounds(79, 116, 320, 22);
		contentPane.add(tfHoTen);
		tfHoTen.setColumns(10);
		
		tfNgaysinh = new JTextField();
		tfNgaysinh.setBounds(79, 174, 320, 22);
		contentPane.add(tfNgaysinh);
		tfNgaysinh.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(79, 226, 320, 22);
		contentPane.add(tfEmail);
		
		tfSdt = new JTextField();
		tfSdt.setColumns(10);
		tfSdt.setBounds(79, 278, 320, 22);
		contentPane.add(tfSdt);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(i==1) {
						String hoten = tfHoTen.getText();
						fw = new FileWriter("E:\\Save_hotentf.txt");
						fw.write(hoten);
						fw.flush();
						String ngaysinh = tfNgaysinh.getText();
						fw = new FileWriter("E:\\Save_ngaysinhtf.txt");
						fw.write(ngaysinh);
						fw.flush();
						String email = tfEmail.getText();
						fw = new FileWriter("E:\\Save_emailtf.txt");
						fw.write(email);
						fw.flush();
						String sdt = tfSdt.getText();
						fw = new FileWriter("E:\\Save_phonetf.txt");
						fw.write(sdt);
						fw.flush();
					}
					if(i==2) {
						fr = new FileReader("E:\\Save_hotentf.txt");
						br = new BufferedReader(fr);
						String hoten = null; 
						while((hoten = br.readLine()) != null) {
						tfHoTen.setText(hoten);
						}
						
						fr = new FileReader("E:\\Save_ngaysinhtf.txt");
						br = new BufferedReader(fr);
						String ngaysinh = null; 
						while((ngaysinh = br.readLine()) != null) {
						tfNgaysinh.setText(ngaysinh);
						}
						
						fr = new FileReader("E:\\Save_emailtf.txt");
						br = new BufferedReader(fr);
						String email = null; 
						while((email = br.readLine()) != null) {
						tfEmail.setText(email);
						}
						
						fr = new FileReader("E:\\Save_phonetf.txt");
						br = new BufferedReader(fr);
						String phone_numb = null; 
						while((phone_numb = br.readLine()) != null) {
						tfSdt.setText(phone_numb);
						}

					}
					if(i >= 3 ) {
						//Lần nhấn save thứ 1. i == 1, thực hiện save từ TF vào txt.
						//Lần nhấn save thứ 2. i == 2, thực hiện hiển thị nội dung từ txt ra TF
						i = 1; //Khi nhấn i lần thứ 3. nó sẽ về lại 1
					}
							
					
					i+=1;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					try {
						fw.close();
						br.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}
		});
		btnSave.setBounds(110, 365, 97, 25);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(281, 365, 97, 25);
		contentPane.add(btnCancel);
	}
}
