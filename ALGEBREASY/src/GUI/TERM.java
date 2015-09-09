package GUI;


import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.math.*;
import java.text.DecimalFormat;
import java.math.MathContext;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.*;

import org.scilab.forge.jlatexmath.TeXConstants; 
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
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
    int result;
    char operator;
    int decimalPlaces;

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
    public TERM(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication, boolean aoDivision,int bracketDepth, int substitutions, int digits, int decimalPlaces, boolean oPositive)
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
        this.decimalPlaces=decimalPlaces;
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
            Random generator = new Random();
            int b = generator.nextInt(4);

            switch(b) {
                case 0: if( plus==true ) { rz=allRz[b]; ok=true; } break;
                case 1: if( min==true ) {rz=allRz[b]; ok=true;   } break;
                case 2: if( mul==true ) {rz=allRz[b]; ok=true;   } break;
                case 3: if( div==true ) {rz=allRz[b]; ok=true;   } break;
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
        nums[0] = (int) sub - (int)getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    private int getDivident(int number, boolean oPos)
    {
        if( number==0 ) {
            return 1;
        }
        System.out.println(number+"+," +oPos);
        int[] dividents= new int[Math.abs(number)*2];
        int current=0;
        if ( oPos) {
            for( int i=1;i<=number;i++) {
                if(number%i==0) {
                    dividents[current]=i;
                    current++;
                }
            }
        }
        else {
            for( int i=1;i<=number;i++) {
                if(number%i==0) {
                    dividents[current]=i;
                    dividents[current+1]=-i;
                    current=current+2;
                }
            }
        }
        System.out.println(current);
        return dividents[getRand(0,current)];
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

    public void createSub(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg) {
        int[] newSubs=splitSubs(this.substitutions-1);
        String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);

        switch (operator) {
            case "+":

            int plus1=0;
            int plus2=0;
            if (oPositive==true){
                plus1=(int) getRand((int) 0, (int) erg);    
                System.out.println(plus1);
            }
            else {
                if( erg>=0) {
                    plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1))+(int) erg, (int) Math.pow(10,digits )-1);

                }
                else if(erg < 0) {
                    plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1)), (int) (Math.pow(10,digits )-1)+(int) erg);

                }
            }
            plus2 =(int) erg-plus1;
            //System.out.println(plus1+" , "+plus2);
            this.wurzelSetzen(new DATENKNOTEN("+"));
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,plus1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,plus2);

            //return number1 + "+" + number2;
            break;
            case "-":
            int min1=0;
            int min2=0;
            if (oPositive==true){
                min1=(int) getRand((int) erg, (int) Math.pow(10,digits)-1);    
            }
            else{
                if(erg>=0) {
                    min1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1))+(int) erg, (int) Math.pow(10,digits )-1);
                }
                else if(erg < 0 ){
                    min1=(int) getRand((int) (-1*(Math.pow(10,digits)-1)),(int) (Math.pow(10,digits)-1)+(int) erg);
                }

            }
            min2 =(int)  min1 - (int)erg;
            //int[] newSubs=splitSubs(this.substitutions-1);
            System.out.println(newSubs[1]+"subs1");
            System.out.println(newSubs[0]+"subs0");
            System.out.println(min1+" , "+min2);
            this.wurzelSetzen(new DATENKNOTEN("-"));
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,min1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,min2);

            //return number3 + "-" + number4;
            break;
            case "*":

            int divident= getDivident(erg,oPositive);
            int mul1 = divident;
            if(mul1==0) {
                mul1=1;
            }
            int mul2 =(int) erg / mul1;

            //int[] newSubs=splitSubs(this.substitutions-1);
            this.wurzelSetzen(new DATENKNOTEN("*"));
            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,mul1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,mul2);

            //return number5 + "*" + number6;
            break;
            case "/":
            double div1=1;
            double div2=1;

            if(erg<1) { 
                div1=1;
                div2=1;
            }
            else {

                boolean notNull=true;
                while ( !notNull) {

                    div2 =(int) getRand(((int)(-1*(Math.pow(10,digits)-1)))/(int)erg,((int)(Math.pow(10,digits)-1)/erg));
                    if( div2==0) {
                        notNull=true;
                    }
                    else {
                        notNull=false;
                    }
                }
                div1 = erg * div2;
            }

            //int[] newSubs=splitSubs(this.substitutions-1);

            this.wurzelSetzen(new DATENKNOTEN("/"));

            this.wurzel.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,(int)div1);
            this.wurzel.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,(int)div2);
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
        System.out.println(min+" , "+max);
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;

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
    public String infix()
    {
        if( this.decimalPlaces!=0) {
            ArrayList term= new ArrayList();
            String fTerm= "";
            term=wurzel.collect(term);
            for(Object o:term) {
                System.out.println(o.toString());
                if(o instanceof Integer ) {

                    int inst=(int) o;
                    double formatted;
                    formatted= (inst/Math.pow(10,this.decimalPlaces)) ;

                    fTerm=fTerm+Double.toString(formatted);
                }
                else {
                    fTerm=fTerm+o.toString();
                }

                //return "T";
            }
            double re=  this.result/ Math.pow(10,this.decimalPlaces);
            //System.out.println(re+" = "+fTerm);
            //System.out.println(wurzel.infix());
            return fTerm;
        }
        else {
            System.out.println(wurzel.infix());
            return  wurzel.infix();
        }
        //System.out.println(result+"="+expression);
        
    }

    public void parseExpressionToLatex(String exp) {
        exp=exp.replace("/"," \\div ");
        exp=exp.replace("*"," \\cdot ");
        //exp=exp.replace("(","\\big (");
        //exp=exp.replace(")",") \\big )");
        String[] sizes= new String[3];

        sizes[1]="/big";
        TeXFormula formula = new TeXFormula(exp);
        // Note: Old interface for creating icons:
        //TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);
        // Note: New interface using builder pattern (inner class):
        TeXIcon icon = formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_DISPLAY).setSize(20).build();

        icon.setInsets(new Insets(5, 5, 5, 5));

        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0,0,icon.getIconWidth(),icon.getIconHeight());
        JLabel jl = new JLabel(new ImageIcon(image));

        jl.setForeground(new Color(0, 0, 0));
        icon.paintIcon(jl, g2, 0, 0);
        JFrame frm= new JFrame("latex Test");

        frm.setSize(800,800);

        frm.add(jl);
        frm.setVisible(true);

    }

    public void test() {
        parseExpressionToLatex(infix());
    }

    public double getSolution() {
        
        double fErg=this.result/Math.pow(10,this.decimalPlaces);
        return fErg;
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
        if( nurPositiv ) {
            return getRand((int) 0,(int) (Math.pow(10,stellenZahl)-1));
        }
        else {

            return getRand((int)(-1*(Math.pow(10,stellenZahl)-1)),(int)Math.pow(10,stellenZahl)-1);
        }
    }

}
