package tn.esprit.managedbean;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneMenuView {
     
    private String console;
    private String reason;
    
    public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getConsole() {
        return console;
    }
 
    public void setConsole(String console) {
        this.console = console;
    }
    
    public void onProdChange() {
		// TODO Auto-generated method stub
    	console = this.getConsole();
	}
}