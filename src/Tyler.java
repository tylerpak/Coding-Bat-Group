//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tyler {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));

    }

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
        String is = "";
        return is;
    }


}