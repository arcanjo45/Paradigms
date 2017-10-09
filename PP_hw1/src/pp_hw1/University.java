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
public class University {
    private String name, location;
    private ArrayList<Author> authors;
    
    public University(String name, String location){
        this.name = name;
        this.location = location;
        authors = new ArrayList<>();
    }

    // ------------------- GETTERS & SETTERS ---------------------
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList getAuthors() {
        return authors;
    }
    
    // ------------------ METHODS --------------------------
    
    public void addAuthor(Author a){
        authors.add(a);
    }
    
    private double computeScore(){
        double score = 0.0;
        for(Author a : authors){
            score += a.computeScore();
        }
        return score;
    }
    
    public String toString(){
        String info = "------------------\nName: "+name+"\nLocation: "+location+"\n\tAUTHORS\n";
        for (Author a : authors){
            info += a.toString()+"\n\n";
        }
        return info;
    }
}
