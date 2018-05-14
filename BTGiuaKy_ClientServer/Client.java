package clientserver;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class Client extends JFrame  {

	private JPanel contentPane;
	private JTextField tfNhap;
	private static Socket clientSocket;
	private static BufferedReader in,kbd;
	private static PrintWriter out;
	JTextArea tadata ;
	
	class gui extends Thread{
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tadata = new JTextArea();
		tadata.setBounds(12, 13, 454, 331);
		contentPane.add(tadata);
		
		tfNhap = new JTextField();
		tfNhap.setBounds(12, 357, 389, 40);
		contentPane.add(tfNhap);
		tfNhap.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					clientSocket = new Socket("localhost",9005);
			         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			         out = new PrintWriter(clientSocket.getOutputStream(), true /* autoFlush */);
			         System.out.println("Client");
					 System.out.println(in.readLine());			         
			            String Client_tf = tfNhap.getText();
			            
			            //TU Client 
			            out.println(Client_tf);
			            
			            // Doc du lieu tu Server
			            String fromServer= in.readLine();
			            tadata.setText(fromServer);
						
			         
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnSend.setBounds(415, 357, 66, 40);
		contentPane.add(btnSend);
	}
}
