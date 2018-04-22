package IO_Stream;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class bai7 extends JFrame {
	
	private JPanel contentPane;
	FileWriter fw;
	JFileChooser fc;
	JTextArea taInput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai7 frame = new bai7();
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
	public bai7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taInput = new JTextArea();
		taInput.setBounds(12, 13, 629, 259);
		contentPane.add(taInput);
		
		JButton btnSaveAs = new JButton("Save As");
		btnSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					fc = new JFileChooser();
					fc.setDialogTitle("Save as...");
					File f = new File("E:\\");
					fc.setCurrentDirectory(f);
					int retrieve = fc.showSaveDialog(null);
					if(retrieve == JFileChooser.APPROVE_OPTION) {
						String path = fc.getSelectedFile().getAbsolutePath();
						fw = new FileWriter(path);
						String data = taInput.getText();
						fw.write(data);
						fw.flush();
					}	
				}
				catch(Exception ex) {
				}
				finally {
					try {
						fw.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}

				}
		});
		btnSaveAs.setBounds(253, 285, 97, 25);
		contentPane.add(btnSaveAs);
	}
}
