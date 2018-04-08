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

public class Str_7 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String chuoi;
	/**
	 * Launch the application.
	 */
	public void xuly() {
		chuoi = tfInput.getText();
		chuoi = chuoi.trim(); // trim == Xóa khoảng cách ở đầu và cuối String;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_7 frame = new Str_7();
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
	public Str_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(32, 84, 94, 21);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(142, 83, 229, 22);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(142, 129, 229, 22);
		contentPane.add(tfKQ);
		
		JLabel lblChuiKtQu = new JLabel("Chu\u1ED7i k\u1EBFt qu\u1EA3");
		lblChuiKtQu.setBounds(32, 130, 94, 21);
		contentPane.add(lblChuiKtQu);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuly();
				tfKQ.setText(chuoi);
			}
		});
		btnSubmit.setBounds(200, 187, 97, 25);
		contentPane.add(btnSubmit);
	}

}
