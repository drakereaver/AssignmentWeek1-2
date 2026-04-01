import java.util.*;

class Code5 {
    Map<String, Integer> views = new HashMap<>();
    Map<String, Set<String>> unique = new HashMap<>();
    Map<String, Integer> sources = new HashMap<>();

    void process(String url, String user, String src) {
        views.put(url, views.getOrDefault(url, 0) + 1);
        unique.computeIfAbsent(url, k -> new HashSet<>()).add(user);
        sources.put(src, sources.getOrDefault(src, 0) + 1);
    }
}
