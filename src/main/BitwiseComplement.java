package main;

public class BitwiseComplement {

    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
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
        Integer reverseInt = Integer.parseInt(sb.toString());
        String value = String.valueOf(reverseInt);
        int returnValue = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '1') {
                returnValue += Math.pow(2, i);
            }
        }
        return returnValue;
    }
}
