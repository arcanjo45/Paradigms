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
public class Person{
    private String name, address;
    private int cnp;
    
    public Person(String name, int cnp, String address){
        this.name = name;
        this.cnp = cnp;
        this.address = address;
    }
    
    // ------- GETTERS & SETTERS --------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }
    //-------------------------------------
    public String toString(){
        return "Name: "+name+"\nCNP: "+cnp+"\nAddress: "+address;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        else if (this == obj)
            return true;
        else if (this.getClass() != obj.getClass())
            return false;
        
        Person p = (Person) obj;
        return cnp == p.getCnp();
    }
    
    /*@Override
    public int compareTo(Person p){
        return Integer.compare(cnp, p.getCnp());
    }*/
}
