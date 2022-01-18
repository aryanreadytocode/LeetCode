package main;

import java.util.ArrayList;
import java.util.List;

/*
* Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.



Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
* */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.isEmpty()) return true;
        else if (s.isEmpty()) return false;
        else {
            int patternLength = pattern.length();
            String[] stringArrays = s.split(" ");
            int stringLength = stringArrays.length;
            if (patternLength != stringLength) return false;
            else {
                StringBuilder visitedPattern = new StringBuilder();
                List<String> visitedWord = new ArrayList<>();
                StringBuilder patternPosition = new StringBuilder();
                StringBuilder stringPosition = new StringBuilder();
                for (int i = 0; i < pattern.length() ; i++) {
                    if (!visitedPattern.toString().contains("" + pattern.charAt(i))) {
                        visitedPattern.append(pattern.charAt(i));
                        for (int j = 0; j < pattern.length() ; j++) {
                            if (pattern.charAt(i) == pattern.charAt(j))
                                patternPosition.append(j);

                        }
                        patternPosition.append(",");
                    }
                }

                for (String stringArray : stringArrays) {
                    if (!visitedWord.contains(stringArray)) {
                        visitedWord.add(stringArray);
                        for (int j = 0; j < stringArrays.length; j++) {
                            if (stringArray.equals(stringArrays[j]))
                                stringPosition.append(j);
                        }
                        stringPosition.append(",");
                    }
                }
                return stringPosition.toString().equalsIgnoreCase(patternPosition.toString());
            }
        }
    }
}
