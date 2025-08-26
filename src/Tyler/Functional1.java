package Tyler;

import java.util.List;

public class Functional1 {
    public static void main(String[] args) {

    }
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        return nums;
    }

    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n*n);
        return nums;
    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> {String b = n; n = b + b + b; return n;});
        return strings;
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }

    public static List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replaceAll("x", ""));
        return strings;
    }
}
