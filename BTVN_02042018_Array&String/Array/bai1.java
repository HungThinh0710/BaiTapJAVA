package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class bai1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfFind;
	private JTextField tfKQ;
	private String s;
	private String s2;
	private int find2;
	private Integer [] MangInt;
	private String [] MangString;
	private int lengthString;
	private JLabel lblKtQu;
	/**
	 * Launch the application.
	 */
	public void chuyen() {
		s = tfInput.getText();
		MangString = s.split(",");
		lengthString = MangString.length;
		MangInt = new Integer[lengthString];
		for(int i = 0; i < lengthString; i++) {
			MangInt[i] = Integer.parseInt(MangString[i]);
		}
	}
	public boolean checkArr() {
		chuyen();
		s2 = tfFind.getText();
		find2 = Integer.parseInt(s2);
		for(int i = 0; i < lengthString; i++) {
			for(int b : MangInt) {
				if( find2 == b) {
					tfKQ.setText("True");
					return true;
				}

			}
			
		}
		tfKQ.setText("False");
		return false;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 frame = new bai1();
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
	public bai1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMng = new JLabel("Nhập mảng");
		lblNhpMng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpMng.setBounds(35, 130, 132, 32);
		contentPane.add(lblNhpMng);
		
		tfInput = new JTextField();
		tfInput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfInput.setBounds(292, 131, 259, 32);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfFind = new JTextField();
		tfFind.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfFind.setColumns(10);
		tfFind.setBounds(292, 172, 259, 32);
		contentPane.add(tfFind);
		
		JLabel lblSCnTm = new JLabel("Số cần tìm trong mảng");
		lblSCnTm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSCnTm.setBounds(35, 175, 217, 29);
		contentPane.add(lblSCnTm);
		
		tfKQ = new JTextField();
		tfKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfKQ.setBounds(366, 217, 116, 29);
		contentPane.add(tfKQ);
		tfKQ.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chuyen();
				checkArr();

				
			}
		});
		btnSubmit.setBounds(376, 252, 97, 25);
		contentPane.add(btnSubmit);
		
		lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKtQu.setBounds(35, 217, 217, 29);
		contentPane.add(lblKtQu);
	}
}
