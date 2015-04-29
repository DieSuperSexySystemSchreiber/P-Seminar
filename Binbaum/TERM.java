
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
    char operator;

    public TERM(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication, boolean aoDivision,int bracketDepth, int substitutions, int digits, boolean oPositive, boolean wFraction)
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
        this.result=ergebnisErzeugen(digits,oPositive,wFraction);

        if(substitutions==0) {
        }
        else {

        }
    }

    public void wurzelSetzten(DATENKNOTEN newKnoten)
    {
        wurzel = newKnoten;
    }

    public void präfix()
    {
        wurzel.präfix();
    }

    public char getRechenzeichen(boolean plus,boolean min,boolean mul,boolean div) {
        boolean ok=false;
        String[] allRz={"+", "-", "*", "/"};
        String rz="";
        while( !ok) {
            int b=getRand(0,3);
            switch(b) {
                case 0: if( plus ) { rz=allRz[b]; ok=true; }
                case 1: if( min ) {rz=allRz[b]; ok=true;   }
                case 2: if( mul ) {rz=allRz[b]; ok=true;   }
                case 3: if( div ) {rz=allRz[b]; ok=true;   }
            }
        }
        char toReturn=rz.charAt(0);
        operator=tReturn;
        return toReturn;
    }

    public int gibHöhe()
    {

        return wurzel.gibHöhe();
    }

    public int[] splitSubs(int sub) {
        int[] nums=new int[1];
        nums[0] = (int) sub - getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    /*
     * 
    public void sortiertEinfügen(OPERATOR e) {

    wurzel.sortiertEinfügen(e);
    }
     */

    public void createSub(double erg,String operator,int digits,boolean oPos,TERMELEMENT root) {
        switch (operator) {
            case "+":
            int number1 = (int) erg - getRand(0, (int) erg);
            int number2 = (int) erg - number1;

            int[] newSubs=splitSubs(this.substitutions-1);
            
            this.wurzelSetzen(new DATENKNOTEN("+".charAt(0)));
            
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[1],digits,oPositive,number1)
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth-1,newSubs[0],digits,oPositive.number2)
            
            wurzel.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

            wurzel.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

            //return number1 + "+" + number2;

            case "-":

            int number3 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
            int number4 = (int) (number3 - erg);

            int[] newSubs=splitSubs(this.substitutions-1);

            wurzel.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

            wurzel.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

            //return number3 + "-" + number4;
            case "*":
            int number5 = (int) erg / getRand(1, (int) erg);
            int number6 = (int) erg / number5;

            int[] newSubs=splitSubs(this.substitutions-1);

            wurzel.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

            wurzel.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

            //return number5 + "*" + number6;
            case "/":
            int number7 = (int) erg * getRand(1, (int) erg);
            int number8 = (int) erg / number7;

            int[] newSubs=splitSubs(this.substitutions-1);

            wurzel.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

            wurzel.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

            //return number7 + "/" + number8;
        }

    }

    private int getRand(int min, int max) {
        Random rand = new Random();

        return  rand.nextInt((max - min) + 1) + min;
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

    public int ergebnisErzeugen(int stellenZahl,boolean nurPositiv,boolean mitBruechen) {
        return getRand(1*10^(stellenZahl-1),9*10^(stellenZahl-1));
    }

}
