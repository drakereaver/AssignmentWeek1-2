import java.util.*;

class Code3 {
    class Entry {
        String ip;
        long exp;
        Entry(String i, long e) {
            ip = i;
            exp = e;
        }
    }

    Map<String, Entry> cache = new HashMap<>();

    String resolve(String d) {
        Entry e = cache.get(d);
        if (e != null && System.currentTimeMillis() < e.exp) return e.ip;
        String ip = "1.2.3.4";
        cache.put(d, new Entry(ip, System.currentTimeMillis() + 300000));
        return ip;
    }
}
