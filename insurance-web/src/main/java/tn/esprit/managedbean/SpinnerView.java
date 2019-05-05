package tn.esprit.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SpinnerView {
     
    private int number1 = 2019; 

    public int getNumber1() {
        return number1;
    }
 
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
}