package restaurant;

public class Waiter {
    private String name;
    
    Waiter(String theName) {
        name = theName;
    }
    
    public String getName(){
        return "nope";
    }

    void greetCustomer(String name) {
        System.out.println("Welcome to Robot Pizza " + name);
    }

    void correct(String name) {
        System.out.println("I'm sorry, " + name + " but that item is not on the menu.");
    }

    void pinOrder(Chef chef, String item1) {
        
    }

    void serve(String item1, String name) {
        
    }

    void goodbye() {
        
    }
    
}
