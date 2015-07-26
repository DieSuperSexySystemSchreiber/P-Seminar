package GUI;

import java.util.ArrayList;
public class ZAHL extends TERMELEMENT
{
    private int number;
    private final int NAN=Integer.MAX_VALUE;

    public ZAHL(int i)
    {
        number=i;

    }

    public ZAHL()
    {
        number=NAN;
    }

    public void präfix()
    {
    }

    public ArrayList collect(ArrayList dest) {
        if( number < 0 ) {
            dest.add("(");
            dest.add(number);
            dest.add(")");
        }
        else {
            dest.add(number);
        }
        
        return dest;
    }

    public int gibHöhe() {
        return -1;
    }

    //public TERMELEMENT sortiertEinfügen(char e) 
    //{
    //   DATENKNOTEN dk=new DATENKNOTEN(e);
    //    
    //    dk.setzeLinkerNaechster(this);
    ///    dk.setzeRechterNaechster(new ZAHL());
    //    
    //   return dk;
    // }

    public int gibAnzahl() {
        return 0;
    }

    public void setzeLinkerNaechster(TERMELEMENT k) {
    }

    public void setzeRechterNaechster(TERMELEMENT k) {
    }

    public boolean isAVL()
    {
        return true;
    }

    public String infix()
    {
        if ( number <0 ) {
            return "("+number+")";
        }
        else
        {
            return ""+number;
        }
    }

    public  void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg){};

    public  void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg) {};

}
