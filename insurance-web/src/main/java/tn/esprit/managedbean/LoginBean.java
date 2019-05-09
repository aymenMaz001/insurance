package tn.esprit.managedbean;


import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "loginBean") 
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String login; 
	private String password; 
	private Boolean loggedIn;

//	@EJB
//	EmployeService employeService; 

	public String doLogin()
	{
		String navigateTo = "null"; 
		navigateTo = "temp?faces-redirect=true";

//		if (employe != null && employe.getRole() == Role.ADMINISTRATEUR) {
//			navigateTo = "/pages/admin/welcome?faces-redirect=true";
//			loggedIn = true; 
//		}
//		else 
//		{
//			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials"));
//		}
		return navigateTo; 
	}

	public String doLogout()
	{
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}
 
	public LoginBean() {} 
	
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public Boolean getLoggedIn() {return loggedIn;}
	public void setLoggedIn(Boolean loggedIn) {this.loggedIn = loggedIn;}

}
