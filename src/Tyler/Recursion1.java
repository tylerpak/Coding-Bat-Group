package Tyler;

public class Recursion1 {


    public static int factorial(int n) {
        if(n <= 1) {
            return n;
        }
        else {
            return n * factorial(n-1);
        }

    }

    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) {
            return bunnies;
        }
        else {
            return bunnyEars(bunnies-1) + 2;
        }
    }

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static int bunnyEars2(int bunnies) {
        if(bunnies == 0) {
            return bunnies;
        }
        if(bunnies%2 == 0) {
            return bunnyEars2(bunnies-1) +3;
        }
        else {
            return bunnyEars2(bunnies-1) +2;
        }
    }

    public static int triangle(int rows) {
        if(rows == 0) {
            return rows;
        }
        else {
            return rows + triangle(rows-1);
        }
    }

    public static int sumDigits(int n) {
        if(n==0) {
            return n;
        }
        else {
            return n%10 + sumDigits(n/10);
        }
    }

    public static int count7(int n) {
        return count7Helper(n, 0);
    }

    public static int count7Helper(int n, int i) {
        if(n == 0) {
            return i;
        }
        else if (n%10 == 7) {
            return count7Helper(n/10, i+1);
        }
        else {
            return count7Helper(n/10, i);
        }
    }

    public static int count8(int n) {
        if(n==0) {
            return 0;
        }
        else if(n%100 == 88) {
            return 2 + count8(n/10);
        }
        else if(n%10 == 8) {
            return 1 + count8(n/10);
        }
        else {
            return count8(n/10);
        }
    }

    public static int powerN(int base, int n) {
        if(n == 1) {
            return base;
        }
        else {
            return base * powerN(base, n-1);
        }
    }

    public static int countX(String str) {
        if(str.equals("")) {
            return 0;
        }
        else if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
        }
        else {
            return countX(str.substring(1));
        }
    }

    public static int countHi(String str) {
        if(str.length() < 2) {
            return 0;
        }
        else if(str.startsWith("hi")) {
            return 1 + countHi(str.substring(1));
        }
        else {
            return countHi(str.substring(1));
        }
    }

    public static String changeXY(String str) {
        return changeXYHelper(str, 0);
    }

    public static String changeXYHelper(String str, int index) {
        StringBuilder strB = new StringBuilder(str);
        if(index == str.length()) {
            return strB.toString();
        }
        else if(strB.charAt(index) == 'x') {
            strB.replace(index, index+1, "y");
        }
        return changeXYHelper(strB.toString(), index + 1);
    }

    public static String changePi(String str) {
        if(str.isEmpty()) {
            return "";
        }
        else if(str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    public static String noX(String str) {
        if(str.isEmpty()) {
            return "";
        }
        else if(str.startsWith("x")) {
            return noX(str.substring(1));
        }
        else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    public static boolean array6(int[] nums, int index) {
        if(index == nums.length) {
            return false;
        }
        else if(nums[index] == 6) {
            return true;
        }
        else {
            return array6(nums, index + 1);
        }
    }

    public static int array11(int[] nums, int index) {
        if(index > nums.length -1) {
            return 0;
        }
        else if(nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if(index > nums.length - 1) {
            return false;
        }
        else if(index < 1) {
            return array220(nums, index + 1);
        }

        else if(nums[index] == (nums[index-1] * 10)) {
            return true;
        }
        return array220(nums, index + 1);
    }

    public static String allStar(String str) {
        if(str.length() == 1) {
            return str;
        }
        else if(str.isEmpty()) {
            return "";
        }
        else {
            return str.charAt(0) + "*" +  allStar(str.substring(1));
        }
    }

    public static String pairStar(String str) {
        if(str.isEmpty()) {
            return "";
        }
        else if(str.length() == 1) {
            return str;
        }
        else if(str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    public static String endX(String str) {
        if(str.isEmpty()) {
            return "";
        }
        else if(str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        }
        else {
            return str.charAt(0) + endX(str.substring(1));
        }
    }

    public static int countPairs(String str) {
        if(str.length() <= 2) {
            return 0;
        }
        else if(str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        else {
            return countPairs(str.substring(1));
        }
    }

    public static int countAbc(String str) {
        if(str.length() <= 2) {
            return 0;
        }
        else if((str.startsWith("aba")) || (str.startsWith("abc"))) {
            return 1 + countAbc(str.substring(1));
        }
        else {
            return countAbc(str.substring(1));
        }
    }

    public static int count11(String str) {
        if(str.length() < 2) {
            return 0;
        }
        else if(str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        }
        else {
            return count11(str.substring(1));
        }
    }

    public static String stringClean(String str) {
        if(str.isEmpty()) {
            return "";
        }
        else if(str.length()==1) {
            return str;
        }
        else if(str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    public static int countHi2(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        else if(str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }
        else if(str.startsWith("hi")) {
            return 1 + countHi2(str.substring(1));
        }
        else {
            return countHi2(str.substring(1));
        }
    }

    public static String parenBit(String str) {
        if(str.startsWith(")")) {
            return ")";
        }
        else if(str.contains("(")) {
            return "(" + parenBit(str.substring(str.indexOf("(") + 1));
        }
        else {
            return str.charAt(0) + parenBit(str.substring(1));
        }
    }

    public static boolean nestParen(String str) {
        if(str.isEmpty()) {
            return true;
        }
        else if(str.startsWith("(") && (str.endsWith(")"))) {
            return nestParen(str.substring(1, str.length() - 1));
        }
        else {
            return false;
        }
    }

    public static int strCount(String str, String sub) {
        if(str.isEmpty()) {
            return 0;
        }
        else if(str.equals(sub)) {
            return 1;
        }
        else if(str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        else {
            return strCount(str.substring(1), sub);
        }
    }

    public static boolean strCopies(String str, String sub, int n) {
        if(n == 0) {
            return true;
        }
        else if (str.isEmpty()) {
            return false;
        }
        else if(str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        else {
            return strCopies(str.substring(1), sub, n);
        }
    }


    public static int strDist(String str, String sub) {
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (str.isEmpty()) {
            return 0;
        }
        else if(str.length() == 1) {
            if(str.equals(sub)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        if (str.startsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else {
            return strDist(str.substring(1, str.length() - 1), sub);
        }
    }
}
