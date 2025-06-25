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

public class FacultyRecords extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyRecords frame = new FacultyRecords();
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
	public FacultyRecords() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 60, 1095, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 1075, 641);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		model=new DefaultTableModel();
		Object[] column = {"First Name","Last Name","Surname","Gender","Qualification","Designation","Mobile No","CNIC"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		try 
		{
		
			Class.forName("com.mysql.cj.jdbc.Driver");	//Step 1
		Connection	c=DriverManager.getConnection("jdbc:mysql:///schoolmanagementsystem","root","root"); //Step 2
		Statement	s=c.createStatement();	//Step 3
			String query="SELECT * from facultydata";
			ResultSet rs= s.executeQuery(query);
			
			

			while(rs.next()) {
				
				String na=rs.getString("FirstName");
				String lna=rs.getString("LastName");
				String sur=rs.getString("Surname");
				String gen=rs.getString("Gender");
				String qualif=rs.getString("Qualification");
				String desig=rs.getString("Designation");
				String mob=rs.getString("MobileNo");
				String cnic=rs.getString("CNIC");
				
				String tbData[]= {na, lna, sur, gen, qualif, desig, mob, cnic};
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				
				tblModel.addRow(tbData);
				
			}
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 684, 1095, 46);
		panel_1.setBackground(Color.DARK_GRAY);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Faculty Records");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(499, 10, 155, 25);
		panel.add(lblNewLabel);
	}
}
