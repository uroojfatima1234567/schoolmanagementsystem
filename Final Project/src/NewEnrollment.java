import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.cj.xdevapi.Table;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class NewEnrollment extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField sname;
	private JTextField ftname;
	private JTextField dob;
	private JTextField age;
	JComboBox comboBox;
	JComboBox comboBox1;
	private JTable table;
	DefaultTableModel model;
	private JTextField StdID;
	
	
	


	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEnrollment frame = new NewEnrollment();
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
	public NewEnrollment() {
		
		
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
		lblNewLabel.setBounds(533, 10, 570, 66);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(263, 124, 1023, 589);
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
		btnNewButton_1_1_2.setBounds(898, 544, 115, 35);
		panel_2.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(10, 68, 148, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_1.setBounds(10, 126, 148, 35);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Surname");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_2.setBounds(10, 181, 148, 35);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Father Name");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_3.setBounds(10, 235, 148, 35);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblDateOfBirth.setBounds(10, 289, 148, 35);
		panel_2.add(lblDateOfBirth);
		
		JLabel lblNewLabel_3_5 = new JLabel("Age");
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_5.setBounds(10, 408, 148, 35);
		panel_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Gender");
		lblNewLabel_3_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_6.setBounds(10, 351, 148, 35);
		panel_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Class");
		lblNewLabel_3_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_7.setBounds(10, 461, 148, 35);
		panel_2.add(lblNewLabel_3_7);
		
		JButton btnNewButton_2_1 = new JButton("Show Records");
		btnNewButton_2_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					

					Class.forName("com.mysql.cj.jdbc.Driver");	//Step 1
					Connection	c=DriverManager.getConnection("jdbc:mysql:///schoolmanagementsystem","root","root"); //Step 2
					Statement	s=c.createStatement();	//Step 3
					
					String query="SELECT * from studentdata";
					ResultSet rs= s.executeQuery(query);
					
			
					while(rs.next())
					{
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
				

				catch(Exception ef)
				{
					ef.printStackTrace();
				}
			}
			
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(469, 544, 148, 35);
		panel_2.add(btnNewButton_2_1);
		
		fname = new JTextField();
		fname.setFont(new Font("Tahoma", Font.BOLD, 14));
		fname.setBounds(148, 68, 193, 35);
		panel_2.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lname.setColumns(10);
		lname.setBounds(148, 126, 193, 35);
		panel_2.add(lname);
		
		sname = new JTextField();
		sname.setFont(new Font("Tahoma", Font.BOLD, 14));
		sname.setColumns(10);
		sname.setBounds(148, 181, 193, 35);
		panel_2.add(sname);
		
		ftname = new JTextField();
		ftname.setFont(new Font("Tahoma", Font.BOLD, 14));
		ftname.setColumns(10);
		ftname.setBounds(148, 235, 193, 35);
		panel_2.add(ftname);
		
		dob = new JTextField();
		dob.setFont(new Font("Tahoma", Font.BOLD, 14));
		dob.setColumns(10);
		dob.setBounds(148, 289, 193, 35);
		panel_2.add(dob);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 14));
		age.setColumns(10);
		age.setBounds(148, 408, 193, 35);
		panel_2.add(age);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(362, 10, 651, 511);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int i=table.getSelectedRow();
				StdID.setText(model.getValueAt(i, 0).toString());
				fname.setText(model.getValueAt(i, 1).toString());
				lname.setText(model.getValueAt(i, 2).toString());
				sname.setText(model.getValueAt(i, 3).toString());
				ftname.setText(model.getValueAt(i, 4).toString());
				dob.setText(model.getValueAt(i, 5).toString());
			//	gen.setText(model.getValueAt(i, 6).toString());
				age.setText(model.getValueAt(i, 7).toString());
			//	cl.setText(model.getValueAt(i, 8).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		model=new DefaultTableModel();
		Object[] column = {"ID","First Name","Last Name","Surname","Father Name","DOB","Gender","Age","Class"};
		Object[] row = new Object[9];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(fname.getText().equals("") || lname.getText().equals("") || sname.getText().equals("") || ftname.getText().equals("")
				|| dob.getText().equals("") || comboBox.getSelectedItem().equals("Select") || comboBox1.getSelectedItem().equals("Select") || StdID.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
						}
						else
						{
							String name=fname.getText();
							String namel=lname.getText();
							String sur=sname.getText();
							String fthname=ftname.getText();
							String dateb=dob.getText();
		//					String gender=gen.getText();
							String ag=age.getText();
		//					String cla=cl.getText();
							String box1=(String) comboBox1.getSelectedItem();
							String id=StdID.getText();
							String box=(String) comboBox.getSelectedItem();
							String pay="Unpaid";
							String status="Null";
							String date="Null";
							
				
						
							
							try
							{
								Conn conn= new Conn();
								
								//Database for New Enrollment
								String query = "insert into studentdata values('"+id+"','"+name+"','"+namel+"','"+sur+"','"+fthname+"','"+dateb+
								"','"+box+"','"+ag+"','"+box1+"')";
					
								//Database for Fees Payment
								String query1= "insert into payment values('"+id+"','"+name+"','"+namel+"','"+fthname+"','"+box1+"','"+pay+"')";
								
								//Databse for Attendance
								String query2="insert into attendance values('"+id+"','"+name+"','"+namel+"','"+sur+"','"+fthname+"','"+box1+"','"+date+"','"+status+"')";
								
								conn.s.executeUpdate(query);
								conn.s.executeUpdate(query1);
								conn.s.executeUpdate(query2);
								JOptionPane.showMessageDialog(null, "Record Added");
								
								fname.setText("");
								lname.setText("");
								sname.setText("");
								ftname.setText("");
								dob.setText("");
								comboBox.setSelectedItem("Select");
							//	gen.setText("");
								age.setText("");
								comboBox1.setSelectedItem("Select");
						//		cl.setText("");
								
								NewEnrollment obj = new NewEnrollment();
								obj.main(null);
								//obj.setVisible(true);
								dispose();
							
								
							}
							catch(Exception evt1)
							{
								evt1.printStackTrace();
							}
						}
			}
		});
		btnNewButton_2.setBounds(256, 544, 85, 35);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				


							String sid=StdID.getText();
							
					
							try
							{
								Conn conn= new Conn();
								String query = "delete from studentdata where ID='"+sid+"'";
								String query1 = "delete from payment where ID='"+sid+"'";
								String query2 = "delete from attendance where ID='"+sid+"'";
						
								conn.s.executeUpdate(query);
								conn.s.executeUpdate(query1);
								conn.s.executeUpdate(query2);
								
								JOptionPane.showMessageDialog(null, "Delete Successfully");
								
								NewEnrollment obj = new NewEnrollment();
								obj.main(null);
								//obj.setVisible(true);
								dispose();
								
//								
								
							}
							catch(Exception evt1)
							{
								evt1.printStackTrace();
							}
				
			}
			
		});
		btnNewButton_3.setBounds(362, 544, 85, 35);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Update");
		btnNewButton_3_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(fname.getText().equals("") || lname.getText().equals("") || sname.getText().equals("") || ftname.getText().equals("")
						|| dob.getText().equals("") || comboBox.getSelectedItem().equals("Select") || comboBox1.getSelectedItem().equals("Select") || StdID.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
						}
						else
						{
							
							String name=fname.getText();
							String namel=lname.getText();
							String sur=sname.getText();
							String fthname=ftname.getText();
							String dateb=dob.getText();
							String box=(String) comboBox.getSelectedItem();
					//		String gender=gen.getText();
							String ag=age.getText();
					//		String cla=cl.getText();
							String box1=(String) comboBox1.getSelectedItem();
							String sid=StdID.getText();
							
				
						
							
							try
							{
								Conn conn= new Conn();
						//		String query = "update studentdata set FirstName='"+name+"', LastName='"+namel+"', Surname='"+sur+"', FatherName='"+fthname+"' where ID='"+sid+"'";
										
								String query = "update studentdata set ID='"+sid+"', FirstName='"+name+"', LastName='"+namel+"', Surname='"+sur+"',"
								+ "FatherName='"+fthname+"', DOB='"+dateb+"', Gender='"+box+"', Age='"+ag+"', Class='"+box1+"' where ID='"+sid+"'";
								
								String query1 = "update payment set ID='"+sid+"', FirstName='"+name+"', LastName='"+namel+"',"
								+ "FatherName='"+fthname+"', Class='"+box1+"' where ID='"+sid+"'";
								
								String query2 = "update attendance set ID='"+sid+"', FirstName='"+name+"', LastName='"+namel+"',"
								+ "Surname='"+sur+"',FatherName='"+fthname+"', Class='"+box1+"' where ID='"+sid+"'";
								
								conn.s.executeUpdate(query);
								conn.s.executeUpdate(query1);
								conn.s.executeUpdate(query2);
								JOptionPane.showMessageDialog(null, "Update Successfully");
								
								fname.setText("");
								lname.setText("");
								sname.setText("");
								ftname.setText("");
								dob.setText("");
								comboBox.setSelectedItem("Select");
							//	gen.setText("");
								age.setText("");
								comboBox1.setSelectedItem("Select");
							//	cl.setText("");
								StdID.setText("");
								
								NewEnrollment obj = new NewEnrollment();
								obj.main(null);
								//obj.setVisible(true);
								dispose();
								
								
							
								
							}
							catch(Exception evt1)
							{
								evt1.printStackTrace();
							}
//						}
				
				
				
//				int i=table.getSelectedRow();
//				model.setValueAt(fname.getText(), i, 0);
//				model.setValueAt(lname.getText(), i, 1);
//				model.setValueAt(sname.getText(), i, 2);
//				model.setValueAt(ftname.getText(), i, 3);
//				model.setValueAt(dob.getText(), i, 4);
//				model.setValueAt(gen.getText(), i, 5);
//				model.setValueAt(age.getText(), i, 6);
//				model.setValueAt(cl.getText(), i, 7);
//				
//				JOptionPane.showMessageDialog(null, "Update Successfully");
//				fname.setText("");
//				lname.setText("");
//				sname.setText("");
//				ftname.setText("");
//				dob.setText("");
//				gen.setText("");
//				age.setText("");
//				cl.setText("");
			}
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_1.setBounds(10, 544, 85, 35);
		panel_2.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Student ID");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3_4.setBounds(10, 10, 148, 35);
		panel_2.add(lblNewLabel_3_4);
		
		StdID = new JTextField();
		StdID.setFont(new Font("Tahoma", Font.BOLD, 14));
		StdID.setColumns(10);
		StdID.setBounds(148, 10, 193, 35);
		panel_2.add(StdID);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(148, 351, 193, 31);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		
		comboBox1 = new JComboBox();
		comboBox1.setBounds(148, 461, 192, 30);
		panel_2.add(comboBox1);
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Select", "One", "Two", "Three", "Four"}));
		
			
		JLabel lblNewLabel_4 = new JLabel("New Enrollment");
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(684, 73, 200, 45);
		contentPane.add(lblNewLabel_4);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		
		String name=fname.getText();
		String namel=lname.getText();
		String sur=sname.getText();
		String fthname=ftname.getText();
		String dateb=dob.getText();
	//	String gender=gen.getText();
		String ag=age.getText();
		//String cla=cl.getText();
		String box1=(String) comboBox1.getSelectedItem();
		String box=(String) comboBox.getSelectedItem();
		
		try
		{
			Conn conn= new Conn();
			String query = "insert into studentdata values('"+name+"','"+namel+"','"+sur+"','"+fthname+"','"+dateb+
					"','"+box+"','"+ag+"','"+box1+"')";
			
			conn.s.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Record Added");
			
		}
		catch(Exception evt1)
		{
			evt1.printStackTrace();
		}
		}
}
