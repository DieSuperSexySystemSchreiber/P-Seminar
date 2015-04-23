
import java.util.Arrays;
import java.util.Random;


public class TERM
{
    TERMELEMENT wurzel;

    boolean aoAddition;
    boolean aoSubstraction;
    boolean aoMultiplication;
    boolean aoDivision;
    int bracketDepth;
    int substitutions;
    int digits;
    boolean oPositive;
    boolean wFraction;
    double result;

    public TERM(double result,boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication, boolean aoDivision,int bracketDepth, int substitutions, int digits, boolean oPositive, boolean wFraction)
    {
        this.aoAddition=aoAddition;
        this.aoSubstraction=aoSubstraction;
        this.aoMultiplication=aoMultiplication;
        this.aoDivision=aoDivision;
        this.bracketDepth=bracketDepth;
        this.substitutions=substitutions;
        this.digits=digits;
        this.oPositive=oPositive;
        this.wFraction=wFraction;
        this.result=result;

    }

    public void wurzelSetzten(DATENKNOTEN newKnoten)
    {
        wurzel = newKnoten;
    }

    public void präfix()
    {
        wurzel.präfix();
    }

    public void unterbäumeErstellen(int anzBäume) {

        wurzel.unterbäumeErstellen(anzBäume);

    }

    public int gibHöhe()
    {

        return wurzel.gibHöhe();
    }

    public void sortiertEinfügen(OPERATOR e) {

        wurzel.sortiertEinfügen(e);
    }

    public OPERATOR[] baumSortieren() {
        OPERATOR[] list=new OPERATOR[gibAnzahl()];
        list=wurzel.baumSortieren(0,list);
        return list;
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

    public int gibAnzahl() 
    {
        return wurzel.gibAnzahl();
    }

    public boolean isAVL()
    {
        return wurzel.isAVL();

    }

    public void infix()
    {
        System.out.println(wurzel.infix());
    }
}
