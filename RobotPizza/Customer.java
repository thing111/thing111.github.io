/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Scanner;

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
        System.out.println("Can we get a table?");
    }
    
    public int getKidNum(){
        return numKids;
    }
    public String getName(){
        return name;
    }

    String order() {
       Scanner in = new Scanner(System.in);
       return in.next();
    }

    String scold(String name, int i) {
        return "Stop it " + name + "...that makes " + i + " times!";
    }

    void pay(int amount, String waiterName) {
        System.out.printf("Thank you %s. Here is $%d", waiterName, amount);
    }
    
}
