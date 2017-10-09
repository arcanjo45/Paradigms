/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw1;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Acer
 */
public class Journal extends Publication {
    private String journalName;
    private double impactFactor;
    
    public Journal(String name, Calendar apparition, int numberOfAuthors, String journalName, double impactFactor){
        super(name, apparition, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }
    
    public double computeScore(){
        return (impactFactor * 0.5)/super.getNumberOfAuthors();
    }
    
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.000");
        
        String info = super.toString() + "\n";
        info += "Journal name: "+journalName+"\nScore: "+df.format(computeScore());
        return info;
    }
}
