package Main;

public class ReverseInteger {

    int testNum = -1234500;

    public static void main(String[] args) {
        new ReverseInteger();
    }

    public ReverseInteger() {
        int result;
        result = reverse(testNum);
        System.out.println(result);
    }

    public int reverseHelper(int num, Boolean negative) throws NumberFormatException{
        String input = Integer.toString(num);
        int index = input.length()-1;
        String output = "";

        if (negative) {
            input = input.substring(1);
            index--;
            output = "-";
        }
        for (int i = index; i >= 0; i--) {
            output = output.concat(input.substring(i));
            input = input.substring(0,i);
        }
        int result;
        try {
            result = Integer.parseInt(output);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public int reverse(int x) {
        if (x < 0) {
            return reverseHelper(x, true);
        } else if (x > 0) {
            return reverseHelper(x, false);
        } else {
            return 0;
        }
    }
}
