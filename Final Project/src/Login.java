
import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;


public class Login {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField passwordField;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.

	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 50, 1095, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Pic2.jpg"));
		frame.getContentPane().setLayout(null);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Logo.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(394, 265, 138, 58);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(394, 344, 138, 58);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtusername.setForeground(new Color(0, 0, 0));
		txtusername.setBounds(542, 277, 199, 33);
		txtusername.setBackground(SystemColor.activeCaptionBorder);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		

		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpassword.setBounds(542, 356, 199, 33);
		txtpassword.setBackground(SystemColor.activeCaptionBorder);
		frame.getContentPane().add(txtpassword);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(509, 120, 101, 102);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Lock.png"));
		lblNewLabel_2.setIcon(img2);
				
		JLabel lblNewLabel_3 = new JLabel("Admin Login");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(464, 232, 189, 33);
		frame.getContentPane().add(lblNewLabel_3);
						
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String pass = txtpassword.getText();
				
				String user = txtusername.getText();
				
				try {
					//////////////////////////////////////////////////
					Conn c=new Conn();	//Object class Conn Database
					String query="select * from login where username = '"+user+ "' and password = '"+pass+"'";
					ResultSet rs=c.s.executeQuery(query);
					///////////////////////////////
					
					//Database
					
					if(rs.next())
					{
						
						int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log in?",
								"Confirm", JOptionPane.YES_NO_OPTION);
						 
					    if (result == JOptionPane.OK_OPTION) 
					    {
					    	Dashboard obj=new Dashboard();
							obj.main(null);;
							//obj.setVisible(true);
							frame.dispose();
					    }
					     
					}
					
					  else
						{
					 
							JOptionPane.showMessageDialog(null, "Invalid Username and Password");
							txtpassword.setText(null);
							txtusername.setText(null);
						}
					
				}
				
				catch(Exception h)
				{
					h.printStackTrace();
				}
			
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(394, 427, 85, 33);
		frame.getContentPane().add(btnNewButton);
								
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			txtpassword.setText(null);
			txtusername.setText(null);
			
		}
		});	
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(525, 427, 85, 33);
		frame.getContentPane().add(btnReset);
										
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
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
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnCancel.setBounds(656, 427, 85, 33);
		frame.getContentPane().add(btnCancel);
		
		JButton btnNewButton_1 = new JButton("Create New Account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Create an Account?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	SemisCode obj=new SemisCode();
					obj.main(null);;
					//obj.setVisible(true);
					//frame.dispose();
			    }
				
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(450, 470, 226, 33);
		frame.getContentPane().add(btnNewButton_1);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Mode.png"));
		
		JLabel lblNewLabel_5 = new JLabel("Faculty Mode");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(988, 66, 79, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mode");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Facultymode obj=new Facultymode();
				obj.main(null);;
				//obj.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(988, 10, 70, 58);
		frame.getContentPane().add(lblNewLabel_6);
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Mode.png"));
		lblNewLabel_6.setIcon(img6);
		
		
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBackground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(10, 10, 1081, 683);
		lblNewLabel.setIcon(img);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
