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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Srt_10 extends JFrame {

	private JPanel contentPane;
	private JTextField tfKQ;
	/**
	 * Launch the application.
	 */
	public void getTime() {
		Calendar ngaygio = Calendar.getInstance();
		tfKQ.setText(String.valueOf(LocalDateTime.now()));

	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Srt_10 frame = new Srt_10();
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
	public Srt_10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpNgy = new JLabel("Th\u1EDDi gian");
		lblNhpNgy.setBounds(36, 89, 65, 16);
		contentPane.add(lblNhpNgy);
		
		tfKQ = new JTextField();
		tfKQ.setBounds(131, 86, 236, 22);
		contentPane.add(tfKQ);
		tfKQ.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTime();
			}
		});
		btnSubmit.setBounds(167, 121, 97, 25);
		contentPane.add(btnSubmit);
	}

}
