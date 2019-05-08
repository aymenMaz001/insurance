package tn.esprit.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MessageBean {
	
	private String msg;

	public String getMsg() {
		return "Your Message is sent with success "+msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
