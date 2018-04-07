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

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String arr;
	private Integer [] MangInt;
	private String [] MangString;
	private int lengthString;
	private int s;
	public void chuyen() {
		arr = tfInput.getText();
		MangString = arr.split(",");
		lengthString = MangString.length;
		MangInt = new Integer[lengthString];
		for(int i = 0; i < lengthString; i++) {
			MangInt[i] = Integer.parseInt(MangString[i]);
		}
	}
	public void tong() {
		chuyen();
		for(int i = 0; i < lengthString; i++) {
			s+= MangInt[i];
		}
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
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
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMng = new JLabel("Nh\u1EADp m\u1EA3ng");
		lblNhpMng.setBounds(12, 79, 80, 16);
		contentPane.add(lblNhpMng);
		
		tfInput = new JTextField();
		tfInput.setBounds(107, 76, 168, 22);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(107, 123, 168, 22);
		contentPane.add(tfKQ);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(12, 126, 80, 16);
		contentPane.add(lblKtQu);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chuyen();
				tong();
				tfKQ.setText(String.valueOf(s));
			}
		});
		btnSubmit.setBounds(134, 180, 97, 25);
		contentPane.add(btnSubmit);
	}
}
