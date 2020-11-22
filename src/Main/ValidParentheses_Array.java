package Main;

import java.util.ArrayList;

public class ValidParentheses_Array {

    String testString = "((";
    // ((abcd))gef(({e}{t}))

    public static void main(String[] args) {
        new ValidParentheses_Array();
    }

    public ValidParentheses_Array() {
        isValid(testString);
    }

    public boolean isValid(String s) {
        ArrayList<Character> openParens = new ArrayList<>();

        for (char c: s.toCharArray()) {
            if (isParen(c)) {
                if (openParen(c)) {
                    openParens.add(c);
                } else if (openParens.isEmpty()) {
                    return false;
                } else {
                    switch (parenToInt(openParens.get(openParens.size()-1))) {
                        case 0:
                            if (parenToInt(c) != 3) { return false; }
                            break;
                        case 1:
                            if (parenToInt(c) != 4) { return false; }
                            break;
                        case 2:
                            if (parenToInt(c) != 5) { return false; }
                            break;

                    }
                    openParens.remove(openParens.size()-1);
                }
            } else {
                continue;
            }
        }
        if (openParens.size() != 0) {
            return false;
        }
        System.out.println("True");
        return true;
    }

    public int parenToInt(char c) {
        switch (c) {
            case '(': return 0;
            case '{': return 1;
            case '[': return 2;
            case ')': return 3;
            case '}': return 4;
            case ']': return 5;
        }
        return -1;
    }

    public boolean isParen(char c) {
        switch(c) {
            case '(':
            case ')':
            case '{':
            case '}':
            case '[':
            case ']': return true;
        }
        return false;
    }

    public boolean openParen(char c) {
        switch (c) {
            case '(':
            case '{':
            case '[': return true;
        }
        return false;
    }

}
