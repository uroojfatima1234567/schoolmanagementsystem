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
import javax.swing.JSeparator;
public class Card extends JFrame {

	private JPanel contentPane;
	DefaultTableModel model;
	
	JLabel sname;
	JLabel fname;
	JLabel year;
	JLabel DOB;
	/**
	 * Launch the application.
	 *
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card frame = new Card();
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
	public Card() {
		
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
		lblNewLabel.setBounds(501, 21, 570, 66);
		contentPane.add(lblNewLabel);
		model=new DefaultTableModel();
		Object[] column = {"First Name","Last Name","Surname","Father Name","DOB","Gender","Age","Class"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IDcard obj=new IDcard();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
				
				
			}
		});
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/back.png"));
		lblNewLabel_3.setIcon(img3);
		lblNewLabel_3.setBounds(263, 62, 45, 25);
		contentPane.add(lblNewLabel_3);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBounds(10, 10, 1003, 549);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(341, 50, 332, 439);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.activeCaption);
		panel_5.setBounds(0, 0, 332, 53);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Student ID Card");
		lblNewLabel_4_1.setBounds(101, 18, 135, 25);
		panel_5.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		
		JLabel lblNewLabel_5 = new JLabel("HOLY CITY EDUCATION");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(64, 143, 201, 25);
		panel_4.add(lblNewLabel_5);
		
		sname = new JLabel("");
		sname.setHorizontalAlignment(SwingConstants.CENTER);
		sname.setBounds(42, 257, 259, 35);
		panel_4.add(sname);
		sname.setFont(new Font("Pristina", Font.BOLD, 20));
		
		JLabel lblNewLabel_6_1_1 = new JLabel("S/o / D/o");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6_1_1.setBounds(77, 281, 100, 34);
		panel_4.add(lblNewLabel_6_1_1);
		
		fname = new JLabel("");
		fname.setHorizontalAlignment(SwingConstants.LEFT);
		fname.setBounds(176, 284, 145, 35);
		panel_4.add(fname);
		fname.setFont(new Font("Pristina", Font.BOLD, 20));
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(196, 359, 128, 2);
		panel_4.add(separator_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Registrar");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(227, 359, 74, 25);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Ibrahim Mahesar");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Papyrus", Font.BOLD, 15));
		lblNewLabel_7.setBounds(196, 336, 123, 25);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Logo2.jpeg"));
		lblNewLabel_8 .setIcon(img2);
		lblNewLabel_8.setBounds(111, 63, 112, 70);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_2 = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Logo4.png"));
		lblNewLabel_8_2 .setIcon(img5);
		lblNewLabel_8_2.setBounds(10, 314, 112, 70);
		panel_4.add(lblNewLabel_8_2);
		
		DOB = new JLabel("");
		DOB.setHorizontalAlignment(SwingConstants.CENTER);
		DOB.setFont(new Font("Pristina", Font.BOLD, 25));
		DOB.setBounds(683, 246, 147, 35);
		panel_4.add(DOB);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Profile.png"));
		lblNewLabel_8_1 .setIcon(img6);
		lblNewLabel_8_1.setBounds(125, 166, 89, 92);
		panel_4.add(lblNewLabel_8_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(SystemColor.activeCaption);
		panel_5_1.setBounds(0, 386, 332, 53);
		panel_4.add(panel_5_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Student Registration No:");
		lblNewLabel_6_2.setBounds(36, 12, 137, 25);
		panel_5_1.add(lblNewLabel_6_2);
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblNewLabel_6 = new JLabel("HC-");
		lblNewLabel_6.setBounds(183, 10, 35, 25);
		panel_5_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		year = new JLabel("");
		year.setBounds(214, 10, 147, 25);
		panel_5_1.add(year);
		year.setHorizontalAlignment(SwingConstants.LEFT);
		year.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2.setBounds(898, 571, 115, 35);
		panel_2.add(btnNewButton_1_1_2);
		
	}
}
