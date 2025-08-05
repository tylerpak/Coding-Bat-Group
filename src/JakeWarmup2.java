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

/**
 *
 Given an array of ints, return the number of 9's in the array.
 arrayCount9([1, 2, 9]) → 1
 arrayCount9([1, 9, 9]) → 2
 arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public static int arrayCount9(int[] nums) {
    int count = 0;

    for (int num : nums) {
        if (num == 9) {
            count ++;
        }
    }

    return count;
}


/**
 *
 Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


 arrayFront9([1, 2, 9, 3, 4]) → true
 arrayFront9([1, 2, 3, 4, 9]) → false
 arrayFront9([1, 2, 3, 4, 5]) → false
 */
public static boolean arrayFront9(int[] nums) {

    int i = 0;
    boolean foundNine = false;

    if (nums.length == 0 ) return false;

    while (i < nums.length && i < 4 && !foundNine) {
        if (nums[i] == 9) {
            foundNine = true;
        }

        i++;
    }

    return foundNine;
}

/**
 *
 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

 stringYak("yakpak") → "pak"
 stringYak("pakyak") → "pak"
 stringYak("yak123ya") → "123ya"

 */
public static String stringYak(String str) {
    return str.replaceAll("yak", "");
}

/**
 *
 Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
 array667([6, 6, 2]) → 1
 array667([6, 6, 2, 6]) → 1
 array667([6, 7, 2, 6]) → 1
 */
public static int array667(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length - 1; i++) {
        if ((nums[i] == 6 && nums[i+1] == 6) || (nums[i] == 6 && nums[i+1] == 7)) {
            count++;
        }
    }

    return count;
}

/**
 *
 Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


 noTriples([1, 1, 2, 2, 1]) → true
 noTriples([1, 1, 2, 2, 2, 1]) → false
 noTriples([1, 1, 1, 2, 2, 2, 1]) → false

 */
public static boolean noTriples(int [] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
            return false;
        }
    }

    return true;
}

public static int stringMatch(String a, String b) {

    int count = 0;

    int max_length = Math.min(a.length(), b.length());

    for (int i = 0; i < max_length - 1; i++) {
        if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
            count++;
        }
    }

    return count;
}

public static boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
            return true;
        }
    }

    return false;
}

public static String stringX(String str) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i< str.length(); i++) {
        if (i == 0) {
            builder.append(str.charAt(i));
        } else if (i == str.length() - 1) {
            builder.append(str.charAt(i));
        } else {
            if (str.charAt(i) != 'x') {
                builder.append(str.charAt(i));
            }
        }
    }

    return builder.toString();
}

/**
 *
 Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


 has271([1, 2, 7, 1]) → true
 has271([1, 2, 8, 1]) → false
 has271([2, 7, 1]) → true
 */
public static boolean has271(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
        int value = nums[i];

        int lowerBound = Math.abs(value - 1) - 2;
        int upperBound = Math.abs(value - 1) + 2;
        if (nums[i + 1] == value + 5 && nums[i + 2] >= lowerBound && nums[i + 2] <= upperBound ){
            return true;
        }
    }

    return false;

}