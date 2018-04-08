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
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class bai5 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String arr;
	private Integer[] MangInt;
	private String [] MangString;
	private int lengthString;
	
	
	public void chuyen() {
		arr = tfInput.getText();
		MangString = arr.split(",");
		lengthString = MangString.length;
		MangInt = new Integer [lengthString];
		for(int i = 0; i < lengthString; i++) {
			MangInt[i] = Integer.parseInt(MangString[i]);
		}
	}
	
	public void Sort() {
		chuyen();
		int temp = 0;
		for(int i = 0; i < lengthString; i++) {
			for(int j = i; j < lengthString; j++) {
				if(MangInt[i] > MangInt[j]) {
					temp = MangInt[i];
					MangInt[i] = MangInt[j];
					MangInt[j] = temp;
				}
			}
		}
	}
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai5 frame = new bai5();
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
	public bai5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMngNhpVo = new JLabel("M\u1EA3ng nh\u1EADp v\u00E0o");
		lblMngNhpVo.setBounds(29, 83, 101, 16);
		contentPane.add(lblMngNhpVo);
		
		tfInput = new JTextField();
		tfInput.setBounds(166, 80, 186, 28);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		JLabel lblOut = new JLabel("M\u1EA3ng \u0111\u00E3 s\u1EAFp x\u1EBFp");
		lblOut.setBounds(29, 131, 101, 16);
		contentPane.add(lblOut);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(166, 128, 186, 28);
		contentPane.add(tfKQ);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chuyen();
				Sort();
				tfKQ.setText(Arrays.toString(MangInt));
			}
		});
		btnSubmit.setBounds(207, 194, 97, 25);
		contentPane.add(btnSubmit);
	}

}
