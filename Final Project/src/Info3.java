import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
public class Info3 extends JFrame {

	private JPanel contentPane;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 *
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info3 frame = new Info3();
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
	public Info3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 253, 260);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		lblNewLabel_1.setIcon(img);
		lblNewLabel_1.setBounds(-99, -22, 352, 233);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Holy City Education");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 26));
		lblNewLabel_2.setBounds(21, 209, 222, 41);
		panel.add(lblNewLabel_2);
	
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.windowBorder);
		panel_1.setBounds(0, 256, 253, 457);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New Enrollment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewEnrollment obj=new NewEnrollment();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(50, 103, 155, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Attendance");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Attendance obj=new Attendance();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(50, 157, 155, 35);
		panel_1.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_1_1 = new JButton("Log Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	Login obj=new Login();
					obj.main(null);;
					//obj.setVisible(true);
					dispose();
			    }
			
			}
			
			
			
		});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(67, 412, 115, 35);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Total Students");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TotalStudents obj=new TotalStudents();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(50, 210, 155, 35);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Classes");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Classes obj = new Classes();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_1.setBounds(50, 263, 155, 35);
		panel_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Home");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dashboard obj = new Dashboard();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(67, 10, 115, 35);
		panel_1.add(btnNewButton_1_1_1);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Icon1.png"));
		
		JLabel lblNewLabel = new JLabel("School Management System");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 60));
		lblNewLabel.setBounds(501, 10, 570, 66);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(263, 97, 1023, 616);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1_1_2 = new JButton("Exit");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	System.exit(0);	
			    	//dispose();
			    }
			}
		});
		btnNewButton_1_1_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2.setBounds(898, 571, 115, 35);
		panel_2.add(btnNewButton_1_1_2);
		model=new DefaultTableModel();
		Object[] column = {"First Name","Last Name","Surname","Father Name","DOB","Gender","Age","Class"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		
//		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Icon2.png"));
//		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Icon3.png"));
//		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
//		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Icon5.png"));
//		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Icon6.png"));
//		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/Icon7.png"));
//		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/Icon8.png"));
//		
		JLabel lblNewLabel_4 = new JLabel("Class Three");
		lblNewLabel_4.setBounds(862, 10, 151, 45);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		
		JLabel lblNewLabel_4_1 = new JLabel("Class Teacher:     Ms. Rabail ");
		lblNewLabel_4_1.setFont(new Font("Goudy Old Style", Font.BOLD, 28));
		lblNewLabel_4_1.setBounds(10, 10, 499, 45);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Subjects");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_5.setBounds(104, 65, 115, 44);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("1. English");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(10, 119, 115, 45);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("2. Sindhi");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6_1.setBounds(10, 174, 115, 45);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("3. Mathematics");
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6_2.setBounds(10, 229, 169, 45);
		panel_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("4. Islamiate");
		lblNewLabel_6_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6_3.setBounds(10, 284, 140, 45);
		panel_2.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("5. General Knowledge");
		lblNewLabel_6_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6_4.setBounds(10, 339, 241, 45);
		panel_2.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("Time Table");
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_5_1.setBounds(674, 65, 164, 44);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_5 = new JLabel("08:30 am");
		lblNewLabel_6_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5.setBounds(483, 121, 79, 45);
		panel_2.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_5_1 = new JLabel("09:15 am");
		lblNewLabel_6_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_1.setBounds(572, 121, 79, 45);
		panel_2.add(lblNewLabel_6_5_1);
		
		JLabel lblNewLabel_6_5_2 = new JLabel("10:00 am");
		lblNewLabel_6_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_2.setBounds(661, 121, 79, 45);
		panel_2.add(lblNewLabel_6_5_2);
		
		JLabel lblNewLabel_6_5_3 = new JLabel("10:45 am");
		lblNewLabel_6_5_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_3.setBounds(750, 121, 79, 45);
		panel_2.add(lblNewLabel_6_5_3);
		
		JLabel lblNewLabel_6_5_4 = new JLabel("11:15 am");
		lblNewLabel_6_5_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_4.setBounds(839, 121, 79, 45);
		panel_2.add(lblNewLabel_6_5_4);
		
		JLabel lblNewLabel_6_5_5 = new JLabel("12:00 pm");
		lblNewLabel_6_5_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_5.setBounds(928, 121, 85, 45);
		panel_2.add(lblNewLabel_6_5_5);
		
		JLabel lblNewLabel_6_5_6 = new JLabel("Mon");
		lblNewLabel_6_5_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6.setBounds(422, 176, 46, 45);
		panel_2.add(lblNewLabel_6_5_6);
		
		JLabel lblNewLabel_6_5_6_1 = new JLabel("Tue");
		lblNewLabel_6_5_6_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_1.setBounds(422, 229, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_1);
		
		JLabel lblNewLabel_6_5_6_2 = new JLabel("Wed");
		lblNewLabel_6_5_6_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_2.setBounds(422, 284, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_2);
		
		JLabel lblNewLabel_6_5_6_3 = new JLabel("Thu");
		lblNewLabel_6_5_6_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_3.setBounds(422, 339, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_3);
		
		JLabel lblNewLabel_6_5_6_4 = new JLabel("Fri");
		lblNewLabel_6_5_6_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_4.setBounds(422, 394, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_4);
		
		JLabel lblNewLabel_6_5_6_5 = new JLabel("Sat");
		lblNewLabel_6_5_6_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_5.setBounds(422, 449, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_5);
		
		JLabel lblNewLabel_6_5_6_6 = new JLabel("Sun");
		lblNewLabel_6_5_6_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_6_6.setBounds(422, 504, 46, 45);
		panel_2.add(lblNewLabel_6_5_6_6);
		
		JLabel lblNewLabel_6_5_7 = new JLabel("ENG");
		lblNewLabel_6_5_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7.setBounds(483, 174, 79, 45);
		panel_2.add(lblNewLabel_6_5_7);
		
		JLabel lblNewLabel_6_5_7_1 = new JLabel("SIND");
		lblNewLabel_6_5_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1.setBounds(572, 174, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1);
		
		JLabel lblNewLabel_6_5_7_2 = new JLabel("GK");
		lblNewLabel_6_5_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2.setBounds(661, 174, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2);
		
		JLabel lblNewLabel_6_5_7_3 = new JLabel("Break");
		lblNewLabel_6_5_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_5_7_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_6_5_7_3.setBounds(750, 174, 79, 320);
		panel_2.add(lblNewLabel_6_5_7_3);
		
		JLabel lblNewLabel_6_5_7_4 = new JLabel("MATH");
		lblNewLabel_6_5_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4.setBounds(839, 174, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4);
		
		JLabel lblNewLabel_6_5_7_5 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5.setBounds(928, 174, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5);
		
		JLabel lblNewLabel_6_5_7_6 = new JLabel("ENG");
		lblNewLabel_6_5_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_6.setBounds(483, 229, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_6);
		
		JLabel lblNewLabel_6_5_7_7 = new JLabel("ENG");
		lblNewLabel_6_5_7_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_7.setBounds(483, 284, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_7);
		
		JLabel lblNewLabel_6_5_7_8 = new JLabel("ENG");
		lblNewLabel_6_5_7_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_8.setBounds(483, 339, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_8);
		
		JLabel lblNewLabel_6_5_7_9 = new JLabel("ENG");
		lblNewLabel_6_5_7_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_9.setBounds(483, 394, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_9);
		
		JLabel lblNewLabel_6_5_7_10 = new JLabel("ENG");
		lblNewLabel_6_5_7_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_10.setBounds(483, 449, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_10);
		
		JLabel lblNewLabel_6_5_7_1_1 = new JLabel("SIND");
		lblNewLabel_6_5_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1_1.setBounds(572, 229, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1_1);
		
		JLabel lblNewLabel_6_5_7_1_2 = new JLabel("SIND");
		lblNewLabel_6_5_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1_2.setBounds(572, 284, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1_2);
		
		JLabel lblNewLabel_6_5_7_1_3 = new JLabel("SIND");
		lblNewLabel_6_5_7_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1_3.setBounds(572, 339, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1_3);
		
		JLabel lblNewLabel_6_5_7_1_4 = new JLabel("SIND");
		lblNewLabel_6_5_7_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1_4.setBounds(572, 394, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1_4);
		
		JLabel lblNewLabel_6_5_7_1_5 = new JLabel("SIND");
		lblNewLabel_6_5_7_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_1_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_1_5.setBounds(572, 449, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_1_5);
		
		JLabel lblNewLabel_6_5_7_2_1 = new JLabel("GK");
		lblNewLabel_6_5_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2_1.setBounds(661, 229, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2_1);
		
		JLabel lblNewLabel_6_5_7_2_2 = new JLabel("GK");
		lblNewLabel_6_5_7_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2_2.setBounds(661, 284, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2_2);
		
		JLabel lblNewLabel_6_5_7_2_3 = new JLabel("GK");
		lblNewLabel_6_5_7_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2_3.setBounds(661, 339, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2_3);
		
		JLabel lblNewLabel_6_5_7_2_4 = new JLabel("GK");
		lblNewLabel_6_5_7_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2_4.setBounds(661, 394, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2_4);
		
		JLabel lblNewLabel_6_5_7_2_5 = new JLabel("GK");
		lblNewLabel_6_5_7_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_2_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_2_5.setBounds(661, 449, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_2_5);
		
		JLabel lblNewLabel_6_5_7_4_1 = new JLabel("MATH");
		lblNewLabel_6_5_7_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4_1.setBounds(839, 229, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4_1);
		
		JLabel lblNewLabel_6_5_7_4_2 = new JLabel("MATH");
		lblNewLabel_6_5_7_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4_2.setBounds(839, 284, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4_2);
		
		JLabel lblNewLabel_6_5_7_4_3 = new JLabel("MATH");
		lblNewLabel_6_5_7_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4_3.setBounds(839, 339, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4_3);
		
		JLabel lblNewLabel_6_5_7_4_4 = new JLabel("MATH");
		lblNewLabel_6_5_7_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4_4.setBounds(839, 394, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4_4);
		
		JLabel lblNewLabel_6_5_7_4_5 = new JLabel("MATH");
		lblNewLabel_6_5_7_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_4_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_4_5.setBounds(839, 449, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_4_5);
		
		JLabel lblNewLabel_6_5_7_5_1 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5_1.setBounds(928, 229, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5_1);
		
		JLabel lblNewLabel_6_5_7_5_2 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5_2.setBounds(928, 284, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5_2);
		
		JLabel lblNewLabel_6_5_7_5_3 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5_3.setBounds(928, 339, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5_3);
		
		JLabel lblNewLabel_6_5_7_5_4 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5_4.setBounds(928, 394, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5_4);
		
		JLabel lblNewLabel_6_5_7_5_5 = new JLabel("ISLM");
		lblNewLabel_6_5_7_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5_7_5_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_7_5_5.setBounds(928, 449, 79, 45);
		panel_2.add(lblNewLabel_6_5_7_5_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("Public Holiday");
		lblNewLabel_6_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6_6.setBounds(660, 502, 169, 45);
		panel_2.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_5_8 = new JLabel("Day");
		lblNewLabel_6_5_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5_8.setBounds(422, 119, 79, 45);
		panel_2.add(lblNewLabel_6_5_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(422, 162, 591, 14);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 49, 1003, 14);
		panel_2.add(separator_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClassThree obj=new ClassThree();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
				
				
			}
		});
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/back.png"));
		lblNewLabel_3.setIcon(img3);
		lblNewLabel_3.setBounds(263, 62, 45, 25);
		contentPane.add(lblNewLabel_3);
		
	}
}
