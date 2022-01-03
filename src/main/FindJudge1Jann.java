package main;

public class FindJudge1Jann {

    public int indJudge(int n, int[][] trust) {
        boolean judgeIsThere = false;

        for (int[] trust1 : trust) {
            if (trust1.length == 0)
                return n;
            if (trust1[0] == n) {
                judgeIsThere = false;
                break;
            } else {
                judgeIsThere = true;
            }
        }

        if (judgeIsThere)
            return n;
        else
            return -1;
    }
}
