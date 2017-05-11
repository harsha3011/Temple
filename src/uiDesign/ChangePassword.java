package uiDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;



public class ChangePassword extends JPanel {
	public JTextField  oldpass;
	public JTextField newpass;
	public JTextField  con_pass;
	public JTextField textField_3;
	public static String uid;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ChangePassword() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblChangePassword.setBounds(137, 39, 174, 33);
		add(lblChangePassword);
		
		JLabel lblNewLabel = new JLabel("Old Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(72, 111, 112, 33);
		add(lblNewLabel);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewPassword.setBounds(72, 165, 102, 14);
		add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfirmPassword.setBounds(72, 201, 112, 14);
		add(lblConfirmPassword);
		
		 oldpass= new JTextField();
		 oldpass.setBounds(225, 117, 174, 20);
		add(oldpass);
		oldpass.setColumns(10);
		
		newpass = new JTextField();
		newpass.setBounds(225, 159, 174, 20);
		add(newpass);
		newpass.setColumns(10);
		
		 con_pass= new JTextField();
		con_pass.setBounds(225, 198, 174, 20);
		add(con_pass);
		con_pass.setColumns(10);
		
	textField_3 = new JTextField();
	textField_3.setBounds(27, 69, 379, 2);
	add(textField_3);
	textField_3.setColumns(10);
		//getContentPane().setLayout(null);
		
		JButton change = new JButton("Change");
		/* change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});*/
		
		 change.setBounds(175, 228, 89, 23);
		 add( change);
		//ChangePasswordListener Ch_pass=new ChangePasswordListener(this);
		//change.addActionListener(Ch_pass);
		change.setActionCommand("change");
		
		JButton cancel = new JButton("Cancel");
		cancel .setBounds(274, 229, 89, 23);
		add(cancel );
	}
}
