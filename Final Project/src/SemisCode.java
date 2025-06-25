import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class SemisCode extends JFrame {

	private JPanel contentPane;
	private JPasswordField code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemisCode frame = new SemisCode();
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
	public SemisCode() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 250, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 500, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Semis Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(112, 133, 89, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insert the School Code for Futhur Process");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(79, 58, 331, 25);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(code.getText().equals("4566006"))
				{
					CreateAccount obj=new CreateAccount();
					
//					Login obj1=new Login();
//					obj1.main(null);
//					dispose();
					
					obj.main(null);
					//obj.setVisible(true);
					dispose();
					
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Semis Code");
					code.setText("");
				}
			}
			
			
		});
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.setBounds(277, 187, 85, 21);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Close");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				dispose();
				
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 10, 58, 25);
		panel.add(lblNewLabel_2);
		
		code = new JPasswordField();
		code.setFont(new Font("Tahoma", Font.BOLD, 15));
		code.setBounds(211, 133, 151, 25);
		panel.add(code);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 260, 500, 40);
		contentPane.add(panel_1);
	}
}
