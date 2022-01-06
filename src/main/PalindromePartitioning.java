package main;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class PalindromePartitioning {

    public List<List<String>> solution(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, new ArrayList<>(), result);
        return result;
    }

    private void helper(String s, List<String> currList, List<List<String>> result) {
        if (s.isEmpty())
            result.add(currList);

        for (int i =1; i<=s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            if (isPalindrome(left)) {
                List<String> copyList = new ArrayList<>(currList);
                copyList.add(left);
                helper(right, copyList, result);
            }
        }
    }

    /*rajabajar*/
    boolean isPalindrome(String s) {
        int l = 0; int r = s.length()-1;
        while (l <= r && s.charAt(r) == s.charAt(l)) {
            l++;
            r--;
        }
        return l>=r;
    }
}