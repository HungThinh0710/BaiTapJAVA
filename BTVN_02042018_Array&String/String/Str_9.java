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

public class Str_9 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private JTextField tftt1;
	private JTextField tftt2;
	private String chuoi;
	private String rs1;
	private String rs2;
	private String ketqua;
	/**
	 * Launch the application.
	 */
	public void xuly(){
		chuoi = tfInput.getText();
		rs1 = tftt1.getText();
		rs2 = tftt2.getText();
		ketqua = chuoi.replace(rs1, rs2);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_9 frame = new Str_9();
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
	public Str_9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(12, 91, 90, 16);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(125, 88, 191, 19);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(125, 164, 191, 19);
		contentPane.add(tfKQ);
		
		JLabel lblChuiKtQu = new JLabel("Chu\u1ED7i k\u1EBFt qu\u1EA3");
		lblChuiKtQu.setBounds(12, 167, 90, 16);
		contentPane.add(lblChuiKtQu);
		
		JLabel lblNewLabel = new JLabel("T\u1EEB thay th\u1EBF");
		lblNewLabel.setBounds(43, 123, 81, 16);
		contentPane.add(lblNewLabel);
		
		tftt1 = new JTextField();
		tftt1.setBounds(124, 120, 68, 22);
		contentPane.add(tftt1);
		tftt1.setColumns(10);
		
		tftt2 = new JTextField();
		tftt2.setColumns(10);
		tftt2.setBounds(311, 120, 68, 22);
		contentPane.add(tftt2);
		
		JLabel lblTSThay = new JLabel("T\u1EEB s\u1EBD thay th\u1EBF");
		lblTSThay.setBounds(207, 123, 96, 16);
		contentPane.add(lblTSThay);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuly();
				tfKQ.setText(ketqua);
			}
		});
		btnSubmit.setBounds(172, 215, 97, 25);
		contentPane.add(btnSubmit);
	}

}
