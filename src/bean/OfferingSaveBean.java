package bean;

import java.util.Date;

public class OfferingSaveBean {
	private String offeringSaveID;
	private String offeringItemName;
	private Float offeringItemQuantity;
	private Float offeringItemRate;
	private Float offeringTotal;
	private Date offeringSaveDate;
	
	public String getOfferingSaveID() {
		return offeringSaveID;
	}
	public void setOfferingSaveID(String offeringSaveID) {
		this.offeringSaveID = offeringSaveID;
	}
	
	public String getOfferingItemName(){
		return offeringItemName;
	}
	public void setOfferingItemName(String offeringItemName){
		this.offeringItemName=offeringItemName;
	}
	
	public Float getOfferingItemRate(){
		return offeringItemRate;
	}
	public void setOfferingItemRate(Float offeringItemRate){
		this.offeringItemRate=offeringItemRate;
	}
	
	public Float getOfferingItemQuantity(){
		return offeringItemQuantity;
	}
	public void setOfferingItemQuantity(Float offeringItemQuantity){
		this.offeringItemQuantity=offeringItemQuantity;
	}
	
	public Float getOfferingTotal(){
		return offeringTotal;
	}
	public void setOfferingTotal(Float offeringTotal){
		this.offeringTotal=offeringTotal;
	}
	
	public Date getOfferingSaveDate() {
		return offeringSaveDate;
	}
	public void setOfferingSaveDate(Date offeringSaveDate) {
		this.offeringSaveDate = offeringSaveDate;
	}

}
