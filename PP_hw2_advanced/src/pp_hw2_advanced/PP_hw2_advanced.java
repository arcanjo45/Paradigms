/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw2_advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Acer
 */
public class PP_hw2_advanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // --------------------------------------------------------------- PROBLEM 1
        
        /*
        // <editor-fold desc="Problem 1">
        ArrayList<Person> array = new ArrayList<>();
        HashSet<Person> hashSet = new HashSet<>();
        //TreeSet<Person> treeSet = new TreeSet<>();
        
        Person fran1 = new Person("Francisco", 7, "San Sebastian St.");
        array.add(fran1);
        hashSet.add(fran1);
        //treeSet.add(fran1);
        Person fran2 = new Person("Francisco", 7, "San Sebastian St.");
        array.add(fran2);
        hashSet.add(fran2);
        //treeSet.add(fran2);
        Person mario = new Person("Mario", 10, "Regie p19");
        array.add(fran2);
        hashSet.add(fran2);
        //treeSet.add(fran2);
        Person pedro = new Person("Pedro", 2, "P19");
        array.add(pedro);
        hashSet.add(pedro);
        //treeSet.add(pedro);
        Person joao = new Person("Joao", 21, "Regie");
        array.add(joao);
        hashSet.add(joao);
        //treeSet.add(joao);
        
        
        // ------ Prints & Tests
        System.out.println("\tArrayList: ");
        for(Person person : array)
            System.out.println(person+"\n");
        
        
        System.out.println("\n\n\tHashSet: ");
        for(Person person : hashSet)
            System.out.println(person+"\n");
        System.out.println("Francisco = Francisco ? - "+fran1.equals(fran2));
        // </editor-fold>
        */
        
        // --------------------------------------------------------------- PROBLEM 2
       
        /*
        // <editor-fold desc="Problem 2">
        ArrayList<Employee> employees = new ArrayList<>();
        TreeMap<String, Employee> treeMap = new TreeMap<>();
        
        Employee e = new Employee ("Francisco", 10);
        employees.add(e);
        e = new Employee ("Mario", 6);
        employees.add(e);
        e = new Employee ("Pedro", 1);
        employees.add(e);
        e = new Employee ("Joao", 2);
        employees.add(e);
        e = new Employee ("Raquel", 3);
        employees.add(e);
        e = new Employee ("Maria", 5);
        employees.add(e);
        e = new Employee ("Tiago", 9);
        employees.add(e);
        e = new Employee ("Ines", 8);
        employees.add(e);
        e = new Employee ("Diogo", 7);
        employees.add(e);
        e = new Employee ("Alexandra", 4);
        employees.add(e);
        
        for(Employee emp : employees){
            treeMap.put(emp.getName(), emp);
        }
        
        for(Employee emp : treeMap.values())
            System.out.println(emp+"\n");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.next();
        System.out.println("The employee "+name+" exists. -- "+treeMap.keySet().contains(name));
        // </editor-fold>
        */
         // ------------------------------------------------------------- PROBLEM 3
         
         ReversePolish rP = new ReversePolish();
         
         String[] test = {"1","2","+","3","*"};
         
         System.out.println(rP.evaluation(test));
    }
    
}
