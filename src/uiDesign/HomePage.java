package uiDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

import listener.HomePageListener;

public class HomePage extends JFrame {
	public JPanel panel, panel_1,panel_3;
	public JPanel contentPane;
	public JInternalFrame internalFrame;
	public JDesktopPane desktopPane;
	public JButton Add;
	public JButton Delete;
	public JButton Modify;
	public JButton  View;
	public JButton  Change_Password;
	public JButton Offering;
	public JButton logout;
	public static String uid="10002";
	public JPanel panel_2;
	HomePageListener homePage=new HomePageListener(this);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1138, 614);
		GridLayout gl=new GridLayout(0,1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 /*internalFrame = new JInternalFrame("");
		contentPane.add(internalFrame, BorderLayout.CENTER);
		
		 desktopPane = new JDesktopPane();
		internalFrame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		internalFrame.setVisible(true);*/
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(gl);
		//contentPane.setLayout(gl);
		 Add = new JButton("Add New ");
		panel.add(Add);
		Add.addActionListener(homePage);
		Add.setActionCommand("Add");
		
		Modify = new JButton("Modify");
		panel.add(Modify);
		Modify.addActionListener(homePage);
		Modify.setActionCommand("Modify ");
		
		  View = new JButton("View Details");
		panel.add(View );
		View.addActionListener(homePage);
		View.setActionCommand("viewDetails");
		
		Offering= new JButton("Offerings, Vazhipadu");
		panel.add(Offering);
		Offering.addActionListener(homePage);
		Offering.setActionCommand("Offering");
		
	    Change_Password= new JButton("Change Password");
		panel.add(Change_Password);
		Change_Password.addActionListener(homePage);
		Change_Password.setActionCommand("Change_Password");
		
		logout = new JButton("Logout");
		panel.add(logout);
		//logout.addActionListener(patient_home);
		logout.setActionCommand("logout");
		
		 panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color( 41, 128, 185 ));
		JLabel lblNewLabel = new JLabel("Vetekarankaavu Temple");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 28));
		panel_1.add(lblNewLabel);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Copy Right @wipro limited");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_3.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		//AddPatient ap=new AddPatient();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(gl);
		//panel_2.add(lblNewLabel_1);
		// ImagePanel panel = new ImagePanel(new ImageIcon("images/background.png").getImage());
		java.awt.Image bg=new ImageIcon("Primary Care-3.jpeg").getImage();
		//panel_2.setBackground(Color.blue);
		
	}

}

