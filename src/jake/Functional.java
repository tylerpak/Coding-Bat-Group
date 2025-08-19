package jake;

import java.util.List;
import java.util.stream.Collectors;

public class Functional {
    // Given a list of integers, return a list where each integer is multiplied by 2.
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map( (integer -> integer * 2)).collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(integer -> integer * integer).collect(Collectors.toList());

    }

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(string -> string = string + "*").collect(Collectors.toList());

    }

    public static List<Integer> math1(List<Integer> nums) {

        return nums.stream().map(number -> (number + 1) * 10).collect(Collectors.toList());
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(integer -> integer >= 0).collect(Collectors.toList());
    }
}

