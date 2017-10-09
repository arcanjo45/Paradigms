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
public class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;
    
    public ConferenceProceeding(String name, Calendar apparition, int numberOfAuthors, String volumeName, boolean indexed){
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }
    
    public double computeScore(){
        if (indexed)
            return 0.25/super.getNumberOfAuthors();
        else
            return 0.2/super.getNumberOfAuthors();
    }
    
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.000");
        
        String info = super.toString() + "\n";
        info += "Journal name: "+volumeName+"\nScore: "+df.format(computeScore());
        return info;
    }
}
