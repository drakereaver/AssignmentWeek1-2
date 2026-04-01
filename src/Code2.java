import java.util.*;

class Code2 {
    Map<String, Integer> stock = new HashMap<>();
    Map<String, Queue<Integer>> waitlist = new HashMap<>();

    synchronized String purchase(String p, int u) {
        int s = stock.getOrDefault(p, 0);
        if (s > 0) {
            stock.put(p, s - 1);
            return "Success";
        }
        waitlist.computeIfAbsent(p, k -> new LinkedList<>()).add(u);
        return "Waitlist";
    }
}
