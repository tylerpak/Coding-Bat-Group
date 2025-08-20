import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tyler {
    public static void main(String[] args) {
        System.out.println(groupSumClump(0,new int[]{2, 4, 4, 8}, 14));

    }

    // These are String -3 Solutions
    public static boolean equalIsNot(String str) {
        String is = "is";
        String not = "not";
        int isCount = 0;
        int notCount = 0;

        for(int i = 0; i <= str.length() - is.length(); i++) {
            if(str.substring(i, i+is.length()).equals("is")) {
                isCount ++;
            }
        }

        for(int i = 0; i <= str.length() - not.length(); i++) {
            String sub = str.substring(i, i + not.length());
            if(sub.equals("not")) {
                notCount++;
            }
        }
        if(isCount == notCount) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String withoutString(String base, String remove) {
        int rEnd = remove.length() - 1;
        boolean flag = true;
        String output = "";
        for(int i =0; i < base.length(); i++) {
            flag = true;
            if((i + remove.length()) <= base.length()) {
                if(Character.toLowerCase(base.charAt(i)) == Character.toLowerCase(remove.charAt(0))) {
                    int rCounter = 0;
                    for(int j = i; j <= (rEnd + i); j++) {
                        if(Character.toLowerCase(base.charAt(j)) == Character.toLowerCase(remove.charAt(rCounter))) {
                            rCounter++;
                        }
                        else{
                            j = rEnd + i;
                            flag = false;
                        }
                    }
                    if(flag) {
                        i = i+rEnd;
                    }
                }
                else {
                    flag = false;
                }
            }
            else if (i + remove.length() >= base.length()) {
                flag = false;
            }
            if(flag == false) {
                output = output + base.charAt(i);
            }
        }
        return output;
    }


    public static int countTriple(String str) {
        int counter = 0;
        int index = 0;
        while(index <= (str.length() - 3)) {
            if(((str.charAt(index)) == (str.charAt(index+1)) && (str.charAt(index+1) == str.charAt(index+2)))) {
                counter++;
            }
            index++;
        }
        return counter;
    }

    public static String mirrorEnds(String string) {
        String mirror = "";
        String result = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            mirror = mirror + string.charAt(i);
        }
        for(int i = 0; i <= string.length(); i ++) {
            if(string.substring(0,i).equals(mirror.substring(0,i))) {
                result = string.substring(0, i);
            }

        }
        return result;
    }

    public static String noReplace(String str) {
        String output = "";
        for(int i = 0 ; i < str.length(); i++) {
            if(i == 0) {
                if(str.substring(i, i+ 2).equals("is")) {
                    if(str.length() > 2) {
                        if (!Character.isAlphabetic(str.charAt(2))) {
                            output = output + "is not";
                            i = i + 1;
                        }
                        else {
                            output = output + str.charAt(i);
                        }
                    }
                    else {
                        return "is not";
                    }
                }
                else {
                    output = output + str.charAt(i);
                }
            }
            else if(i < str.length()-2) {
                if(str.substring(i, i+2).equals("is")) {
                    if((!Character.isAlphabetic(str.charAt(i-1))) && (!Character.isAlphabetic(str.charAt(i+2)))) {
                        output = output + "is not";
                        i = i+1;
                    }
                    else {
                        output = output + str.charAt(i);
                    }
                }
                else {
                    output = output + str.charAt(i);
                }
            }
            else {
                if(str.substring(i).equals("is")) {
                    if(!Character.isAlphabetic(str.charAt(i - 1))) {
                        output = output + "is not";
                        i = str.length();
                    }
                    else {
                        output = output + str.charAt(i);
                    }
                }
                else {
                    output = output + str.charAt(i);
                }
            }
        }
        return output;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    public static int countYZ(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++ ) {
            if((Character.toLowerCase(str.charAt(i)) == 'y') || (Character.toLowerCase(str.charAt(i))  == 'z')) {
                if(i == str.length()-1) {
                    sum++;
                }
                else {
                    if(!Character.isLetter(str.charAt(i+1))){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public static boolean gHappy(String str) {
        if(str.length() ==1) {
            if(Character.toLowerCase(str.charAt(0)) == 'g') {
                return false;
            }
            else {
                return true;
            }
        }
        if(str.length() == 0) {
            return true;
        }
        for(int i =0; i < str.length(); i++) {
            if(Character.toLowerCase(str.charAt(i)) == 'g') {
                if(i == 0) {
                    if((Character.toLowerCase(str.charAt(i+1))) != 'g') {
                        return false;
                    }
                }
                else if(i == str.length() - 1) {
                    if((Character.toLowerCase(str.charAt(i-1))) != 'g') {
                        return false;
                    }
                }
                else {
                    if ((Character.toLowerCase(str.charAt(i - 1)) != 'g') && (Character.toLowerCase(str.charAt(i + 1)) != 'g')) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int maxBlock (String str) {
        int output = 0;
        int counter = 1;
        char prev = ' ';
        for(int i = 0; i < str.length(); i++) {
            if (i == 0) {
                prev = str.charAt(i);
            }
            else {
                if(str.charAt(i) != prev) {
                    counter = 1;
                    prev = str.charAt(i);
                }
                else {
                    counter++;
                    prev = str.charAt(i);
                }
            }
            if(counter > output) {
                output = counter;
            }
        }
        return output;
    }


    public static String sameEnds(String string) {
        String beg;
        String end;
        if(string.length()%2 == 0 ) {
            beg = string.substring(0, string.length()/2);
            end = string.substring(string.length()/2);
        }
        else {
            beg = string.substring(0, string.length()/2);
            end = string.substring(string.length()/2 + 1);
        }
        String output = "";
        for(int i =0; i < beg.length(); i++) {
            if(end.contains(beg.substring(0, i+1))) {
                output = beg.substring(0, i+1);
            }
        }
        return output;
    }

    public static int sumNumbers(String str) {
        int output = 0;
        for(int i =0; i < str.length(); i++) {
            String sum = "";
            if(Character.isDigit(str.charAt(i))) {
                    for (int j = i; j < str.length(); j++) {
                        if (Character.isDigit(str.charAt(j))) {
                            sum += str.charAt(j);
                        } else {
                            break;
                        }
                        i++;
                    }
                }
            if(sum.length()>0) {
                output += Integer.parseInt(sum);
            }
        }
        return output;
    }


    // These are Functional-1 problems

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

    // Functional 2 problems

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

    //Map-1 Problems

    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            if (!map.get("a").equals("")) {
                map.put("b", map.get("a"));
                map.put("a", "");
            }
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream") && !map.get("ice cream").equals("")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach") && !map.get("spinach").equals("")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato") && !map.get("potato").isEmpty()) {
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad") && !map.get("salad").isEmpty()) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }


    public static Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(!(map.containsKey("a") && map.containsKey("b"))) {
            if(map.containsKey("a")) {
                map.put("b", map.get("a"));
            }
            else if(map.containsKey("b")){
                map.put("a", map.get("b"));
            }
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            }
            else if (map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));
            }
            else if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    //recursion-1 problems

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


    //Recursion-2 Problems

    public static boolean groupSum(int start, int[] nums, int target) {
        if(target == 0) {
            return true;
        }
        else if(start >= nums.length) {
            return false;
        }
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if(nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(target == 0) {
            return true;
        }
        else if(start >= nums.length) {
            return false;
        }
        return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if(nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if((start > 0) && (nums[start] == 1)) {
            return groupSum5(start + 1, nums, target);
        }
        return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        int count = 1;
        while(start < nums.length - 1) {
            if(nums[start+1] == nums[start]) {
                count++;
            }
            else {
                break;
            }
            start++;
        }
        if(count > 1) {
            return groupSumClump(start + 1, nums, target) || groupSumClump(start + 1, nums, target - (nums[start-1] * count));
        }
        return groupSumClump(start + 1, nums, target - nums[start]) || groupSumClump(start + 1, nums, target);
    }



}