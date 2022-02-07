package main;

public class ScalerSolution {
    public int solve(int[] A){
        int[] resultArray = new int[A.length];
        int maxEven = Integer.MIN_VALUE;
        int maxOdd = Integer.MAX_VALUE;
        for (int i = 0; i< A.length; i++) {
            if (A[i]%2 == 0 && A[i] > maxEven)
                maxEven = A[i];
            else if (A[i]%2 != 0 && A[i] < maxOdd)
                maxOdd = A[i];
        }
        return maxEven - maxOdd;
    }
}
