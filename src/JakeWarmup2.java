/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */
public static String stringTimes(String str, int n) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < n; i++) {
        builder.append(str);
    }

    return builder.toString();
}

/**
 *
 Given a string and a non-negative int n, we'll say that the front of the string is the first
 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

 frontTimes("Chocolate", 2) → "ChoCho"
 frontTimes("Chocolate", 3) → "ChoChoCho"
 frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public static String frontTimes(String str, int n) {

    String front = str.length() > 3 ? str.substring(0,3) : str;

    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < n; i++) {
        builder.append(front);
    }

    return builder.toString();

}

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */
public static int countXX(String str) {
    int count = 0;

    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'x' && str.charAt(i) == str.charAt(i + 1)) {
            count++;
        }
    }

    return count;
}

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */

public static boolean doubleX(String str) {
    if (!str.contains("x")) return false;

    boolean firstXFound = false;

    for (int i = 0; i < str.length() - 1 && !firstXFound; i++) {
        if (str.charAt(i) == 'x') {
            firstXFound = true;

            if (str.charAt(i + 1) == 'x') {
                return true;
            }
        }
    }
    return false;
}

/**
 *
 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


 stringBits("Hello") → "Hlo"
 stringBits("Hi") → "H"
 stringBits("Heeololeo") → "Hello"
 */
public static String stringBits(String str) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        if (i % 2 == 0) {
            builder.append(str.charAt(i));
        }
    }
    return builder.toString();
}

/**
 *
 Given a non-empty string like "Code" return a string like "CCoCodCode".


 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
public static String stringSplosion(String str) {

    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        builder.append(str, 0, i + 1);
    }

    return builder.toString();

}