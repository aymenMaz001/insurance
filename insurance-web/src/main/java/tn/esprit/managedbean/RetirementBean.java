package tn.esprit.managedbean;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RetirementBean {
	private Date birthDate;
	private int retirement;
	private String period;
	private int prime;
	
	
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
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public int getPrime() {
		return prime;
	}
	public void setPrime(int prime) {
		this.prime = prime;
	}
}
