/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw1;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class Author {
    private String name;
    private ArrayList<Publication> publications;
    
    public Author(String name){
        this.name = name;
        publications = new ArrayList<>();
    }
    
    // ----------------- GETTERS & SETTERS ----------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }
    
    // --------------------- METHODS ----------------------------
    
    public void addPublication(Publication p){
        publications.add(p);
    }
    
    public double computeScore(){
        double score = 0.0;
        for(Publication p : publications){
            score += p.computeScore();
        }
        return score;
    }
    
    public String toString(){
        String info = "Name: "+name+"\n # PUBLICATIONS #\n";
        for(Publication p : publications){
            info += p.toString()+"\n\n";
        }
        return info;
    }
    
}
