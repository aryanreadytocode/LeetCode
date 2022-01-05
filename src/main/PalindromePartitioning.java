package main;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        String subString;
        List<String> childList = new ArrayList<>();
        List<String> childList1 = new ArrayList<>();
        List<List<String>> parentList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            childList.add("" + s.charAt(i));
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    subString = s.substring(i, j + 1);
                    boolean isPoly = true;
                    for (int k = 0; k < subString.length() - 1; k++) {
                        if (subString.charAt(k) != subString.charAt(subString.length() - 1-k)) {
                            isPoly = false;
                            break;
                        }
                    }
                    if (isPoly)
                        childList1.add(subString);

                }

            }

        }
        parentList.add(childList);
        if (!childList1.isEmpty())
            parentList.add(childList1);
        return parentList;
    }
}