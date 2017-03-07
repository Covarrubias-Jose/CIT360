/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeansample;

/**
 *
 * @author josecovarrubias
 */
public class BeanSample implements java.io.Serializable{
    private String yourName = null;
    private int yourAge = 0;
    private boolean youAmazing = false;
    
    
//  This is the No-arguments constructor
    public BeanSample(){
    
    }
//  From this point down are the getters and setters for 
//  the properties/variables of the class
    public String getYourName() {
        return yourName;
    }

    public int getYourAge() {
        return yourAge;
    }

    public boolean isYouAmazing() {
        return youAmazing;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }

    public void setYouAmazing(boolean youAmazing) {
        this.youAmazing = youAmazing;
    }

}
