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

public class Str_4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String chuoi;
	private String rs;
	/**
	 * Launch the application.
	 */
	public void xuly() {
		chuoi = tfInput.getText();
		rs = chuoi.toLowerCase();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_4 frame = new Str_4();
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
	public Str_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(37, 87, 107, 16);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(137, 84, 235, 22);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(137, 132, 235, 22);
		contentPane.add(tfKQ);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(37, 135, 107, 16);
		contentPane.add(lblKtQu);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuly();
				tfKQ.setText(rs);
			}
		});
		btnSubmit.setBounds(189, 189, 97, 25);
		contentPane.add(btnSubmit);
	}

}
