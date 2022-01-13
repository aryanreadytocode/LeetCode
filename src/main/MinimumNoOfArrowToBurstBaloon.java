package main;

import java.util.Arrays;

public class MinimumNoOfArrowToBurstBaloon {

    public int solution(int[][] points) {
        int[][] sortedPoints = sortAsc(points);
        if(points.length == 0) return 0;
        int arrows = 1;
        int end = points[0][1];

        for(int i = 1; i < sortedPoints.length; i++){
            if(sortedPoints[i][0] > end){
                arrows++;
                end = sortedPoints[i][1];
            }
        }
        return arrows;
    }

    private int[][] sortAsc(int[][] points) {
        int unsorted = points.length-1;
        int greatestNoIndex = 0;
        int[] temp;
        while (unsorted > 0) {
            for (int i = 1; i<=unsorted ; i++) {
                if (points[greatestNoIndex][1]< points[i][1]) {
                    greatestNoIndex = i;
                }
            }
            temp = points[unsorted];
            points[unsorted] = points[greatestNoIndex];
            points[greatestNoIndex] = temp;
            unsorted--;
        }
        return points;
    }
}
