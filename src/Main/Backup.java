package Main;

public class Backup {
    /*
    public String reverseHelper(String input, Boolean negative) {
        boolean leadingZeros = false;
        String output = "";

        if (negative) {
            input = input.substring(1);
            output = "-";
        }

        int index = input.length()-1;

        for (int i = index; i >= 0; i--) {
            if (i == index) {
                if (input.substring(index).equals("0")) {
                    System.out.println("(Skipping a 0)");
                    leadingZeros = true;
                } else {
                    output = output.concat(input.substring(index));
                }
            } else if (leadingZeros && !input.substring(i, i+1).equals("0")){
                leadingZeros = false;
                output = output.concat(input.substring(i,i+1));
            } else if (leadingZeros && input.substring(i, i+1).equals("0")) {
                continue;
            } else {
                output = output.concat(input.substring(i,i+1));
            }
            System.out.println("i = " + i + ", output = " + output);
        }

        return output;
    }

    public int reverse(int x) {
        int returnNum;

        if (x < 0) {
            returnNum = reverseHelper(x, true);

        } else if (x > 0) {
            returnNum = reverseHelper(x, false);

        } else {
            returnNum = 0;
        }

        return returnNum;
    }

     */
}

