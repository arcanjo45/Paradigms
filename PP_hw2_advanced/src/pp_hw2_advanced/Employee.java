/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw2_advanced;

/**
 *
 * @author Acer
 */
public class Employee {
    private String name;
    private int cnp;
    
    public Employee(String name, int cnp){
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public int getCnp() {
        return cnp;
    }
    
    public String toString(){
        return "Name: "+name+"\nCNP: "+cnp;
    }
}
