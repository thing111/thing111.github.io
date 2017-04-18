package restaurant;

public class Host {

    private String name;
    Host(String theName) {
       name = theName;
    }

    String getName() {
        return name;
    }
    
    public void greetCustomer(String custName){
        System.out.println("hello" + custName + "welcome to Robot Pizza");
    }
    
    public int getTableSize(Customer cust){
        return cust.getKidNum();
    }

    public void seat(Customer customer) {
        System.out.println("sit down b@tch");
    }

    void notifyWaiter(Waiter waiter) {
        System.out.println("hey" + waiter.getName() + " get over here");
    }

    void goodbye() {
        System.out.println("please leave");
       
    }
    
}
