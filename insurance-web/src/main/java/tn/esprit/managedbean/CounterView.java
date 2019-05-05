package tn.esprit.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class CounterView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
 
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}