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

public class bai2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfMax;
	private JTextField tfMin;
	private String s;
	private Integer[] MangInt;
	private String [] MangString;
	private int lengthString;
	/**
	 * Launch the application.
	 */
	public void chuyen() {
		s = tfInput.getText();
		MangString = s.split(",");
		lengthString = MangString.length;
		MangInt = new Integer[lengthString];
		for(int i = 0; i < lengthString; i++) {
			MangInt[i] = Integer.parseInt(MangString[i]);
		}
	}
	
	public void MaxMin() {
		chuyen();
		int max = MangInt[0];
		int min = MangInt[0];
		for(int i = 0; i < lengthString; i++) {
			if(max < MangInt[i] ) {
				max = MangInt[i];
				tfMax.setText(String.valueOf(max));
			}
			if(min < MangInt[i]) {
				tfMin.setText(String.valueOf(min));
			}
		}
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2 frame = new bai2();
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
	public bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpMng = new JLabel("Nh\u1EADp m\u1EA3ng");
		lblNhpMng.setBounds(24, 85, 79, 16);
		contentPane.add(lblNhpMng);
		
		tfInput = new JTextField();
		tfInput.setBounds(96, 82, 225, 22);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfMax = new JTextField();
		tfMax.setBounds(47, 159, 116, 22);
		contentPane.add(tfMax);
		tfMax.setColumns(10);
		
		tfMin = new JTextField();
		tfMin.setColumns(10);
		tfMin.setBounds(228, 159, 116, 22);
		contentPane.add(tfMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(92, 142, 56, 16);
		contentPane.add(lblMax);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(275, 142, 56, 16);
		contentPane.add(lblMin);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaxMin();
			}
		});
		btnSubmit.setBounds(143, 194, 97, 25);
		contentPane.add(btnSubmit);
	}

}
