public class FooBarQix {
    public String print(int i) throws Exception {
        String result = "";

        if (modulo(i, 3)) {
            result += "Foo";
        }

        if (modulo(i, 5)) {
            result += "Bar";
        }

        if (modulo(i, 7)) {
            result += "Qix";
        }


        return verif(i, result) ? String.valueOf(i).replace('0', '*') : result + concatContains(String.valueOf(i));
    }

    private Boolean verif(int i, String result) {
        return result.length() == 0 && !String.valueOf(i).contains("3") && !String.valueOf(i).contains("5") && !String.valueOf(i).contains("7");
    }

    private Boolean modulo(int i, int div) throws Exception {
        if (div != 0) {
            return i % div == 0;
        } else {
            throw new Exception("Non Divisible par 0 !");
        }
    }

    private String concatContains(String chaine) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if (c == '3')
                result.append("Foo");
            else if (c == '5') {
                result.append("Bar");
            } else if (c == '7') {
                result.append("Qix");
            }
            if (c == '0') {
                result.append("*");
            }
        }
        return result.toString();
    }
}
