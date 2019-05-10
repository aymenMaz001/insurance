package tn.esprit.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class AgricultureBean {
	private String type;
	private int price;
	private int duration;
	
	public void calculPrime(){
		float securtyCoeff = 1.35f;
		float taux = 0.01f;
		int p = price;
		int d = duration;
		
		addMessage("the monthly prime is : " + (p*d)*taux*securtyCoeff );
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
}
