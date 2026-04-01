import java.util.*;

class Code4 {
    Map<String, Set<String>> ngrams = new HashMap<>();

    void addDoc(String id, List<String> grams) {
        for (String g : grams) ngrams.computeIfAbsent(g, k -> new HashSet<>()).add(id);
    }

    Set<String> analyze(List<String> grams) {
        Set<String> res = new HashSet<>();
        for (String g : grams) if (ngrams.containsKey(g)) res.addAll(ngrams.get(g));
        return res;
    }
}
