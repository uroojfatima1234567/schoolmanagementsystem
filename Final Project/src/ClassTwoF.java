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
import javax.swing.DefaultComboBoxModel;
public class ClassTwoF extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	DefaultTableModel model;
	private JTextField ID;
	private JTextField Date;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 *
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassTwoF frame = new ClassTwoF();
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
	public ClassTwoF() {
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
		
		
		
		JButton btnNewButton_1_1 = new JButton("Log Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	Facultymode obj=new Facultymode();
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
		
		JButton btnNewButton_1_1_1 = new JButton("Home");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClassTwoF obj = new ClassTwoF();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(67, 10, 115, 35);
		panel_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Student ID");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 151, 99, 26);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Attendance");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(67, 89, 115, 35);
		panel_1.add(lblNewLabel_3);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.BOLD, 14));
		ID.setColumns(10);
		ID.setBounds(119, 151, 115, 25);
		panel_1.add(ID);
		
		JLabel lblNewLabel_5_2 = new JLabel("Date");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(10, 187, 99, 26);
		panel_1.add(lblNewLabel_5_2);
		
		Date = new JTextField();
		Date.setFont(new Font("Tahoma", Font.BOLD, 14));
		Date.setColumns(10);
		Date.setBounds(119, 187, 115, 25);
		panel_1.add(Date);
		
		JLabel lblNewLabel_5_1 = new JLabel("Status");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(10, 225, 99, 26);
		panel_1.add(lblNewLabel_5_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Present", "Absent", "Leave"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(119, 225, 115, 26);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ID.getText().equals("") || comboBox.getSelectedItem().equals("Select"))
				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				else
				{
					
					String id=ID.getText();
					String box=(String) comboBox.getSelectedItem();
					String date=Date.getText();					
					
		
				
					
					try
					{
						Conn conn= new Conn();
						String query = "update attendance set Status='"+box+"', Date='"+date+"' where ID='"+id+"'";
								
					
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Update Successfully");
						
						ID.setText("");
						comboBox.setSelectedItem("Select");
				
					}
					catch(Exception evt1)
					{
						evt1.printStackTrace();
					}
		
		
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.setBounds(169, 261, 65, 26);
		panel_1.add(btnNewButton);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Icon1.png"));
		
		JLabel lblNewLabel = new JLabel("School Management System");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 60));
		lblNewLabel.setBounds(500, 10, 570, 66);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 1003, 479);
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
					String query="SELECT * from studentdata where class in('Two')";
					ResultSet rs= s.executeQuery(query);
					

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
		btnNewButton_3.setBounds(10, 571, 142, 35);
		panel_2.add(btnNewButton_3);
				
		JLabel lblNewLabel_4 = new JLabel("Class Two");
		lblNewLabel_4.setBounds(881, 10, 132, 45);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		
		JLabel lblNewLabel_4_1 = new JLabel("Class Teacher:     Mr. Noman Rajput");
		lblNewLabel_4_1.setFont(new Font("Goudy Old Style", Font.BOLD, 28));
		lblNewLabel_4_1.setBounds(10, 10, 499, 45);
		panel_2.add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("Info");
		btnNewButton_2.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Info2F obj=new Info2F();
				obj.main(null);
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(1191, 62, 85, 25);
		contentPane.add(btnNewButton_2);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/back.png"));
	}
}
