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
public class ClassFour extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 *
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassFour frame = new ClassFour();
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
	public ClassFour() {
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
		lblNewLabel.setBounds(499, 10, 570, 66);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(263, 97, 1023, 616);
		contentPane.add(panel_2);
		
		JButton btnNewButton_1_1_2 = new JButton("Exit");
		btnNewButton_1_1_2.setBounds(898, 571, 115, 35);
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
		panel_2.setLayout(null);
		btnNewButton_1_1_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(btnNewButton_1_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 1003, 476);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		model=new DefaultTableModel();
		Object[] column = {"ID","First Name","Last Name","Surname","Father Name","DOB","Gender","Age","Class"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		
	
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_3 = new JButton("Show Records");
		btnNewButton_3.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_3.setBounds(10, 571, 142, 35);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent et) {
				
//				Connection c;
//				Statement s;
				
				try 
				{
				
					Class.forName("com.mysql.cj.jdbc.Driver");	//Step 1
				Connection	c=DriverManager.getConnection("jdbc:mysql:///schoolmanagementsystem","root","root"); //Step 2
				Statement	s=c.createStatement();	//Step 3
					String query="SELECT * from studentdata where class in('Four')";
					ResultSet rs= s.executeQuery(query);
					
					
//					String name, namel, sur, fthname, dateb, gender, ag, cla;
					while(rs.next()) {
						
						String id=rs.getString("ID");
						String na=rs.getString("FirstName");
						String nal=rs.getString("LastName");
						String sur2=rs.getString("Surname");
						String fthname2=rs.getString("FatherName");
						String dateb2=rs.getString("DOB");
						String ge=rs.getString("Gender");
						String ag2=rs.getString("Age");
						String clas=rs.getString("Class");
						
						String tbData[]= {id,na, nal, sur2, fthname2, dateb2, ge, ag2, clas};
						DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
						
						tblModel.addRow(tbData);
						
					}
					
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		panel_2.add(btnNewButton_3);
		
//		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Icon2.png"));
//		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Icon3.png"));
//		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
//		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Icon5.png"));
//		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Icon6.png"));
//		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/Icon7.png"));
//		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/Icon8.png"));
//		
		JLabel lblNewLabel_4 = new JLabel("Class Four");
		lblNewLabel_4.setBounds(853, 10, 160, 45);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		
		JLabel lblNewLabel_4_1 = new JLabel("Class Teacher:     Ms. Fahmeeda");
		lblNewLabel_4_1.setBounds(10, 10, 499, 45);
		lblNewLabel_4_1.setFont(new Font("Goudy Old Style", Font.BOLD, 28));
		panel_2.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("Info");
		btnNewButton_2.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Info4 obj=new Info4();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1191, 65, 85, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Classes obj=new Classes();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/back.png"));
		lblNewLabel_3.setIcon(img3);
		lblNewLabel_3.setBounds(263, 65, 45, 25);
		contentPane.add(lblNewLabel_3);
	}
}
