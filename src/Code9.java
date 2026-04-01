import java.util.*;

class Code9 {
    List<int[]> tx = new ArrayList<>();

    List<int[]> twoSum(int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < tx.size(); i++) {
            int a = tx.get(i)[1];
            if (map.containsKey(target - a)) res.add(new int[]{map.get(target - a), i});
            map.put(a, i);
        }
        return res;
    }
}
