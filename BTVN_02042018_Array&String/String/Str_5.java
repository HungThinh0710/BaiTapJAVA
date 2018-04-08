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

public class Str_5 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfKQ;
	private String srt;
	private String rs;
	/**
	 * Launch the application.
	 */
	public void InHoa(){
		srt = tfInput.getText();
		rs = srt.toUpperCase();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Str_5 frame = new Str_5();
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
	public Str_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuiBanu = new JLabel("Chu\u1ED7i ban \u0111\u1EA7u");
		lblChuiBanu.setBounds(36, 87, 82, 16);
		contentPane.add(lblChuiBanu);
		
		tfInput = new JTextField();
		tfInput.setBounds(169, 84, 273, 19);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		JLabel lblChuiIn = new JLabel("Chu\u1ED7i \u0111\u00E3 in hoa");
		lblChuiIn.setBounds(36, 120, 109, 16);
		contentPane.add(lblChuiIn);
		
		tfKQ = new JTextField();
		tfKQ.setColumns(10);
		tfKQ.setBounds(169, 117, 273, 19);
		contentPane.add(tfKQ);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InHoa();
				tfKQ.setText(rs);
			}
		});
		btnSubmit.setBounds(211, 171, 97, 25);
		contentPane.add(btnSubmit);
	}

}
