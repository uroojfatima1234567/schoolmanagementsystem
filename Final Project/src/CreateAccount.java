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


public class CreateAccount {

	private JFrame frame;
	private JTextField txtusername;
	//private JPasswordField passwordField;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.

	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
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
	public CreateAccount() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(493, 283, 138, 58);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(493, 362, 138, 58);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtusername.setForeground(new Color(0, 0, 0));
		txtusername.setBounds(641, 295, 199, 33);
		txtusername.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		

		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpassword.setBounds(641, 374, 199, 33);
		txtpassword.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtpassword);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(608, 138, 101, 100);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Account Icon.png"));
		lblNewLabel_2.setIcon(img1);
				
		JLabel lblNewLabel_3 = new JLabel("Create an Account");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(538, 242, 269, 41);
		frame.getContentPane().add(lblNewLabel_3);
						
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log in?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	Login obj=new Login();
					obj.main(null);;
					//obj.setVisible(true);
					frame.dispose();
			    }
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(493, 445, 85, 33);
		frame.getContentPane().add(btnNewButton);
								
		JButton btnReset = new JButton("Create");
		btnReset.setBackground(UIManager.getColor("Button.darkShadow"));
		btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(txtusername.getText().equals("") || txtpassword.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
					}
			
			else
			{
				String uname=txtusername.getText();
				String pass=txtpassword.getText();

				try
				{
					Conn conn= new Conn();
					String query = "insert into login values('"+uname+"','"+pass+"')";
				
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Account Created Successfully");
				
					txtusername.setText("");
					txtpassword.setText("");
					
					Login obj=new Login();
					obj.main(null);;
					//obj.setVisible(true);
					frame.dispose();
					
			
				}
				
				catch(Exception evt1)
				{
					evt1.printStackTrace();
				}
			
			}
			
		}
			
			
		
		});	
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(624, 445, 85, 33);
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
		btnCancel.setBackground(UIManager.getColor("Button.darkShadow"));
		btnCancel.setBounds(755, 445, 85, 33);
		frame.getContentPane().add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(132, 103, 280, 493);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(132, 103, 832, 493);
		frame.getContentPane().add(panel);
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBackground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(10, 10, 1081, 683);
		lblNewLabel.setIcon(img);
		frame.getContentPane().add(lblNewLabel);
	}


}
