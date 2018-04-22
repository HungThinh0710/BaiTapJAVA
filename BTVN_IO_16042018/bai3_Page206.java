package IO_Stream;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class bai3 extends JFrame {

	private JPanel contentPane;
	JTextArea taData;
	private FileReader fr = null; // fr Doc du lieu
	private FileWriter fw = null;
	BufferedReader br;
	private JFileChooser fc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai3 frame = new bai3();
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
	public bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taData = new JTextArea();
		taData.setBounds(54, 50, 315, 140);
		contentPane.add(taData);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					fc = new JFileChooser();
					fc.setDialogTitle("Open File");
					File f = new File("E:\\"); //Gán f thành File và địa chỉ 
					fc.setCurrentDirectory(f); //chỉ file hộp thoại sẽ bung đến f.
					int retrieve = fc.showOpenDialog(null);

					if(retrieve == JFileChooser.APPROVE_OPTION) {
						String path =  fc.getSelectedFile().getAbsolutePath(); //gán đường dẫn vào path
						fr = new FileReader(path); //File Reader sẽ lấy đường dẫn của path
						br = new BufferedReader(fr);//Chuyển kiểu dữ liệu int về kiểu String;
						String s = null; //Tạo một chuỗi String;
						while((s = br.readLine()) != null) {
							taData.append(s+"\n"); //nối chuỗi
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				finally {
					try {
						fr.close();
						br.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		btnOpen.setBounds(83, 203, 97, 25);
		contentPane.add(btnOpen);
		
		JButton btnSaveAs = new JButton("Save as");
		btnSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fc = new JFileChooser(); //Cấp phát bộ nhớ cho JFile Chooser
					fc.setDialogTitle("Save as..."); // Đặt tiêu đề cho Dialog
					File f = new File("E:\\"); // Chỉ đường dẫn ổ E gán vào biến f
					fc.setCurrentDirectory(f); //Chỉ đường dẫn mà hộp thoại Save as sẽ bắt đầu ở root nào.
					int retrieve = fc.showSaveDialog(null); // hiển thị hộp thoại Save as và gán biến trả về vào retrieve 
					if(retrieve == JFileChooser.APPROVE_OPTION) { //kiểm tra biến retrieve sẽ trả về kiểu nào
						String path = fc.getSelectedFile().getAbsolutePath(); // gán đường dẫn mà file đã chọn vào fc. rồi chuyển về "path"
						fr = new FileReader(path); // Cấp phát bộ nhớ cho FileReader
						br = new BufferedReader(fr); //
						String data = taData.getText(); //Lấy dữ liệu từ textArea gán vào chuỗi "data"
						fw = new FileWriter(path); //FileWriter sẽ đọc file từ đường dẫn "path"
						fw.write(data); //Viết dữ liệu trong chuỗi "data".
						fw.flush();
					}
				} catch (Exception ex) {
					// TODO: handle exception
				}
				finally {
					try {
						fw.close();
						br.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		btnSaveAs.setBounds(236, 203, 97, 25);
		contentPane.add(btnSaveAs);
	}
}
