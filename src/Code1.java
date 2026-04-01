import java.util.*;

class Code1 {
    Map<String, Integer> users = new HashMap<>();
    Map<String, Integer> attempts = new HashMap<>();

    boolean checkAvailability(String u) {
        attempts.put(u, attempts.getOrDefault(u, 0) + 1);
        return !users.containsKey(u);
    }

    List<String> suggestAlternatives(String u) {
        return Arrays.asList(u + "1", u + "2", u.replace("_", "."));
    }

    String getMostAttempted() {
        return Collections.max(attempts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
