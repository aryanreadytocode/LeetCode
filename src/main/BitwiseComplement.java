package main;

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
