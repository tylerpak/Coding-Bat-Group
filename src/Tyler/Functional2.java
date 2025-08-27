package Tyler;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {


    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n%10 == 9);
        return nums;
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> (n >= 13 && n <= 19));
        return nums;
    }

    public static List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4 );
        return strings;
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(n -> (n.length() == 4 || n.length() == 3));
        return strings;
    }

    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }

    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n*2)
                .filter(n -> n%10 != 2)
                .collect(Collectors.toList());
    }

    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n * n) + 10)
                .filter(n -> (n%10 != 5) && (n%10 != 6))
                .collect((Collectors.toList()));
    }
}
