package restaurant;

public class Restaurant {
    private Chef chef;
    private Customer customer;
    private GoodKid goodKid;
    private AnnoyingKid annoyingKid;
    private Host host;
    private Waiter waiter;
    
    private static String[] menu = new String[9];
    
    /*
    Restaurant constructor
    */
    Restaurant(){
        chef = new Chef("Emeril");
        customer = new Customer("Jeff", 2);
        goodKid = new GoodKid("Army Guy");
        annoyingKid = new AnnoyingKid("Cody");
        host = new Host("Seth");
        waiter = new Waiter("Tom");
        initializeMenu();
    }
    private static void initializeMenu(){
        menu[0] = "Cheese Pizza";
        menu[1] = "Pepperoni Pizza";
        menu[2] = "Sausage Pizza";
        menu[3] = "Sauerkraut Pizza";
        menu[4] = "Hawaiian Pizza";
        menu[5] = "Caesar Salad";
        menu[6] = "Greek Salad";
        menu[7] = "Spaghetti and Marinara";
        menu[8] = "Chicken Parmesan";
    }
    public static void main(String[] args) {
        
    }
    private void nonStaticMain(){
        customer.walkIn(host.getName());
        host.greetCustomer(customer.getName());
        int tableSize = host.getTableSize(customer);
        host.seat(customer);
        host.notifyWaiter(waiter);
        waiter.greetCustomer(customer.getName());
        String item1 = customer.order();
        while(!(onMenu(item1))){
            waiter.correct(customer.getName());
            item1 = customer.order();
        }
        String item2 = goodKid.order();
        while(!(onMenu(item2))){
            waiter.correct(goodKid.getName());
            item2 = goodKid.order();
        }
        String item3 = annoyingKid.misbehave();
        int numScolds = 0;
        int maxScolds = 10;
        while(!(onMenu(item3))){
            waiter.correct(annoyingKid.getName());
            numScolds++;
            System.out.println(customer.scold(annoyingKid.getName(),numScolds));
            if( numScolds < maxScolds ){
                item3 = annoyingKid.misbehave();
            }
            else{
                item3 = "Cheese Pizza";
                break;
            }
        }
        waiter.pinOrder(chef, item1);
        waiter.pinOrder(chef, item2);
        waiter.pinOrder(chef, item3);
        chef.cook(item1);
        chef.cook(item2);
        chef.cook(item3);
        waiter.serve(item1, customer.getName());
        waiter.serve(item2, goodKid.getName());
        waiter.serve(item3, annoyingKid.getName());
        customer.pay(25, waiter.getName());
        waiter.goodbye();
        host.goodbye();
    }
    private static boolean onMenu(String item){
        int menuSize = menu.length;
        for(int i = 0; i < menuSize; i++){
            if( item.equals(menu[i]) ){
                return true;
            }
        }
        return false;
    }
}
