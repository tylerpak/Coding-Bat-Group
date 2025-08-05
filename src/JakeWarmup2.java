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