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
	private int period;

	private String ageRange;
	private String gender;
	private String status;
	private int typeOfUse;
	private boolean garage;
	private String familySituation;
	private boolean antecident;
	private int duration;
	
	public void calculPrime(){
		float taux = 10;
		int m = 2020-model;
		int p = 0;
		int a = 0;
		int t = typeOfUse;
		int g = 0;
		int s= 0;
		int ant = 0;
		int dur = duration;
		
		if(period == 1){p = 1;}
		else if(period == 2){p = 7;}
		else if(period == 3){p = 30;}
		else if(period == 4){p = 180;}
		else{p = 360;}
		
		if(ageRange.equals("range1")){a = 1;}
		else if(ageRange.equals("range2")){a = 2;}
		else if(ageRange.equals("range3")){a = 3;}
		else{a=4;}
		
		if(gender.equals("Male")){g=1;}else{g=0;}
		
		if(familySituation.equals("single")){s = 1;}
		else if(familySituation.equals("married")){s = 2;}
		else{s=3;}
		
		if(antecident){ant=1;}else{ant=0;}
		
		addMessage("Your vehicule Prime is : " + (m+a+p+t+g+s+ant+dur)*taux);
	}
	
	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	
    public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isAntecident() {
		return antecident;
	}

	public void setAntecident(boolean antecident) {
		this.antecident = antecident;
	}

	public String getFamilySituation() {
		return familySituation;
	}

	public void setFamilySituation(String familySituation) {
		this.familySituation = familySituation;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public int getTypeOfUse() {
		return typeOfUse;
	}

	public void setTypeOfUse(int typeOfUse) {
		this.typeOfUse = typeOfUse;
	}

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
