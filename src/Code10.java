import java.util.*;

class Code10 {
    LinkedHashMap<String, String> L1 = new LinkedHashMap<>(10000, 0.75f, true);
    Map<String, String> L2 = new HashMap<>();
    Map<String, String> L3 = new HashMap<>();

    String getVideo(String v) {
        if (L1.containsKey(v)) return L1.get(v);
        if (L2.containsKey(v)) {
            L1.put(v, L2.get(v));
            return L2.get(v);
        }
        return L3.get(v);
    }
}
