package main;

import java.util.Arrays;

public class CarPooling {
    public boolean solution1(int[][] trips, int capacity) {
        int[] count = new int[1001];
        for (int[] trip : trips) {
            for (int i = trip[1]; i <= trip[2]; i++) {
                count[i] += trip[0];
            }

        }
        return Arrays.stream(count).max().getAsInt() <= capacity;
    }

    public boolean solution2(int[][] trips, int capacity) {
        int[] timeStamp = new int[1001];
        for (int[] trip : trips) {
            timeStamp[trip[1]] += trip[0];
            timeStamp[trip[2]] -= trip[0];
        }

        for (int time : timeStamp) {
            capacity -= time;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }

}
