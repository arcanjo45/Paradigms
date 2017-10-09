/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Acer
 */
public class PP_hw1 {

    public static void main(String[] args) {
        
        University uni = new University("UPB", "Bucareste");
        
        Author a = new Author ("Author #1");
        Calendar data = new GregorianCalendar(1996, 1, 7);
        
        Publication p = new Journal("Publication 1-1", data, 3, "Journal 1-1", 12); //score = 2
        a.addPublication(p);
        data = new GregorianCalendar(1997, 3, 8);
        p = new Journal("Publication 1-2", data, 5, "Journal 1-2", 33); //score = 3.3
        a.addPublication(p);
        data = new GregorianCalendar(1998, 4, 9);
        p = new ConferenceProceeding("Publication 1-3", data, 9, "Conference 1-1", true); //score = 0.02(7)
        a.addPublication(p);
        data = new GregorianCalendar(1999, 5, 10);
        p = new ConferenceProceeding("Publication 1-4", data, 13, "Conference 1-2", false); //score = 0.01538...
        a.addPublication(p);
        uni.addAuthor(a);
        
        // -------- AUTHOR 2 ------------
        a = new Author("Author #2");
        data = new GregorianCalendar(2003, 7, 20);
        p = new Journal("Publication 2-1", data, 4, "Journal 2-1", 11); //score = 1.375
        a.addPublication(p);
        data = new GregorianCalendar(2004, 8, 21);
        p = new Journal("Publication 2-2", data, 2, "Journal 2-2", 27); //score = 6.75
        a.addPublication(p);
        data = new GregorianCalendar(2005, 9, 22);
        p = new ConferenceProceeding("Publication 2-3", data, 17, "Conference 2-1", true); //score = 0.01470...
        a.addPublication(p);
        data = new GregorianCalendar(2006, 10, 23);
        p = new ConferenceProceeding("Publication 2-4", data, 8, "Conference 2-2", false); //score = 0.025
        a.addPublication(p);
        uni.addAuthor(a);
        
        System.out.println(uni);
    }
    
}
