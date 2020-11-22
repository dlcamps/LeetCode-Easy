package Main;

public class LongestCommonPrefix {

    String[] testStrings = new String[]{"Hello", "He", "Hell"};
    String newLine = System.getProperty("line.separator");

    public static void main(String[] args) {
        new LongestCommonPrefix();
    }

    public LongestCommonPrefix() {
        longestCommonPrefix(testStrings);
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if (strs.length == 0) { return prefix; }

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);
            int wordsWithChar = 1;
            System.out.println(newLine);
            System.out.println("Char — " + ch);

            for (int j = 1; j < strs.length; j++) {
                System.out.println("    strs[j: " + j + "] = " + strs[j]);
                if ((i < strs[j].length()) && (strs[j].charAt(i) == ch)) {
                    System.out.println("    Character in common: " + ch);
                    wordsWithChar++;
                }
            }
            if (wordsWithChar == strs.length) {
                prefix = prefix.concat(Character.toString(ch));
            } else {
                break;
            }
            System.out.println("Prefix = " + prefix);
        }

        System.out.println(newLine);
        System.out.println("Longest Common Prefix = " + prefix);
        return prefix;
    }
}
