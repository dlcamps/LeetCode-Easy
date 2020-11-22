package Main;

import java.util.Stack;

public class ValidParentheses {

    String testString = "((";

    public static void main(String[] args) {
        new ValidParentheses();
    }

    public ValidParentheses() {
        isValid(testString);
    }

    public boolean isValid(String s) {
        Stack<Character> openParens = new Stack<>();

        for (char c: s.toCharArray()) {
            if (isParen(c)) {
                if (openParen(c)) {
                    openParens.push(c);
                } else if (openParens.isEmpty()) {
                    return false;
                } else {
                    switch (parenToInt(openParens.peek())) {
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
                    openParens.pop();
                }
            } else {
                continue;
            }
        }
        if (openParens.size() != 0) {
            return false;
        }
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

