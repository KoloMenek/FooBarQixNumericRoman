public class NumericRoman {
    public String print(int i) {
        String result="";

        result = getRoman("M", "","",i/1000) + getRoman("C", "D", "M", (i%1000)/100) + getRoman("X","L","C", (i%100)/10) + getRoman("I","V","X", i%10);

        return result;


    }
    private String getRoman(String firstSymbol, String midSymbol, String lastSymbol, int monChiffre){
        int max = monChiffre;
        String result = "";
        if(monChiffre>4 && monChiffre<9) {
            result += midSymbol;
            max -= 5;
        }
        else if (monChiffre == 4) {
            result += firstSymbol + midSymbol;
            max = 0;
        }
        else if(monChiffre == 9) {
            result += firstSymbol + lastSymbol;
            max = 0;
        }
        for(int j=0;j<max;j++){
            result+= firstSymbol;
        }
        return result;
    }


}
