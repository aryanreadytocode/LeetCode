package main;

/*
* We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.



Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false


Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
* */
public class DetectCapital {
    private boolean allUpper = false;
    private boolean allLower = true;
    private boolean mixed = false;

    public boolean detectCapitalUse(String word) {
        int count = 0;
        while (count < word.length()) {
            if (count == 0) {
                if (Character.isUpperCase(word.charAt(0))) {
                    allUpper = true;
                    mixed = true;
                    allLower = false;
                }
            } else {
                if (allUpper) {
                    allUpper = Character.isUpperCase(word.charAt(count));
                }
                if (mixed) {
                    mixed = Character.isLowerCase(word.charAt(count));
                }
                if (allLower) {
                    allLower = Character.isLowerCase(word.charAt(count));
                }
            }
            count++;
        }
        return allUpper || allLower || mixed;
    }
}
