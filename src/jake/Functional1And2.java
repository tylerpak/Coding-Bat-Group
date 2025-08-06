package jake;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1And2 {
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


    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(integer -> !(integer >= 13 && integer <= 19)).collect(Collectors.toList());
    }

    public static List<String> noZ(List<String> strings) {
        strings.removeIf(string -> string.contains("z"));
        return strings;
    }


    public static List<String> noLong(List<String> strings) {
        strings.removeIf(string -> string.length() >= 4);

        return strings;
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(string -> string.length() == 3 || string.length() == 4);

        return strings;
    }

    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(string -> string + "y");

        strings.removeIf(string -> string.contains("yy"));

        return strings;
    }

    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(num -> num * 2);

        nums.removeIf(num -> num % 10 == 2);

        return nums;
    }

    public static List<Integer> square56(List<Integer> nums) {

        nums.replaceAll(num -> (num*num) + 10);
        nums.removeIf(num -> num % 10 == 5 || num % 10 == 6);

        return nums;
    }

    public static List<Integer> no9 (List<Integer> nums) {
       nums.removeIf(n -> n % 10 == 9);

       return nums;
    }

    public List<String> noX(List<String> strings) {
        strings.replaceAll(str -> str.replaceAll("x", ""));
        return strings;
    }

    public List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(num -> num % 10);
        return nums;
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(str -> str + str + str);
        return strings;
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(string -> "y" + string + "y");
        return strings;
    }



}

