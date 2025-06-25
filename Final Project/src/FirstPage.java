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
import javax.swing.JProgressBar;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel load;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		
		int x;
					FirstPage frame = new FirstPage();
					frame.setVisible(true);
					
					
		try 
		{
			for(x=0;x<=100;x++)
			{
				FirstPage.progressBar.setValue(x);
			
				Thread.sleep(70);
				FirstPage.load.setText(Integer.toString(x)+ "%");
				
				if(x==100)
				{
					Login obj=new Login();
					obj.main(null);
					//obj.setVisible(true);
					frame.dispose();	
			    	//dispose();
				}
			} 
		}
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public FirstPage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1230, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 0, 1230, 750);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Please Wait...");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(552, 587, 179, 41);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Loading.gif"));
	    lblNewLabel_3.setIcon(img1);
		lblNewLabel_3.setBounds(321, 82, 570, 412);
		panel_2.add(lblNewLabel_3);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 128, 128));
		progressBar.setBounds(10, 550, 1210, 27);
		panel_2.add(progressBar);
		
		load = new JLabel("");
		load.setBackground(new Color(255, 255, 255));
		load.setFont(new Font("Tahoma", Font.BOLD, 20));
		load.setForeground(new Color(0, 0, 0));
		load.setBounds(604, 513, 64, 27);
		panel_2.add(load);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 715, 1230, 35);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bhutta Road, Sukkur");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(64, 0, 155, 35);
		panel.add(lblNewLabel);
		
		JLabel lblHolycityschoolsystemgmailcom = new JLabel("holycityschoolsystem@gmail.com");
		lblHolycityschoolsystemgmailcom.setForeground(Color.WHITE);
		lblHolycityschoolsystemgmailcom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHolycityschoolsystemgmailcom.setBounds(940, 0, 241, 35);
		panel.add(lblHolycityschoolsystemgmailcom);
		
		JLabel lblPh = new JLabel("Ph: 071-5822080, 071-5822081        Mob: 0333-7164489");
		lblPh.setForeground(Color.WHITE);
		lblPh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPh.setBounds(391, 0, 412, 35);
		panel.add(lblPh);
		
		
		
		
	}
}
