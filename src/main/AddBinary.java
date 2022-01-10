package main;

public class AddBinary {

    public String solution(String a, String b) {
        int remainder = 0;
        int sum = 0;
        int length = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int initialSum1 = 0;
        while (count <= length) {
            int i1 = 0;
            int i2 = 0;
            if (a.length() - count >= 0) {
                i1 = Integer.parseInt(String.valueOf(a.charAt(a.length() - count)));
            }
            if (b.length() - count >= 0) {
                i2 = Integer.parseInt(String.valueOf(b.charAt(b.length() - count)));
            }
            initialSum1 = i1 + i2 + remainder;

            remainder = initialSum1 / 2;
            sum += initialSum1 % 2;

            sb.append(sum);
            sum = 0;
            count++;
        }
        if (remainder != 0)
            sb.append(remainder);
        return sb.reverse().toString();
    }
}
