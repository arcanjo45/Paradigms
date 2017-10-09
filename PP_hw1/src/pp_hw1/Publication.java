/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw1;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Acer
 */
public abstract class Publication {
    private String name;
    private Calendar apparition;
    private int numberOfAuthors;
    
    public Publication(String name, Calendar apparition, int numberOfAuthors){
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }
    
    // ---------------- GETTERS & SETTERS -------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getApparition() {
        return apparition;
    }

    public void setApparition(Calendar apparition) {
        this.apparition = apparition;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }
    
    // ------------------ ABSTRACT METHODS ----------------------
    
    public abstract double computeScore();
    
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String info = "Name: "+name+"\nNumber of Authors: "+numberOfAuthors;
        info += "\nApparition: "+sdf.format(apparition.getTime());
        return info;
    }
}
