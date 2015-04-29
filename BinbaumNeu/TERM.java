
import java.util.Arrays;
import java.util.Random;
import java.math.*;

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

        createSub(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth,substitutions,digits,oPositive,this.result);
    }

    public void wurzelSetzen(DATENKNOTEN newKnoten)
    {
        wurzel = newKnoten;
    }

    public void präfix()
    {
        wurzel.präfix();
    }

    public String getRechenzeichen(boolean plus,boolean min,boolean mul,boolean div) {
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
        
        
        return rz;
    }

    public int gibHöhe()
    {

        return wurzel.gibHöhe();
    }

    public int[] splitSubs(int sub) {
        int[] nums=new int[2];
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

    public void createSub(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,double erg) {
        int[] newSubs=splitSubs(this.substitutions-1);
        String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);
        switch (operator) {
            case "+":
            int plus1 = (int) erg - getRand(0, (int) erg);
            int plus2 = (int) erg - plus1;

            
            
            this.wurzelSetzen(new DATENKNOTEN("+"));
            
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,plus1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,plus2);
            
            

            

            //return number1 + "+" + number2;
            break;
            case "-":

            int min1 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
            int min2 = (int) (min1 - erg);

            //int[] newSubs=splitSubs(this.substitutions-1);

            this.wurzelSetzen(new DATENKNOTEN("-"));
            
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,min1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,min2);

            //return number3 + "-" + number4;
            break;
            case "*":
            int mul1 = (int) erg / getRand(1, (int) erg);
            int mul2 = (int) erg / mul1;

            //int[] newSubs=splitSubs(this.substitutions-1);

            this.wurzelSetzen(new DATENKNOTEN("*"));
            
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,mul1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,mul2);

            //return number5 + "*" + number6;
            break;
            case "/":
            int div1 = (int) erg * getRand(1, (int) erg);
            int div2 = (int) erg / div1;

            //int[] newSubs=splitSubs(this.substitutions-1);

            this.wurzelSetzen(new DATENKNOTEN("/"));
            
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,div1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,div2);
            break;
            //return number7 + "/" + number8;
        }

    }

    private int getRand(int min, int max) {
        Random rand = new Random();
        int toReturn= (int)Math.sqrt ( Math.pow ( Math.sqrt( Math.pow( Math.abs(rand.nextInt((max - min) + 1 )+ min) ,2) ) ,2));
       
        return  toReturn;
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
        System.out.println(result+"="+wurzel.infix());
    }

    public int ergebnisErzeugen(int stellenZahl,boolean nurPositiv,boolean mitBruechen) {
        return getRand(1*10^(stellenZahl-1),9*10^(stellenZahl-1));
    }

}
