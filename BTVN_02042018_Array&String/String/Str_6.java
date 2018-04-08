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

public class Str_6 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String chuoi;
	/**
	 * Launch the application.
	 */
	public void replace() {
		chuoi = tfInput.getText();
		chuoi = chuoi.replaceAll("d", "f");
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_6 frame = new Str_6();
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
	public Str_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(38, 99, 93, 16);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(146, 96, 203, 19);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		JLabel lblChuiKtQu = new JLabel("Chu\u1ED7i k\u1EBFt qu\u1EA3");
		lblChuiKtQu.setBounds(38, 145, 93, 16);
		contentPane.add(lblChuiKtQu);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(146, 142, 203, 19);
		contentPane.add(tfKQ);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				replace();
					tfKQ.setText(chuoi);
				
			}
		});
		btnSubmit.setBounds(191, 192, 97, 25);
		contentPane.add(btnSubmit);
	}

}
