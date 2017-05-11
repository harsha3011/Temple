package bean;

import java.util.Date;

public class OfferingBean {

	private String offeringID;
	private String offeringName;
	private Float offeringRate;
	private Date offeringDate;
	
	public String getOfferingID() {
		return offeringID;
	}
	public void setOfferingID(String offeringID) {
		this.offeringID = offeringID;
	}
	
	public String getOfferingName(){
		return offeringName;
	}
	public void setOfferingName(String offeringName){
		this.offeringName=offeringName;
	}
	
	public Float getOfferingRate(){
		return offeringRate;
	}
	public void setOfferingRate(Float offeringRate){
		this.offeringRate=offeringRate;
	}
	
	public Date getOfferingDate() {
		return offeringDate;
	}
	public void setOfferingDate(Date offeringDate) {
		this.offeringDate = offeringDate;
	}
}
