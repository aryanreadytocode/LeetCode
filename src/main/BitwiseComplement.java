package main;
/*
* The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.



Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
* */
public class BitwiseComplement {

    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        if (n ==0)
            return 1;
        while (n > 0) {
            int value = n % 2;
            if (value == 0)
                value = 1;
            else
                value = 0;
            sb.append(value);
            n = n / 2;
        }
        sb.reverse();
        int returnValue = 0;
        int count = 0;
        for (int i = sb.length()-1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                returnValue += Math.pow(2, count);
            }
            count++;
        }
        return returnValue;
    }
}
