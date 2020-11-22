package Main;

import java.util.Arrays;

public class RomanToInteger {

    String testString = "MCMXCIV";

    public static void main(String[] args) {
        new RomanToInteger();
    }

    public RomanToInteger() {
        romanToInt(testString);
    }

    public int romanToInt(String s) {
        int[] resultArray = new int[s.length()];
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I': resultArray[i] = 1;
                    break;
                case 'V': resultArray[i] = 5;
                    break;
                case 'X': resultArray[i] = 10;
                    break;
                case 'L': resultArray[i] = 50;
                    break;
                case 'C': resultArray[i] = 100;
                    break;
                case 'D': resultArray[i] = 500;
                    break;
                case 'M': resultArray[i] = 1000;
                    break;
            }
        }
        System.out.println(Arrays.toString(resultArray));

        for (int j = 0; j < s.length(); j++) {
            if ((j < s.length()-1) && (resultArray[j] < resultArray[j+1])) {
                result += (resultArray[j+1] - (resultArray[j]));
                j += 1;
            } else {
                result += resultArray[j];
            }
            System.out.println("Result: " + result);
        }
        System.out.println("Final Number = " + result);
        return result;
    }
}
