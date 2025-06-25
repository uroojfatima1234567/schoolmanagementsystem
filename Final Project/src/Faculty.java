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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Faculty extends JFrame {

	private JPanel contentPane;
	private JTextField FcID;
	private JTextField FcPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty();
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
	public Faculty() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Icon1.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setBounds(0, 0, 519, 368);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Create an Faculty Account");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(95, 39, 276, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Faculty ID");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(102, 98, 86, 35);
		panel_2.add(lblNewLabel_3_1);
		
		FcID = new JTextField();
		FcID.setBounds(218, 98, 142, 28);
		panel_2.add(FcID);
		FcID.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Password");
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(102, 140, 86, 35);
		panel_2.add(lblNewLabel_3_1_1);
		
		FcPass = new JTextField();
		FcPass.setColumns(10);
		FcPass.setBounds(218, 140, 142, 28);
		panel_2.add(FcPass);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Create");
		btnNewButton_1_1_2_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(FcID.getText().equals("") || FcPass.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
						}
				
				
				else
				{
					String id=FcID.getText();
					String pass=FcPass.getText();
				
					try
					{
						Conn conn= new Conn();
						String query = "insert into faculty values('"+id+"','"+pass+"')";
					
						conn.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Account created successfully");
					
						FcID.setText("");
						FcPass.setText("");
					
					}
					
					catch(Exception evt1)
					{
						evt1.printStackTrace();
					}
				
				}
				
				
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2_1.setBounds(245, 192, 115, 35);
		panel_2.add(btnNewButton_1_1_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 261, 519, 35);
		panel_2.add(panel);
		
		JLabel lblNewLabel = new JLabel("Close");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 63, 28);
		panel_2.add(lblNewLabel);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Icon2.png"));
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Icon3.png"));
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Icon5.png"));
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Icon6.png"));
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/Icon7.png"));
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/Icon8.png"));
	}
}
