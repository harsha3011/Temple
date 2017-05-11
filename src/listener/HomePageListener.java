package listener;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

//import com.wipro.ocs.bean.DoctorBean;
//import com.wipro.ocs.bean.PatientBean;
//import com.wipro.ocs.dao.DoctorDAOImpl;
//import com.wipro.ocs.dao.PatientImpl;
import uiDesign.AddNew;
import uiDesign.ViewDetails;
import uiDesign.ChangePassword;
import uiDesign.Offering;
//import com.wipro.ocs.ui.ChangePassword;
import uiDesign.HomePage;
//import com.wipro.ocs.ui.ViewAilment;
//import com.wipro.ocs.ui.ViewDoctorsBySpecialization;

public class HomePageListener implements ActionListener {
	HomePage homePage;
	String dateString = null;
	SimpleDateFormat fort = new SimpleDateFormat("dd/MMM/yyyy");
	public HomePageListener(HomePage homePage)
	{
	this.homePage=homePage;
	}


	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand().equals("Add"))
		{
			
			homePage.panel_2.removeAll();
			AddNew addNew=new AddNew();
			homePage.panel_2.add(addNew,BorderLayout.CENTER);
			homePage.getContentPane().validate();
			//addPatient.setVisible(true);
			addNew.update.setVisible(false);
			addNew.lblpatientId.setVisible(false);
			addNew.Patient_id.setVisible(false);
		}
	else if(ae.getActionCommand().equals("Modify "))
		{
			final AddNew addNew=new AddNew();
			//addPatient.setVisible(true);
			homePage.panel_2.removeAll();
			homePage.panel_2.add(addNew,BorderLayout.CENTER);
			homePage.getContentPane().validate();
			addNew.submit.setVisible(false);
			addNew.lblHeading.setText("Modify Vazhipadu Details");
//			final PatientImpl pi=new PatientImpl();
//			List< PatientBean> al=pi.selectPatientID();
//			System.out.println("check");
//			for(PatientBean p_bean:al)
//			{
//				//System.out.println(p_bean.getPatientID());
//				addPatient.Patient_id.addItem(p_bean.getPatientID());
//			}
//			addPatient.Patient_id.addActionListener(new ActionListener() {
//				
//				public void actionPerformed(ActionEvent arg0) {
//					PatientBean patientBean;
//
//					// TODO Auto-generated method stub
//					 String ID = (String)addNew.Patient_id.getSelectedItem();
//					 patientBean= pi.findByID(ID);
//					dateString=fort.format(patientBean.getAppointmentDate());
//					addNew.date.setText(dateString);
//					addNew.ailment_type.setText(patientBean.getAilmentType());
//					addNew.ailment_details.setText(patientBean.getAilmentDetails());
//					addNew.history.setText(patientBean.getDiagnosisHistory());
//				}
//			});
		}
	else if(ae.getActionCommand().equals("viewDetails"))
	{
			
			//viewAilment.setVisible(true);
		//ViewAlimentListener viewListen;
			homePage.panel_2.removeAll();
			ViewDetails viewDetails=new ViewDetails();
			homePage.panel_2.add(viewDetails,BorderLayout.CENTER);
			homePage.getContentPane().validate();
			viewDetails.vazhpaduTextSearch.setVisible(false);
			viewDetails.toText.setVisible(false);
			viewDetails.lblVazhipaduSearch.setVisible(false);
			viewDetails.lblTo.setVisible(false);
			viewDetails.calender.setVisible(false);
			//final PatientImpl pi=new PatientImpl();
			
			
			
		}
	else if(ae.getActionCommand().equals("Change_Password"))
		{
			System.out.println("test");
			ChangePassword changePassword=new ChangePassword();
			//changePassword.setVisible(true);
			homePage.panel_2.removeAll();
			homePage.panel_2.add(changePassword,BorderLayout.CENTER);
			homePage.getContentPane().validate();
		}
	else if(ae.getActionCommand().equals("Offering"))
		{
			final Offering offering=new Offering();
			//List<DoctorBean> al=doctor.selectDoctorID();
			//ViewDoctorsBySpecialization view=new ViewDoctorsBySpecialization();
			System.out.println("check");
//			for(DoctorBean p_bean:al)
//			{
//				//System.out.println(p_bean.getPatientID());
//			view.specilization.addItem(p_bean.getSpecialization());
//			}
//			//view.setVisible(true);
			homePage.panel_2.removeAll();
			homePage.panel_2.add(offering,BorderLayout.CENTER);
			homePage.getContentPane().validate();
			
			    offering.tableScrollPane.setVisible(false);
			    offering.btnUpdateVazhipadu.setVisible(false);
			
				
			
		}
//		else if(ae.getActionCommand().equals("logout"))
//		{
//		
//		}
	}
}
