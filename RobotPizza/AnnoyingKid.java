package restaurant;

/**
 *
 * @author Cody
 */
public class AnnoyingKid {

    private String name;
    
    AnnoyingKid(String theName) {
        name = theName;
    }
    
    public void politelyOrder(){
        System.out.println("I, " + name + " would like an Asiago Ranch Chicken Club.");
    }
    
    public void misbehave(){
        System.out.println("Your boi would like your got damn ice cream machine to work.");
    }

    String getName() {
        return name;
    }
    
}
