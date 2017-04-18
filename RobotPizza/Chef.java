package restaurant;

public class Chef {

    private String name;
    ArrayList<String> pendingOrders = new ArrayList<>();
    
    Chef(String theName) {
        name = theName;
    }
    
    public String getName(){
        return name;
    }
    
    public String cook(String item){
        pendingOrders.remove(item);
        return "Your order" + item + " is ready";
    }
    
    public void addOrder(String item){
        pendingOrder.add(item);
    
    }
}
