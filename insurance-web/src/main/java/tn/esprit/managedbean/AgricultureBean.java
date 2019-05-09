package tn.esprit.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AgricultureBean {
	private String type;
	private int price;
	private int duration;
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
}
