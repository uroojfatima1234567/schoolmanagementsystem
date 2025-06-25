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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FeesChallan extends JFrame {

	private JPanel contentPane;
	private JTextField StdName;
	private JTextField FtName;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeesChallan frame = new FeesChallan();
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
	public FeesChallan() {
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
		
		JLabel lblNewLabel_3 = new JLabel("Fees Challan");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(84, 39, 276, 35);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Applicant Name");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(69, 84, 123, 35);
		panel_2.add(lblNewLabel_3_1);
		
		StdName = new JTextField();
		StdName.setFont(new Font("Tahoma", Font.BOLD, 14));
		StdName.setBounds(217, 84, 142, 28);
		panel_2.add(StdName);
		StdName.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Father Name");
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3_1_1.setBounds(69, 122, 108, 35);
		panel_2.add(lblNewLabel_3_1_1);
		
		FtName = new JTextField();
		FtName.setFont(new Font("Tahoma", Font.BOLD, 14));
		FtName.setColumns(10);
		FtName.setBounds(217, 126, 142, 28);
		panel_2.add(FtName);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Generate");
		btnNewButton_1_1_2_1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(StdName.getText().equals("") || FtName.getText().equals("") || comboBox.getSelectedItem().equals("Select"))
					
				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				
				else
				{
					
					Challan send=new Challan();
					
					send.Sname1.setText(StdName.getText());
					send.Sname2.setText(StdName.getText());
					send.Sname3.setText(StdName.getText());
					
					send.Fname1.setText(FtName.getText());
					send.Fname2.setText(FtName.getText());
					send.Fname3.setText(FtName.getText());
					
					send.Course1.setText((String) comboBox.getSelectedItem());
					send.Course2.setText((String) comboBox.getSelectedItem());
					send.Course3.setText((String) comboBox.getSelectedItem());

			//		send.Course1.setText(Course.getText());
			//		send.Course2.setText(Course.getText());
			//		send.Course3.setText(Course.getText());
					
					send.setVisible(true);
					dispose();	
				}
				
				
				
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2_1.setBounds(245, 216, 115, 35);
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
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Course");
		lblNewLabel_3_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3_1_1_1.setBounds(69, 167, 109, 31);
		panel_2.add(lblNewLabel_3_1_1_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Monthly Fees", "Tuition Fees"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(217, 170, 143, 28);
		panel_2.add(comboBox);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Icon2.png"));
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Icon3.png"));
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Icon4.png"));
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Icon5.png"));
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Icon6.png"));
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/Icon7.png"));
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/Icon8.png"));
	}
}
