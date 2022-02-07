package main;

import java.util.ArrayList;
import java.util.List;

public class ScalerCommonElement {
    public int[] solve(int[] A, int[] B){
        List<Integer> resultArray = new ArrayList<>();
        List<Integer> positionArray = new ArrayList<>();
        int coutn= 0;
        for (int i = 0; i< A.length; i++){
            for (int j = 0; j<B.length; j++) {
                if (A[i] == B[j] && !positionArray.contains(j)){
                    positionArray.add(j);
                    resultArray.add(A[i]);
                    coutn++;
                    break;
                }
            }
        }
        int[] resultArrayFinal = new int[resultArray.size()];
        for (int k = 0; k<resultArray.size(); k++){
            resultArrayFinal[k] = resultArray.get(k);
        }
        return resultArrayFinal;
    }
}
