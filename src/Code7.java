import java.util.*;

class Code7 {
    Map<String, Integer> freq = new HashMap<>();

    List<String> search(String p) {
        List<String> res = new ArrayList<>();
        for (String q : freq.keySet()) if (q.startsWith(p)) res.add(q);
        res.sort((a, b) -> freq.get(b) - freq.get(a));
        return res.subList(0, Math.min(10, res.size()));
    }
}
