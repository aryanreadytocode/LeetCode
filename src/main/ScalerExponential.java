package main;

public class ScalerExponential {
    public int pow(int A, int B, int C) {
        int multiplication = 1;
        for(int i = 0; i<B; i++){
            multiplication = multiplication*A;
        }
        if (multiplication<0)
            return multiplication+C;
        else
            return multiplication%C;
    }


}
