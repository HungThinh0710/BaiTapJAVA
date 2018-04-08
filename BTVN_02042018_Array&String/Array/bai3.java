package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai3 extends JFrame {

	private JPanel contentPane;
	private JTextField tfArr1;
	private JTextField tfArr2;
	private JTextField tfKQ;
	private String arr1;
	private String arr2;
	private Integer [] MangInt1;
	private Integer [] MangInt2;
	private String [] MangString1;
	private String [] MangString2;
	private int LengthString1;
	private int LengthString2;
	/**
	 * Launch the application.
	 */
	public void chuyen() {
		arr1 = tfArr1.getText();
		arr2 = tfArr2.getText();
		 MangString1 = arr1.split(",");
		 MangString2 = arr2.split(",");
		 LengthString1 = MangString1.length;
		 LengthString2 = MangString2.length;
		 MangInt1 = new Integer [LengthString1];
		 MangInt2 = new Integer [LengthString2];
		 for(int i = 0; i < LengthString1; i++) {
			 MangInt1[i] = Integer.parseInt(MangString1[i]);
		 }
		 for(int i = 0; i < LengthString2; i++) {
			 MangInt2[i] = Integer.parseInt(MangString2[i]);
		 }
	}
	public void sosanh() {
		chuyen();
		int result = 0;
		for(int i = 0; i < LengthString1; i++) {
			for(int j = 0; j < LengthString2; j++) {
				if(MangInt1[i] == MangInt2[j]) {
					tfKQ.setText(String.valueOf(MangInt1[i]));
				}
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai3 frame = new bai3();
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
	public bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMngTh = new JLabel("Nh\u1EADp m\u1EA3ng th\u1EE9 1");
		lblNhpMngTh.setBounds(12, 81, 160, 16);
		contentPane.add(lblNhpMngTh);
		
		tfArr1 = new JTextField();
		tfArr1.setBounds(169, 78, 202, 22);
		contentPane.add(tfArr1);
		tfArr1.setColumns(10);
		
		tfArr2 = new JTextField();
		tfArr2.setColumns(10);
		tfArr2.setBounds(169, 122, 202, 22);
		contentPane.add(tfArr2);
		
		JLabel lblArr2 = new JLabel("Nh\u1EADp m\u1EA3ng th\u1EE9 1");
		lblArr2.setBounds(12, 125, 160, 16);
		contentPane.add(lblArr2);
		
		JLabel lblPhnTChung = new JLabel("Ph\u1EA7n t\u1EED chung");
		lblPhnTChung.setBounds(12, 167, 100, 22);
		contentPane.add(lblPhnTChung);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(169, 167, 202, 22);
		contentPane.add(tfKQ);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sosanh();
			}
		});
		btnSubmit.setBounds(211, 215, 97, 25);
		contentPane.add(btnSubmit);
	}
}
