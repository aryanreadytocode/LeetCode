package main;

/*
* Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.


Example 1:

Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.


Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
* */
public class StringToInteger {
    public int myAtoi(String s) {
        String trimmedString = s.trim();
        int count = 0;
        boolean isNegative = false;
        StringBuilder sb = new StringBuilder();
        int returnValue = 0;
        boolean negativeChecked = false;
        while (count < trimmedString.length()) {

            if (trimmedString.charAt(count) == '-' && !negativeChecked) {
                isNegative = true;
                count++;
                negativeChecked = true;
                continue;
            }else if (trimmedString.charAt(count) == '+' && !negativeChecked) {
                count++;
                negativeChecked = true;
                continue;
            }

            if (Character.isDigit(trimmedString.charAt(count))) {
                sb.append(trimmedString.charAt(count));
            } else if (!Character.isDigit(trimmedString.charAt(0))){
                break;
            } else if (!Character.isDigit(trimmedString.charAt(count))){
                break;
            } else {
                count++;
                continue;
            }
            count++;
        }
        if (sb.toString().isEmpty())
            sb.append("0");
        long returnValue1 = Long.parseLong(sb.toString());

        if (isNegative)
            returnValue1 = returnValue1 - returnValue1 * 2;

        if (returnValue1<-Math.pow(2,31))
            returnValue = (int) Math.pow(2,31)+1;
        else if (returnValue1>= Math.pow(2,31)-1)
            returnValue = (int) (Math.pow(2,31)-1);
        else
            returnValue = (int) returnValue1;


        return returnValue;
    }
}
