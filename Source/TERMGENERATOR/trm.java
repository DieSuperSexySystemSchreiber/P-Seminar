import java.util.Arrays;
import java.util.Random;


/* Zahlenraum legt fest welche Zahlen im Term vorkommen. Mögliche Parameter dafür sind :

 *  --> "N"( natürliche Zahlen )
 *  --> "Z"( ganze Zahlen )
 *  --> "Q"( rationale Zahlen )
 *  --> "R"( reelle Zahlen )
 *
 *
 *  Klammertiefe:
 *
 *  1 = (2+3) --> 2+3
 *  2 = ((2+3)+3+2)
 *  3 = (2*(2+(2+2))
 *
 *
 *

 */
public class trm {

    String ergebnis;
    int klammertiefe;
    String zahlenraum;
    String[] rechenzeichen = new String[4];
    String expression;
    private String[] zahlenräume = {"N", "Z", "Q", "R"};
    private String[] operatoren = {"+", "-", "*", "/"};

    public trm(int klammertiefe, String[] operatoren, String zahlenraum, double Ergebnis) {

        this.klammertiefe = klammertiefe;
        this.zahlenraum = getRaum(zahlenraum);
        this.rechenzeichen = getMatchingZeichen(operatoren);
        //this.expression = genExpression();
        this.ergebnis = Double.toString(Ergebnis);

    }


    private String[] getMatchingZeichen(String[] nString) {
        String[] rZeichen = new String[4];
        for (int i = 0; i < operatoren.length; i++) {
            if (Arrays.asList(nString).contains(operatoren[i])) {
                rZeichen[i] = operatoren[i];
            }
        }
        return rZeichen;
    }

    private String getRaum(String raum) {
        if (Arrays.asList(zahlenräume).contains(raum)) {
            return raum;
        } else {
            return null;
        }
    }

    private String getOperator() {
        int min = 0;
        int max = rechenzeichen.length;

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return rechenzeichen[randomNum];
    }

    private int getRand(int min, int max) {
        Random rand = new Random();



        return  rand.nextInt((max - min) + 1) + min;
    }

    private String getStringForOperator(double erg, String operator) {
        switch (operator) {
            case "+":
                int number1 = (int) erg - getRand(0, (int) erg);
                int number2 = (int) erg - number1;

                return number1 + "+" + number2;

            case "-":

                int number3 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
                int number4 = (int) (number3 - erg);

                return number3 + "-" + number4;

            case "*":

                int number5 = (int) erg / getRand(1, (int) erg);
                int number6 = (int) erg / number5;

                return number5 + "*" + number6;

            case "/":

                int number7 = (int) erg * getRand(1, (int) erg);
                int number8 = (int) erg / number7;

                return number7 + "/" + number8;
        }
        return null;
    }






    /*private String genExpression() {
     *  String exp = "";
        switch (klammertiefe) {
            case 1:
                double anz = Math.random() * 10;
                double[] nums = new double[(int) anz];
                nums[0] = Double.valueOf(ergebnis) - Math.random() * Double.valueOf(ergebnis);

                for (int k = 1; k < (int) anz; k++) {
                    nums[k] = (Double.valueOf(ergebnis) - getLastNums(nums));
                }


        }
        return exp;
    }

     */


    private double getLastNums(double[] num) {
        double erg = 0;
        for (int l = 0; l < num.length; l++) {
            erg += num[l];
        }
        return erg;
    }

    public String getExpression() {


        return this.expression;
    }

}