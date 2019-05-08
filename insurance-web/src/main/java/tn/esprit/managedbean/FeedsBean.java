package tn.esprit.managedbean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.entity.FeedsType;
import tn.esprit.insurance.service.implementation.Feedbacks;

@ManagedBean
@ViewScoped
public class FeedsBean {
	
	private String title;
	private String feed;
	private FeedsType type;
	
	@EJB
	Feedbacks fb;

	public FeedsBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void addFb(){
		fb.addFeeds(new Feeds(title,feed,type));
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "You message is sent successfully", null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public FeedsType getType() {
		return type;
	}

	public void setType(FeedsType type) {
		this.type = type;
	}
	
	public Feedbacks getFb() {
		return fb;
	}

	public void setFb(Feedbacks fb) {
		this.fb = fb;
	}
	
	
}
