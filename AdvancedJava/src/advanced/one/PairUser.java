
package advanced.one;

import java.util.ArrayList;
import java.util.List;


public class PairUser {
    public static void main(String[] args) {
        
        Pair<Integer, String> pair1 = new OrderedPair<>(1, "Kanita");
        System.out.println(pair1.getKey() + pair1.getValue());
        
        List<String> prvaKlupa = new ArrayList<>();
        prvaKlupa.add("Mahir");
        prvaKlupa.add("Ferida");
        prvaKlupa.add("Kanita");
        
        Pair<Integer, List<String>> pair2 = new OrderedPair<>(1, prvaKlupa);
    }
}
