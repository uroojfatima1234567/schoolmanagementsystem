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

public class Classes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classes frame = new Classes();
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
	public Classes() {
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
				
				NewEnrollment obj = new NewEnrollment();
				obj.main(null);
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
		lblNewLabel.setBounds(521, 100, 570, 69);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(263, 256, 1023, 457);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Class One");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClassOne obj=new ClassOne();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(110, 102, 155, 35);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton_1_3 = new JButton("Class Two");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClassTwo obj=new ClassTwo();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_3.setBounds(331, 102, 155, 35);
		panel_2.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2_2 = new JButton("Class Three");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClassThree obj=new ClassThree();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_2.setBounds(525, 102, 155, 35);
		panel_2.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Class Four");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClassFour obj=new ClassFour();
				obj.main(null);;
				//obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_1_1.setBounds(744, 102, 155, 35);
		panel_2.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Coming Soon");
		btnNewButton_2_1.setBounds(110, 266, 155, 35);
		panel_2.add(btnNewButton_2_1);
		btnNewButton_2_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton_2_1_1 = new JButton("Coming Soon");
		btnNewButton_2_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1_1.setBounds(331, 266, 155, 35);
		panel_2.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Coming Soon");
		btnNewButton_2_1_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1_1_1.setBounds(525, 266, 155, 35);
		panel_2.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Coming Soon");
		btnNewButton_2_1_1_1_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1_1_1_1.setBounds(744, 266, 155, 35);
		panel_2.add(btnNewButton_2_1_1_1_1);
		
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
		btnNewButton_1_1_2.setBounds(898, 412, 115, 35);
		panel_2.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("");/////////////
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3.setIcon(img11);
		lblNewLabel_3.setBounds(147, 32, 72, 67);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_1.setIcon(img2);
		lblNewLabel_3_1.setBounds(367, 25, 72, 67);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_1_1.setIcon(img3);
		lblNewLabel_3_1_1.setBounds(561, 25, 72, 67);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_2.setIcon(img4);
		lblNewLabel_3_2.setBounds(783, 25, 72, 67);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_3.setIcon(img5);
		lblNewLabel_3_3.setBounds(147, 189, 72, 67);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_4.setIcon(img6);
		lblNewLabel_3_4.setBounds(367, 189, 72, 67);
		panel_2.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_5.setIcon(img7);
		lblNewLabel_3_5.setBounds(561, 189, 72, 67);
		panel_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("");
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		lblNewLabel_3_6.setIcon(img8);
		lblNewLabel_3_6.setBounds(783, 189, 72, 67);
		panel_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4 = new JLabel("Classes");
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(732, 201, 106, 45);
		contentPane.add(lblNewLabel_4);
	}
}
