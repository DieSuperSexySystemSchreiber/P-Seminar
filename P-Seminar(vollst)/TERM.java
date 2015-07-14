import java.util.Arrays;
import java.util.Random;
import java.math.*;
/**
 * TERM class that works as the main class for every arithmetic expression. 
 * 
 * @author Lukas Rieger
 * @version v1.0.0 Beta
 */
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

    /**
     * TERM Constructor
     *
     * @param aoAddition set to true if additions should be part of the expression
     * @param aoSubstraction set to true if substractions should be part of the expression
     * @param aoMultiplication set to true if multiplications should be part of the expression
     * @param aoDivision set to true if divisions should be part of the expression
     * @param bracketDepth self explaining - sets the max depth of brackts in the expression
     * @param substitutions count of substitution cycles a number in the expression has to go through
     * @param digits max dagit length of any number in the expression
     * @param oPositive set to true if only positive numbers should be allowed   --CURRENTLY DISABLED--
     * @param wFraction set to true if the expression should contain fractions --CURRENTLY DISABLED--
     */
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

    /**
     * method wurzelSetzen
     *
     * @param newKnoten root of the binary tree
     */
    public void wurzelSetzen(DATENKNOTEN newKnoten)
    {
        wurzel = newKnoten;
    }

    /**
     * method präfix
     *
     */
    public void präfix()
    {
        wurzel.präfix();
    }

    /**
     * method getRechenzeichen
     *
     * @param plus addition allowed
     * @param min substraction allowed
     * @param mul multiplication allowed
     * @param div division allowed
     * @return the randomly selcted operator
     */
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

    /**
     * method gibHöhe
     *
     * @return height of the binary tree
     */
    public int gibHöhe()
    {

        return wurzel.gibHöhe();
    }

    /**
     * Methode splitSubs
     *
     * @param sub currently left substitutions
     * @return array of substitutions for leftNext and rightNext
     */
    public int[] splitSubs(int sub) {
        int[] nums=new int[2];
        nums[0] = (int) sub - getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    /**
     * method createSub
     *
    @param aoAddition set to true if additions should be part of the expression
     * @param aoSubstraction set to true if substractions should be part of the expression
     * @param aoMultiplication set to true if multiplications should be part of the expression
     * @param aoDivision set to true if divisions should be part of the expression
     * @param bracketDepth self explaining - sets the max depth of brackts in the expression
     * @param substitutions count of substitution cycles a number in the expression has to go through
     * @param digits max dagit length of any number in the expression
     * @param oPositive set to true if only positive numbers should be allowed   --CURRENTLY DISABLED/IGNORED--
     * @param erg the result of the expression
     */
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

    /**
     * method getRand
     *
     * @param min minium random number
     * @param max maximum random number
     * @return random number
     */
    private int getRand(int min, int max) {
        Random rand = new Random();
        int toReturn= (int)Math.sqrt ( Math.pow ( Math.sqrt( Math.pow( Math.abs(rand.nextInt((max - min) + 1 )+ min) ,2) ) ,2));

        return  toReturn;
    }

    /**
     * method gibAnzahl
     *
     * @return returns number of elements in the binary tree
     */
    public int gibAnzahl() 
    {
        return wurzel.gibAnzahl();
    }

    /**
     * method isAVL
     *
     * @return boolean returns wether the binary tree is AVL conform or not
     */
    public boolean isAVL()
    {
        return wurzel.isAVL();

    }

    /**
     * method infix
     * method to traverse the tree and print out the expression
     */
    public void infix()
    {
        System.out.println(result+"="+wurzel.infix());
    }

    /**
     * method ergebnisErzeugen
     *
     * @param stellenZahl Ein Parameter
     * @param nurPositiv Ein Parameter
     * @param mitBruechen Ein Parameter
     * @return Der Rückgabewert
     */
    public int ergebnisErzeugen(int stellenZahl,boolean nurPositiv,boolean mitBruechen) {
        return getRand(1*(int)Math.pow(10,(stellenZahl-1)),9*(int)Math.pow(10,(stellenZahl-1)));
    }

}