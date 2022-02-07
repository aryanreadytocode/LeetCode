package main;

public class Scaler {
    public int solve(int[] A, int B) {
        int pairCount = 0;
        for (int i = 0; i<A.length; i++) {
            for (int j= i+1; j< A.length; j++) {
                if (A[i]+A[j] == B)
                    pairCount++;
            }
        }
        return pairCount;
    }
}
