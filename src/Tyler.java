import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tyler {
    public static void main(String[] args) {
        System.out.println(sumNumbers("ab11ds33"));

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
            else {
                map.put("a", map.get("b"));
            }
        }
        return map;
    }



}