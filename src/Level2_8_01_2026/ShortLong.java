package Level2_8_01_2026;

public class ShortLong {

    static int[] findShortLong(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }
}
