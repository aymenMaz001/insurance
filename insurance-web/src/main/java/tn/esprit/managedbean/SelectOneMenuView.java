package tn.esprit.managedbean;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneMenuView {
     
    private String console; 
        
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