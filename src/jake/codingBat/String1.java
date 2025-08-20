package jake.codingBat;

public class String1 {

    static void main() {

    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    public static String makeOutWord(String out, String word) {
        String outWord = "";
        outWord += out.substring(0, 2);
        outWord += word;
        outWord += out.substring(2);

        return outWord;
    }

    public static String extraEnd(String str) {
        String lastTwo = str.substring(str.length()-2);
        return lastTwo + lastTwo + lastTwo;
    }

    public static String firstTwo(String str) {
        if (str.length() < 2) return str;

        return str.substring(0, 2);
    }

    static String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }

        return "";
    }

    static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    static String comboString(String a, String b) {
        String shorter;
        String longer;

        if (a.length() > b.length()) {
            shorter = b;
            longer = a;
        } else {
            shorter = a;
            longer = b;
        }

        return shorter + longer + shorter;
    }

    static String nonStart(String a, String b) {

        String first = a.substring(1);
        String second = b.substring(1);

        return first + second;
    }

    static String left2(String str) {
        String firstTwo = str.substring(0,2);
        String remainder = str.substring(2);

        return remainder + firstTwo;
    }

    static String right2(String str) {
        String lastTwo = str.substring(str.length() - 2);
        String remainder = str.substring(0, str.length() - 2);

        return lastTwo + remainder;
    }

    static String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length() -1);
    }

    static String withoutEnd2(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    static String middleTwo(String str) {
        int index = str.length() / 2;
         return str.substring(index - 1, index + 1);
    }

    static boolean endsLy(String str) {
        if (str.length() <= 1) {
            return false;
        }

        String lastTwo = str.substring(str.length() - 2);
        return lastTwo.equalsIgnoreCase("ly");
    }

    static String nTwice(String str, int n) {
        String firstHalf = str.substring(0, n - 1);
        String secondHalf =str.substring(str.length() - n);

        return firstHalf + secondHalf;
    }

    static String twoChar(String str, int index) {
        if (str.isEmpty()) return "";
        if (index >= str.length() - 1 || index < 0) return str.substring(0,2);

        return str.substring(index, index+2);
    }

    static String middleThree(String str) {
        if (str.length() <= 3) return str;

        int middleIndex = str.length() / 2;

        return str.substring(middleIndex - 1, middleIndex + 2);
    }

    static boolean hasBad(String str) {

        if (str.length() < 3) return false;
        if (str.length() == 3) {
            return str.equalsIgnoreCase("bad");
        }

        String firstChunk = str.substring(0, 4);
        return (firstChunk.toLowerCase().contains("bad"));



    }
}
