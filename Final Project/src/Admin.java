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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
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
		
		JLabel lblNewLabel_3 = new JLabel("Fees Payment");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(112, 252, 115, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fees Unpaid Students");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(276, 252, 152, 35);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Fees Paid Students");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(470, 252, 138, 35);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Fees Challan");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(658, 252, 115, 35);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FeesPayment obj = new FeesPayment();
				obj.main(null);
				//obj.setVisible(true);
				
			}
		});
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Fees.png"));
		lblNewLabel_5.setIcon(img2);
		lblNewLabel_5.setBounds(125, 135, 102, 123);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				UnpaidStudents obj = new UnpaidStudents();
				obj.main(null);
				//obj.setVisible(true);
				
			}
		});
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Unpaid.jpg"));
		lblNewLabel_5_1.setIcon(img3);
		lblNewLabel_5_1.setBounds(300, 135, 102, 123);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				PaidStudents obj = new PaidStudents();
				obj.main(null);
				//obj.setVisible(true);
				
				
			}
		});
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Paid.png"));
		lblNewLabel_5_1_1.setIcon(img4);
		
		lblNewLabel_5_1_1.setBounds(488, 135, 102, 123);
		panel_2.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FeesChallan obj = new FeesChallan();
				obj.main(null);
				//obj.setVisible(true);
			}
		});
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Challan.png"));
		lblNewLabel_5_1_1_1.setIcon(img5);
		
		lblNewLabel_5_1_1_1.setBounds(659, 135, 102, 123);
		panel_2.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Cameras");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_3_1.setBounds(799, 252, 115, 35);
		panel_2.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Camera obj = new Camera();
				obj.main(null);
				dispose();
				//obj.setVisible(true);
				
			}
		});
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Camera.png"));
		lblNewLabel_5_1_1_1_1.setIcon(img6);
		lblNewLabel_5_1_1_1_1.setBounds(809, 135, 102, 123);
		panel_2.add(lblNewLabel_5_1_1_1_1);
		

		
		JLabel lblNewLabel_4 = new JLabel("Admin");
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(713, 86, 147, 45);
		contentPane.add(lblNewLabel_4);
	}
}
