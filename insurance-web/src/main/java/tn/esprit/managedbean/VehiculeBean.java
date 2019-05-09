package tn.esprit.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean
public class VehiculeBean {
	
	private int model = 2019;
	private String ageRange;
	private String gender;
	private String status;
	
    private Theme theme; 
    private List<Theme> themes;
     
    @ManagedProperty("#{themeService}")
    private ThemeService service;
    @PostConstruct
    public void init() {
        themes = service.getThemes();
    }
    
	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public ThemeService getService() {
		return service;
	}

	public void setService(ThemeService service) {
		this.service = service;
	}

	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    public void onProdChange() {
		// onchanging model year
    	model = this.getModel();
	}
	
    
    public void buttonAction(String p) {
        addMessage("Your prime is : " + p);
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	
}
