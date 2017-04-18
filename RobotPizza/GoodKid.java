package restaurant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cody
 */
public class GoodKid {

        String name;

        GoodKid(String theName) {
            name = theName;
        }

        public String getName() {
            return name;
        }

        public void order() throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            System.out.println(name + " wants...");
            String na = reader.readLine();
            System.out.println(na + "... " + name + " wants" + na + " ... thats disgusting.");
        }
    }
