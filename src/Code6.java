import java.util.*;

class Code6 {
    class Bucket {
        int tokens;
        long last;
        Bucket(int m) {
            tokens = m;
            last = System.currentTimeMillis();
        }
    }

    Map<String, Bucket> buckets = new HashMap<>();

    boolean allow(String id) {
        Bucket b = buckets.computeIfAbsent(id, k -> new Bucket(1000));
        long now = System.currentTimeMillis();
        if (now - b.last > 3600000) {
            b.tokens = 1000;
            b.last = now;
        }
        if (b.tokens > 0) {
            b.tokens--;
            return true;
        }
        return false;
    }
}
