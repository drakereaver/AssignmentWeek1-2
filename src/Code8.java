import java.util.*;

class Code8 {
    String[] spots = new String[500];

    int hash(String plate) {
        return Math.abs(plate.hashCode() % 500);
    }

    int park(String plate) {
        int i = hash(plate);
        while (spots[i] != null) i = (i + 1) % 500;
        spots[i] = plate;
        return i;
    }

    void exit(String plate) {
        for (int i = 0; i < 500; i++) if (plate.equals(spots[i])) spots[i] = null;
    }
}
