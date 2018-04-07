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

public class Str_3 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String chuoi;
	private String result;
	private JTextField tfN1;
	private JTextField tfN2;
	private String so1;
	private String so2;
	/**
	 * Launch the application.
	 */
	public void xuly() {
		int number1, number2;
		chuoi = tfInput.getText();
		so1 = tfN1.getText();
		so2 = tfN2.getText();
		number1 = Integer.parseInt(so1);
		number2 = Integer.parseInt(so2);
		
		
		result = chuoi.substring(number1 - 1,number2);
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_3 frame = new Str_3();
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
	public Str_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(32, 83, 94, 16);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(126, 80, 280, 22);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfKQ = new JTextField();
		tfKQ.setBounds(126, 168, 280, 22);
		contentPane.add(tfKQ);
		tfKQ.setColumns(10);
		
		JLabel lblKQ = new JLabel("Chu\u1ED7i k\u1EBFt qu\u1EA3");
		lblKQ.setBounds(32, 171, 94, 16);
		contentPane.add(lblKQ);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuly();
				tfKQ.setText(result);
				
			}
		});
		btnSubmit.setBounds(194, 203, 97, 25);
		contentPane.add(btnSubmit);
		
		JLabel lblKTu = new JLabel("K\u00FD t\u1EF1 \u0111\u1EA7u");
		lblKTu.setBounds(116, 122, 70, 16);
		contentPane.add(lblKTu);
		
		tfN1 = new JTextField();
		tfN1.setBounds(198, 119, 58, 22);
		contentPane.add(tfN1);
		tfN1.setColumns(10);
		
		tfN2 = new JTextField();
		tfN2.setColumns(10);
		tfN2.setBounds(348, 119, 58, 22);
		contentPane.add(tfN2);
		
		JLabel lblKTCui = new JLabel("K\u00FD t\u1EF1 cu\u1ED1i");
		lblKTCui.setBounds(266, 122, 70, 16);
		contentPane.add(lblKTCui);
	}
}
