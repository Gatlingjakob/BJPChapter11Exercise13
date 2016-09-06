import java.util.HashMap;
import java.util.Map;
import java.util.*;

import static javafx.scene.input.KeyCode.K;

/**
 * Created by Jakob on 01-09-2016.
 */
public class isUnique {

public static void main (String[] args) {

    Map<String, String> m1 = new HashMap<String, String>();
    m1.put("Marty", "Stepp");
    m1.put("Stuart", "Reges");
    m1.put("Jessica", "Miller");
    m1.put("Ann", "Perkins");
    m1.put("Hal", "Perkins");

    System.out.println(isUniques(m1));

}

    public static boolean isUniques(Map<String, String> input) {
        Set<String> uniqueValues = new HashSet<String>();
        for (String value : input.values()) {
            if (uniqueValues.contains(value)) {
                return false;
            }
            uniqueValues.add(value);
        }
        return true;
    }
}
