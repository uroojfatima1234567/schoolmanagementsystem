import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;


public class Challan extends JFrame {

	private JPanel contentPane;
	DefaultTableModel model;
	
	JLabel Sname1;
	JLabel Sname2;
	JLabel Sname3;
	JLabel Fname1;
	JLabel Fname2;
	JLabel Fname3;
	JLabel Course1;
	JLabel Course2;
	JLabel Course3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Challan frame = new Challan();
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
	public Challan() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 60, 1095, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1095, 730);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Close");
		lblNewLabel_2.setBounds(10, 10, 58, 25);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				dispose();
				
			}
		});
		panel.setLayout(null);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNewLabel_2);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 684, 1095, 46);
		panel_1.setBackground(Color.DARK_GRAY);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Fees Challan");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(466, 29, 194, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Holy City Education System");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(94, 114, 202, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bhutta Road, Sukkur");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(104, 146, 178, 52);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ph: 071-5822080     071-5822081");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1.setBounds(94, 176, 188, 52);
		panel.add(lblNewLabel_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(332, 79, 3, 564);
		panel.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bank Copy");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(266, 91, 58, 13);
		panel.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(61, 227, 261, 94);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(10, 10, 241, 74);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Online Bank Deposit");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(54, 0, 132, 19);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("UBL Bank");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(54, 23, 132, 19);
		panel_4.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("A/c # 291415033");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_1.setBounds(54, 52, 132, 19);
		panel_4.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Applicant's Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(10, 382, 89, 19);
		panel.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(108, 394, 214, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(108, 446, 214, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Father Name");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(10, 434, 89, 19);
		panel.add(lblNewLabel_5_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(108, 495, 214, 2);
		panel.add(separator_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Course");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_2.setBounds(10, 483, 89, 19);
		panel.add(lblNewLabel_5_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(108, 548, 214, 2);
		panel.add(separator_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Amount");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_3.setBounds(10, 536, 89, 19);
		panel.add(lblNewLabel_5_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(191, 354, 120, 2);
		panel.add(separator_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("Date");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_4.setBounds(153, 341, 89, 19);
		panel.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6 = new JLabel("1000/-  One Thousand Only");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(131, 525, 204, 25);
		panel.add(lblNewLabel_6);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(663, 79, 3, 564);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Accounts Copy");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3_1.setBounds(574, 91, 81, 13);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Holy City Education System");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(427, 114, 202, 52);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ph: 071-5822080     071-5822081");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1_1.setBounds(427, 176, 188, 52);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Bhutta Road, Sukkur");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_2.setBounds(437, 146, 178, 52);
		panel.add(lblNewLabel_1_1_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(392, 227, 261, 94);
		panel.add(panel_3_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(10, 10, 241, 74);
		panel_3_1.add(panel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Online Bank Deposit");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(54, 0, 132, 19);
		panel_4_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("UBL Bank");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(54, 23, 132, 19);
		panel_4_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("A/c # 291415033");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_1_1.setBounds(54, 52, 132, 19);
		panel_4_1.add(lblNewLabel_4_1_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.BLACK);
		panel_2_2.setBounds(996, 79, 3, 564);
		panel.add(panel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Student Copy");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3_2.setBounds(918, 91, 70, 13);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Holy City Education System");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(759, 114, 202, 52);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Ph: 071-5822080     071-5822081");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1_2.setBounds(759, 176, 188, 52);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Bhutta Road, Sukkur");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_3.setBounds(769, 146, 178, 52);
		panel.add(lblNewLabel_1_1_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(Color.BLACK);
		panel_3_2.setBounds(725, 227, 261, 94);
		panel.add(panel_3_2);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBounds(10, 10, 241, 74);
		panel_3_2.add(panel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Online Bank Deposit");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_3.setBounds(54, 0, 132, 19);
		panel_4_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("UBL Bank");
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_3.setBounds(54, 23, 132, 19);
		panel_4_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("A/c # 291415033");
		lblNewLabel_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_1_2.setBounds(54, 52, 132, 19);
		panel_4_2.add(lblNewLabel_4_1_1_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(443, 459, 214, 2);
		panel.add(separator_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Father Name");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_1_1.setBounds(345, 447, 89, 19);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_5 = new JLabel("Applicant's Name");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_5.setBounds(345, 395, 89, 19);
		panel.add(lblNewLabel_5_5);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(443, 407, 214, 2);
		panel.add(separator_5);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(526, 367, 120, 2);
		panel.add(separator_4_1);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("Date");
		lblNewLabel_5_4_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_4_1.setBounds(488, 354, 89, 19);
		panel.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Course");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_2_1.setBounds(345, 496, 89, 19);
		panel.add(lblNewLabel_5_2_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(443, 508, 214, 2);
		panel.add(separator_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Amount");
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_3_1.setBounds(345, 549, 89, 19);
		panel.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("1000/-  One Thousand Only");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_1.setBounds(466, 538, 204, 25);
		panel.add(lblNewLabel_6_1);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(443, 561, 214, 2);
		panel.add(separator_3_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(771, 459, 214, 2);
		panel.add(separator_1_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Father Name");
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_1_2.setBounds(673, 447, 89, 19);
		panel.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_6 = new JLabel("Applicant's Name");
		lblNewLabel_5_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_6.setBounds(673, 395, 89, 19);
		panel.add(lblNewLabel_5_6);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(771, 407, 214, 2);
		panel.add(separator_6);
		
		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBounds(854, 367, 120, 2);
		panel.add(separator_4_2);
		
		JLabel lblNewLabel_5_4_2 = new JLabel("Date");
		lblNewLabel_5_4_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_4_2.setBounds(816, 354, 89, 19);
		panel.add(lblNewLabel_5_4_2);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("Course");
		lblNewLabel_5_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_2_2.setBounds(673, 496, 89, 19);
		panel.add(lblNewLabel_5_2_2);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(771, 508, 214, 2);
		panel.add(separator_2_2);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("Amount");
		lblNewLabel_5_3_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5_3_2.setBounds(673, 549, 89, 19);
		panel.add(lblNewLabel_5_3_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("1000/-  One Thousand Only");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6_2.setBounds(794, 538, 204, 25);
		panel.add(lblNewLabel_6_2);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(771, 561, 214, 2);
		panel.add(separator_3_2);
		
		JLabel lblNewLabel_7 = new JLabel("Applicant Signature");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(23, 615, 107, 28);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Bank Stamp");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setBounds(212, 615, 98, 28);
		panel.add(lblNewLabel_7_1);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 615, 120, 2);
		panel.add(separator_7);
		
		JSeparator separator_7_1 = new JSeparator();
		separator_7_1.setBounds(202, 615, 120, 2);
		panel.add(separator_7_1);
		
		JSeparator separator_7_1_1 = new JSeparator();
		separator_7_1_1.setBounds(533, 615, 120, 2);
		panel.add(separator_7_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Bank Stamp");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_1.setBounds(543, 615, 98, 28);
		panel.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Applicant Signature");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_2.setBounds(354, 615, 107, 28);
		panel.add(lblNewLabel_7_2);
		
		JSeparator separator_7_2 = new JSeparator();
		separator_7_2.setBounds(341, 615, 120, 2);
		panel.add(separator_7_2);
		
		JSeparator separator_7_1_2 = new JSeparator();
		separator_7_1_2.setBounds(866, 615, 120, 2);
		panel.add(separator_7_1_2);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Bank Stamp");
		lblNewLabel_7_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_2.setBounds(876, 615, 98, 28);
		panel.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Applicant Signature");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7_3.setBounds(687, 615, 107, 28);
		panel.add(lblNewLabel_7_3);
		
		JSeparator separator_7_3 = new JSeparator();
		separator_7_3.setBounds(674, 615, 120, 2);
		panel.add(separator_7_3);
		
		Sname1 = new JLabel("");
		Sname1.setBounds(118, 373, 204, 25);
		panel.add(Sname1);
		
		Sname2 = new JLabel("");
		Sname2.setBounds(449, 385, 204, 25);
		panel.add(Sname2);
		
		Sname3 = new JLabel("");
		Sname3.setBounds(782, 385, 204, 25);
		panel.add(Sname3);
		
		Fname1 = new JLabel("");
		Fname1.setBounds(118, 423, 204, 25);
		panel.add(Fname1);
		
		Fname2 = new JLabel("");
		Fname2.setBounds(449, 437, 204, 25);
		panel.add(Fname2);
		
		Fname3 = new JLabel("");
		Fname3.setBounds(782, 437, 204, 25);
		panel.add(Fname3);
		
		Course1 = new JLabel("");
		Course1.setBounds(118, 472, 204, 25);
		panel.add(Course1);
		
		Course2 = new JLabel("");
		Course2.setBounds(449, 486, 204, 25);
		panel.add(Course2);
		
		Course3 = new JLabel("");
		Course3.setBounds(782, 486, 204, 25);
		panel.add(Course3);
	}
}
