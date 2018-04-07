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

public class Str_2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfStr1;
	private JTextField tfKQ;
	private JTextField tfStr2;
	private String str1;
	private String str2;
	private String [] string1;
	private String [] string2;
	private int lengthString;
	/**
	 * Launch the application.
	 */
	public void XuLy() {
		str1 = tfStr1.getText();
		str2 = tfStr2.getText();
		string1 = str1.split("");
		lengthString = string1.length;
		string1 = str1.split("\\s+"); // Lấy từ trước dấu space vào lưu vào string1 [0]
		string2 = str2.split("\\s+"); // Lấy từ trước dấu space vào lưu vào string2 [0]
		for(int i = 0; i < lengthString; i++) {
			if(string2[0].startsWith(string1[0])) tfKQ.setText("Có từ  ==>"+ string2[0] + "<== trong đầu chuỗi 1 và đầu chuỗi 2"); // so sánh [0] = [0]
			else tfKQ.setText("FALSE");
		}

	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_2 frame = new Str_2();
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
	public Str_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMng = new JLabel("Nh\u1EADp chu\u1ED7i 1");
		lblNhpMng.setBounds(24, 95, 111, 16);
		contentPane.add(lblNhpMng);
		
		tfStr1 = new JTextField();
		tfStr1.setBounds(147, 92, 164, 22);
		contentPane.add(tfStr1);
		tfStr1.setColumns(10);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(24, 166, 111, 16);
		contentPane.add(lblKtQu);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(72, 163, 337, 22);
		contentPane.add(tfKQ);
		
		tfStr2 = new JTextField();
		tfStr2.setColumns(10);
		tfStr2.setBounds(147, 131, 164, 22);
		contentPane.add(tfStr2);
		
		JLabel lblNhpChui = new JLabel("Nh\u1EADp chu\u1ED7i 2");
		lblNhpChui.setBounds(24, 134, 111, 16);
		contentPane.add(lblNhpChui);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XuLy();
			}
		});
		btnSubmit.setBounds(173, 201, 97, 25);
		contentPane.add(btnSubmit);
	}
}
