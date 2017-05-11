package uiDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

//import listener.Listener;


public class AddNew extends JPanel {

	public JPanel contentPane;
	public JTextField line;
	public JTextField item_ID;
	public JTextField dateText;
	public JTextField rateText;
	public JTextField name;
	public JTextField ailment_type;
	public  JTextField ailment_details;
	public JButton submit,update;
	public JButton cancel;
	public JLabel lblHeading,lblpatientId;
	public JComboBox Patient_id;
	
	Date date = new Date();
	SimpleDateFormat fort = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	
	//PatientListener patientAdd=new PatientListener(this);
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatient frame = new AddPatient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public AddNew() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 472);
		//contentPane = new JPanel();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		
		lblHeading = new JLabel("     Add an Offering");
		lblHeading.setFont(new Font("Georgia", Font.BOLD, 21));
		lblHeading.setBounds(136, 11, 300, 50);
		add(lblHeading);
		
		/*JLabel lblNewLabel = new JLabel("Patient ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 69, 107, 26);
		contentPane.add(lblNewLabel);*/
		
		
//		 lblpatientId = new JLabel("Select Patient ID");
//		 lblpatientId.setFont(new Font("Tahoma", Font.BOLD, 14));
//		 lblpatientId.setBounds(10, 75, 137, 13);
//		add(lblpatientId);
//		
//		Patient_id = new JComboBox();
//		Patient_id.setBounds(199, 73, 127, 20);
//		add(Patient_id);
		
		JLabel lblNewLabel_Id = new JLabel("ID");
		lblNewLabel_Id.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Id.setBounds(50, 113, 107, 26);
		add(lblNewLabel_Id);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(50, 180, 107, 26);
		add(lblNewLabel_1);
	
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(50, 245, 124, 26);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rate");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(50, 310, 141, 26);
		add(lblNewLabel_3);
		
//		JLabel lblNewLabel_3 = new JLabel("Ailment Type");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewLabel_3.setBounds(10, 232, 107, 26);
//		add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("Ailment_Details");
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewLabel_4.setBounds(10, 278, 107, 25);
//		add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_5 = new JLabel("Diagnosis History");
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewLabel_5.setBounds(10, 314, 127, 26);
//		add(lblNewLabel_5);
		
		line = new JTextField();
		line.setBounds(27, 44, 462, 5);
		add(line);
		line.setColumns(10);
		
		/*patient_ID = new JTextField();
		patient_ID.setBounds(199, 73, 204, 26);
		contentPane.add(patient_ID);
		patient_ID.setColumns(10);*/
		
//		dateText = new JTextField();
//		dateText.setBounds(199, 117, 204, 26);
//		add(dateText);
//		dateText.setColumns(10);
//		dateText.setText(fort.format(date));
	    //user_ID.setText(UserHome.uid);
		JLabel lblId = new JLabel("100");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(130, 117, 204, 26);
		add(lblId);
		
		JLabel lblDate = new JLabel(fort.format(date));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(130, 181, 204, 26);
		add(lblDate);
		
		name = new JTextField();
		name.setBounds(130, 245, 204, 26);
		add(name);
		name.setColumns(10);
		
		rateText = new JTextField();
		rateText.setBounds(130, 310, 204, 26);
		add(rateText);
		rateText.setColumns(10);
		
//		ailment_type = new JTextField();
//		ailment_type.setBounds(199, 236, 204, 26);
//		add(ailment_type);
//		ailment_type.setColumns(10);
//		
//		ailment_details = new JTextField();
//		ailment_details.setBounds(199, 281, 204, 26);
//		add(ailment_details);
//		ailment_details.setColumns(10);
//		
//		history = new JTextField();
//		history.setBounds(199, 318, 204, 47);
//		add(history);
//		history.setColumns(10);
		
//		JButton calender = new JButton("Calender");
//		calender.setBounds(400, 181, 89, 26);
//		add(calender);
//		//PatientListener p=new PatientListener(this);
//		//calender.addActionListener(patientAdd);
//		calender.setActionCommand("calender");
		
		 submit = new JButton("Submit");
		submit.setBounds(160, 355, 98, 23);
		add(submit);
		//submit.addActionListener(patientAdd);
		submit.setActionCommand("submit");
		
		update = new JButton("Update");
		update.setBounds(150, 355, 98, 23);
		add(update);
		//update.addActionListener(patientAdd);
		update.setActionCommand("Update");
		
		
		
		cancel = new JButton("Cancel");
		cancel.setBounds(264, 355, 98, 23);
		add(cancel);
	}
}
