package tn.esprit.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AjaxyView implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String txt;
    
    public String getTxt() {
        return txt;
    }
    public void setTxt(String txt) {
        this.txt = txt;
    }
     
    public void handleKeyEvent() {
    	txt = txt.toUpperCase();
    }
}
