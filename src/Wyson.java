public class Wyson {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
    }

    //Warmup-1
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        } else if (weekday && vacation) {
            return true;
        } else {
            return false;
        }
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile){
            return true;
        } else {
            return false;
        }
    }
    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }
    public int diff21(int n) {
        int absoluteDifference = Math.abs(n - 21);
        if (n > 21) {
            return absoluteDifference * 2;
        }
        return absoluteDifference;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour > 20) {
            return true;
        } else if (talking && hour < 7){
            return true;
        } else {
            return false;
        }
    }
    public boolean makes10(int a, int b) {
        if ( a == 10 ) {
            return true;
        } else if (b == 10) {
            return true;
        } else if ((a + b) == 10) {
            return true;
        } else
            return false;
    }
    public boolean nearHundred(int n) {
        int x = Math.abs(100 - n);
        int y = Math.abs(200 - n);
        if (x <= 10 || y <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else return "not " + str;
    }

    public static String missingChar(String str, int n) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                output = output+str.charAt(i);
            }
        } return output;
    }

    public String reverseStr(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
                output = output+str.charAt(i);
        } return output;
    }

    public String frontBack(String str) {
        String lastLetter = "";
        String firstLetter = "";
        String middleLetters = "";

        if (str.length() <= 1) {
            return str;
        }

        lastLetter +=str.charAt(0);
        firstLetter += str.charAt(str.length()-1);
        middleLetters += str.substring(1,str.length()-1);


        return firstLetter + middleLetters + lastLetter;
    }

    public String front3(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }

        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }

    public String backAround(String str) {
        String lastChar = String.valueOf(str.charAt(str.length() - 1));
        return lastChar + str + lastChar;
    }

    public boolean or35(int n) {
        if ((n % 5) == 0) {
            return true;
        } else if ((n % 3) == 0) {
            return true;
        } else return false;
    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String last2Char = str.substring(0,2);
            return last2Char + str + last2Char;
        }
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100) && (temp2 < 0)) {
            return true;
        } else if ((temp1 < 0) && (temp2 > 100)) {
            return true;
        } else return false;
        /* if ((temp1 > 100) && (temp2 < 0)) {
            return true;
        } else return (temp1 < 0) && (temp2 > 100);
         */
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        } else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        } else if (str.substring(1, 4).equals("del")) {
            return str.replace("del", "");
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        } else return (str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.startsWith("oz")) {
            return "oz";
        } else if (str.startsWith("o")) {
            return "o";
        } else if (str.substring(1,2).equals("z")) {
            return "z";
        } else {
            return "";
        }
    }

    public int intMax(int a, int b, int c) {
        int[] array = {a, b, c};
        int maxNum = array[0];
        for (int num : array) {
            if (maxNum < num) {
                maxNum = num;
            }
        } return maxNum;
    }

    public int close10(int a, int b) {
        int closeA = Math.abs(a - 10);
        int closeB = Math.abs(b - 10);

        if (closeA > closeB) {
            return b;
        } else if (closeB > closeA) {
            return a;
        } else return 0;
    }

    public boolean in3050(int a, int b) {
        boolean b1 = (a >= 30) && (a <= 40) && (b >= 30) && (b <= 40);
        boolean b2 = (a >= 40) && (a <= 50) && (b >= 40) && (b <= 50);

        return b1 || b2;
    }

    public int max1020(int a, int b) {
        boolean b1 = (a >= 10) && (a <= 20) && (b >= 10) && (b <= 20);
        boolean b2 = (a >= 10) && (a <= 20);
        boolean b3 = (b >= 10) && (b <= 20);

        if (b1 && a > b) {
            return a;
        } else if (b1 && a < b) {
            return b;
        } else if (b2) {
            return a;
        } else if (b3) {
            return b;
        } else return 0;
    }

    public boolean stringE(String str) {
        char itIsE = 'e';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == itIsE) {
                count++;
            }
        }
        if (str.isEmpty()) {
            return false;
        } else if (count > 3) {
            return false;
        } else if (str.contains("e")) {
            return true;
        } else return false;
    }

    public boolean lastDigit(int a, int b) {
        int modA = a % 10;
        int modB = b % 10;

        return (modA == modB);
    }

    public String endUp(String str) {
        int beginIndex = str.length() - 3;

        if (str.length() < 3) {
            return str.toUpperCase();
        } else return str.substring(0, beginIndex) + str.substring(beginIndex).toUpperCase();
    }

    public String everyNth(String str, int n) {
        String output = "";

        for (int i = 0; i < str.length(); i += n) {
            output = output+str.charAt(i);
        }
        return output;
    }


    // Strings-1
    public String helloName(String name) {
        return "Hello " + name +"!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String extraEnd(String str) {
        String copyEnd = str.substring(str.length()-2);

        if (str.length() < 2) {
            return null;
        } else return copyEnd + copyEnd + copyEnd;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else return str.substring(0,2);
    }

    public String firstHalf(String str) {
        int half = str.length() % 2;
        int halfLength = str.length() / 2;

        if (half == 0) {
            return str.substring(0, halfLength);
        } else return null;
    }

    public String withoutEnd(String str) {
        int lastChar = str.length() - 1;

        if (str.length() < 2) {
            return str;
        } else return str.substring(1,lastChar);
    }

    public String comboString(String a, String b) {
        int firstStr = a.length();
        int secondStr = b.length();

        if (firstStr < secondStr) {
            return a + b + a;
        } else return b + a + b;
    }

    public String nonStart(String a, String b) {
        String newA = a.substring(1);
        String newB = b.substring(1);
        return newA + newB;
    }

    public String left2(String str) {
        String firstTwo = str.substring(0,2);
        String restStr = str.substring(2);

        if (str.length() < 2) {
            return str;
        } else return restStr + firstTwo;
    }

    public String right2(String str) {
        int lastTwo = str.length() - 2;
        return str.substring(lastTwo) + str.substring(0, lastTwo);
    }

    public String theEnd(String str, boolean front) {
        int lastChar = str.length() - 1;

        if (!front) {
            return str.substring(lastChar);
        } else return str.substring(0,1);
    }

    public String withouEnd2(String str) {
        int lastChar = str.length() - 1 ;

        if (str.isEmpty()) {
            return str;
        } else if (str.length() < 2) {
            return "";
        } return str.substring(1, lastChar);
    }

    public String middleTwo(String str) {
        int middle = str.length() / 2;
        int middle1 = middle - 1;
        int middle2 = middle + 1;

        if (str.length() < 2) {
            return null;
        } else return str.substring(middle1, middle2);
    }

    public boolean endsLy(String str) {
        int lastTwo = str.length() - 2;

        if (str.length() < 2) {
            return false;
        } else return str.substring(lastTwo).contains("ly");
    }

    public String nTwice(String str, int n) {
        int lastN = str.length() - n;

        if (n == 0) {
            return "";
        } else return str.substring(0, n) + str.substring(lastN);
    }


}

