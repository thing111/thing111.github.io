/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Tyler Masthay
 */
public class Customer {
    String name;
    int numKids;
    Customer(String theName, int kidNum) {
        name = theName;
        numKids = kidNum;
    }
    
    public void walkIn(String hostName){
        
    }
    
    public int getKidNum(){
        return numKids;
    }
    public String getName(){
        return "nope";
    }

    String order() {
       return "nope"; 
    }

    String scold(String name, int i) {
        return "Stop it " + name + "...that makes " + i + " times!";
    }

    void pay(int amount, String waiterName) {
        
    }
    
}
