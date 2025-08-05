
    public static String delDel(String string) {

        if (string.isBlank()) {
            return string;
        }

        String firstChar = string.substring(0,1);
        String rest = string.substring(1);

        if (rest.startsWith("del")) {
            rest = rest.substring(3);
            return firstChar + rest;
        } else {
            return string;
        }

    }

    public static String endUp(String string) {
        if (string.length() <= 3) {
            return string.toUpperCase();
        }

        String firstPart = string.substring(0, string.length() - 3);
        String lastThree = string.substring(string.length() - 3);

        return firstPart + lastThree.toUpperCase();

    }


