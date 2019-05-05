package tn.esprit.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean visible;
	public UserController() {}
	
	public void show(){
		visible = true;
	}
	
	public void hide(){
		visible = false;
	}

	public boolean getVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
