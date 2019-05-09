package tn.esprit.managedbean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class RetirementBean {
	private Date birthDate;
	private int retirement;
	private int period;
	private int prime;
	private int wage;
	private String business;
	private String gender;
	
	public void calculPrime(){
		int taux = 10;
		int y = 0;
		int r = 0;
		int g = 0;
		int p = 0;
		int b = 0;
		int w = wage;
		int pr = prime;
		//extract the year of birth
		DateFormat dateFormat = new SimpleDateFormat("yyyy");  
		String strDate = dateFormat.format(birthDate);  
		y = 2020-Integer.parseInt(strDate);
		r = retirement - y;
		
		if(gender.equals("Male")){g=1;}else{g=0;}
		
		if(period == 1){p = 1;}
		else if(period == 2){p = 7;}
		else if(period == 3){p = 30;}
		else if(period == 4){p = 180;}
		else{p = 360;}
		
		if(business.equals("Farmer")){b = 1;}
		else if(business.equals("wage")){b = 2;}
		else{b=3;}
		
		addMessage("you will get as retirement : " + (y+g+r+g+b+w+pr)*taux*p+" per month");
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getRetirement() {
		return retirement;
	}
	public void setRetirement(int retirement) {
		this.retirement = retirement;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getPrime() {
		return prime;
	}
	public void setPrime(int prime) {
		this.prime = prime;
	}
	
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
