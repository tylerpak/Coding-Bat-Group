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
        return "";
    }
}
