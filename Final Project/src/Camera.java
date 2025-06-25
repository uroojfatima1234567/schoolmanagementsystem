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

public class Camera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Camera frame = new Camera();
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
	public Camera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1450, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Icon1.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(10, 50, 1416, 663);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/movie1.gif"));
	    
	    JLabel lblCamera_3 = new JLabel("Camera 5");
	    lblCamera_3.setForeground(Color.WHITE);
	    lblCamera_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblCamera_3.setBounds(932, 303, 83, 24);
	    panel_2.add(lblCamera_3);
	    
	    JLabel lblCamera_4 = new JLabel("Camera 6");
	    lblCamera_4.setForeground(Color.WHITE);
	    lblCamera_4.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblCamera_4.setBounds(932, 629, 83, 24);
	    panel_2.add(lblCamera_4);
	    
	    JLabel lblNewLabel_1 = new JLabel("Camera 3");
	    lblNewLabel_1.setForeground(Color.WHITE);
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(476, 302, 83, 24);
	    panel_2.add(lblNewLabel_1);
	    
	    JLabel lblCamera_1 = new JLabel("Camera 4");
	    lblCamera_1.setForeground(Color.WHITE);
	    lblCamera_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblCamera_1.setBounds(476, 628, 83, 24);
	    panel_2.add(lblCamera_1);
	    
	    JLabel lblCamera = new JLabel("Camera 2");
	    lblCamera.setForeground(Color.WHITE);
	    lblCamera.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblCamera.setBounds(30, 628, 83, 24);
	    panel_2.add(lblCamera);
	    
	    JLabel lblNewLabel = new JLabel("Camera 1");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setBounds(30, 302, 83, 24);
	    panel_2.add(lblNewLabel);
	    lblNewLabel_3.setIcon(img2);
		
		lblNewLabel_3.setBounds(10, 10, 446, 316);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/movie5.gif"));
	    lblNewLabel_3_1.setIcon(img3);
		
		lblNewLabel_3_1.setBounds(10, 336, 446, 316);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/movie3.gif"));
		lblNewLabel_3_2.setIcon(img4);
		lblNewLabel_3_2.setBounds(466, 10, 446, 316);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("New label");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/movie4.gif"));
		lblNewLabel_3_1_1.setIcon(img5);
		lblNewLabel_3_1_1.setBounds(466, 336, 446, 316);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("New label");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/movie6.gif"));
		lblNewLabel_3_2_1.setIcon(img6);
		lblNewLabel_3_2_1.setBounds(922, 10, 484, 316);
		panel_2.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("New label");
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/movie2.gif"));
		lblNewLabel_3_1_1_1.setIcon(img7);
		lblNewLabel_3_1_1_1.setBounds(922, 336, 484, 316);
		panel_2.add(lblNewLabel_3_1_1_1);
		

		
		JLabel lblNewLabel_4 = new JLabel("Camera");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(672, 2, 147, 45);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1_1_2 = new JButton("Close");
		btnNewButton_1_1_2.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_1_1_2.setBounds(10, 10, 115, 35);
		contentPane.add(btnNewButton_1_1_2);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				 
			    if (result == JOptionPane.OK_OPTION) 
			    {
			    	Admin obj=new Admin();
					obj.main(null);	
			    	dispose();
			    }
			}
		});
		btnNewButton_1_1_2.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
}
