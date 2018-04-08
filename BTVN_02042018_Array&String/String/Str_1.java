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

public class Str_1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String arr;
	private int lengthString;
	/**
	 * Launch the application.
	 */
	
	
	public void length() {
		arr = tfInput.getText();
		arr = arr.replaceAll("\\s+",""); // Xóa dấu space 
		lengthString = arr.length();
	
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_1 frame = new Str_1();
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
	public Str_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMngVo = new JLabel("Nhập chuỗi");
		lblNhpMngVo.setBounds(12, 97, 89, 16);
		contentPane.add(lblNhpMngVo);
		
		tfInput = new JTextField();
		tfInput.setBounds(99, 94, 183, 19);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(12, 126, 56, 16);
		contentPane.add(lblKtQu);
		
		tfKQ = new JTextField();
		tfKQ.setBounds(99, 123, 183, 19);
		contentPane.add(tfKQ);
		tfKQ.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				length();
				tfKQ.setText("Có "+lengthString+" ký tự trên đoạn văn");
			}
		});
		btnSubmit.setBounds(145, 172, 97, 25);
		contentPane.add(btnSubmit);
	}
}
