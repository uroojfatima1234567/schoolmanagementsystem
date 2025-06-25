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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FacultyData extends JFrame {

	private JPanel contentPane;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField Sname;
	private JTextField Quali;
	private JTextField Mobile;
	private JTextField CNIC;
	JComboBox comboBox;
	JComboBox comboBox1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyData frame = new FacultyData();
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
	public FacultyData() {
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
		lblNewLabel.setBounds(488, 10, 570, 66);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(263, 144, 1023, 569);
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
		btnNewButton_1_1_2.setBounds(898, 524, 115, 35);
		panel_2.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Faculty Account");
		btnNewButton_1_1_2_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Faculty obj = new Faculty();
				obj.main(null);
				//obj.setVisible(true);
				
				
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2_1.setBounds(744, 406, 155, 35);
		panel_2.add(btnNewButton_1_1_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 115, 97, 35);
		panel_2.add(lblNewLabel_3);
		
		Fname = new JTextField();
		Fname.setFont(new Font("Tahoma", Font.BOLD, 13));
		Fname.setBounds(124, 115, 155, 29);
		panel_2.add(Fname);
		Fname.setColumns(10);
		
		Lname = new JTextField();
		Lname.setFont(new Font("Tahoma", Font.BOLD, 13));
		Lname.setColumns(10);
		Lname.setBounds(490, 115, 155, 29);
		panel_2.add(Lname);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(376, 115, 97, 35);
		panel_2.add(lblNewLabel_3_1);
		
		Sname = new JTextField();
		Sname.setFont(new Font("Tahoma", Font.BOLD, 13));
		Sname.setColumns(10);
		Sname.setBounds(858, 115, 155, 29);
		panel_2.add(Sname);
		
		JLabel lblNewLabel_3_2 = new JLabel("Surname");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(744, 115, 97, 35);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Gender");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_3.setBounds(10, 220, 104, 35);
		panel_2.add(lblNewLabel_3_3);
		
		Quali = new JTextField();
		Quali.setFont(new Font("Tahoma", Font.BOLD, 13));
		Quali.setColumns(10);
		Quali.setBounds(490, 220, 155, 29);
		panel_2.add(Quali);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Qualification");
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_3_1.setBounds(376, 220, 104, 35);
		panel_2.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Designation");
		lblNewLabel_3_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_3_2.setBounds(744, 220, 104, 35);
		panel_2.add(lblNewLabel_3_3_2);
		
		Mobile = new JTextField();
		Mobile.setFont(new Font("Tahoma", Font.BOLD, 13));
		Mobile.setColumns(10);
		Mobile.setBounds(124, 318, 155, 29);
		panel_2.add(Mobile);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Mobile No");
		lblNewLabel_3_3_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_3_3.setBounds(10, 318, 104, 35);
		panel_2.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("CNIC");
		lblNewLabel_3_3_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_3_4.setBounds(376, 318, 104, 35);
		panel_2.add(lblNewLabel_3_3_4);
		
		CNIC = new JTextField();
		CNIC.setFont(new Font("Tahoma", Font.BOLD, 13));
		CNIC.setColumns(10);
		CNIC.setBounds(490, 318, 155, 29);
		panel_2.add(CNIC);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(Fname.getText().equals("") || Lname.getText().equals("") || Sname.getText().equals("") || comboBox.getSelectedItem().equals("Select")
				|| Quali.getText().equals("") || comboBox1.getSelectedItem().equals("Select") || Mobile.getText().equals("") || CNIC.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
						}
						else
						{
							String name=Fname.getText();
							String namel=Lname.getText();
							String sur=Sname.getText();
						//	String gen=Gen.getText();
							String box=(String) comboBox.getSelectedItem();
							String qualif=Quali.getText();
						//	String desig=Desi.getText();
							String box1=(String) comboBox1.getSelectedItem();
							String mob=Mobile.getText();
							String cnic=CNIC.getText();
							
				
						
							
							try
							{
								Conn conn= new Conn();
								String query = "insert into facultydata values('"+name+"','"+namel+"','"+sur+"','"+box+"','"+qualif+"','"+box1+"','"+mob+"','"+cnic+"')";
								
								conn.s.executeUpdate(query);
								JOptionPane.showMessageDialog(null, "Record Added");
								
								Fname.setText("");
								Lname.setText("");
								Sname.setText("");
								comboBox.setSelectedItem("Select");
					//			Gen.setText("");
								Quali.setText("");
					//			Desi.setText("");
								comboBox1.setSelectedItem("Select");
								Mobile.setText("");
								CNIC.setText("");
							
								
							}
							catch(Exception evt1)
							{
								evt1.printStackTrace();
							}
						}
				
				
				
			}
		});
		btnNewButton_2.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(451, 406, 97, 35);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Show Records");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FacultyRecords obj = new FacultyRecords();
				obj.main(null);
				//obj.setVisible(true);
			
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_2_1.setBounds(124, 406, 146, 35);
		panel_2.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("Appointment");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		lblNewLabel_5.setBounds(451, 30, 163, 35);
		panel_2.add(lblNewLabel_5);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(124, 220, 155, 29);
		panel_2.add(comboBox);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Admin", "Teacher", "Peon", "Security Guard"}));
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox1.setBounds(858, 220, 155, 29);
		panel_2.add(comboBox1);

		
		JLabel lblNewLabel_4 = new JLabel("Faculty");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(687, 86, 173, 45);
		contentPane.add(lblNewLabel_4);
	}
}
