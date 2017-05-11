package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uiDesign.AddNew;
import uiDesign.ViewDetails;
import uiDesign.DatePickerUI;
import uiDesign.Offering;
import uiDesign.ChangePassword;


public class FunctionListener implements ActionListener {
	
	DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
	Date selectedDate;
	
	
	ViewDetails viewDetails;
	JFrame frame=new JFrame();
//	public FunctionListener(ViewDetails viewDetails)
//	{
//		this.viewDetails=viewDetails;
//	}

	public FunctionListener(ViewDetails viewDetails2) {
		// TODO Auto-generated constructor stub
		this.viewDetails=viewDetails2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		 if(e.getActionCommand().equals("calender"))
		{
			final JFrame calnder = new JFrame();
			viewDetails.vazhpaduTextSearch.setText(new DatePickerUI(calnder).setPickedDate());
		}
		 else if(e.getActionCommand().equals("calenderTo"))
		{
			final JFrame calnder = new JFrame();
			viewDetails.toText.setText(new DatePickerUI(calnder).setPickedDate());
		}
		 
		
	}

}
