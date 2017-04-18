package restaurant;

public class Host {

    private String name;
    Host(String theName) {
       name = theName;
    }

    String getName() {
        return "nope";
    }
    
    public void greetCustomer(String custName){
    
    }
    
    public int getTableSize(Customer cust){
        return -1;
    }

    public void seat(Customer customer) {
        
    }

    void notifyWaiter(Waiter waiter) {
        
    }

    void goodbye() {
       
    }
    
}
