package jake.leetCode;

public class LeetCode75 {

    public static void main(String[] args) {

        System.out.println(mergeAlternatively("abd", "pqr"));
    }

    public static String mergeAlternatively(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder merged = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }
}
