package src.GUI;

import java.util.ArrayList;
public abstract class TERMELEMENT
{
    public abstract void pr�fix();

    public abstract int gibH�he();
    //public abstract TERMELEMENT sortiertEinfügen(OPERATOR e);

    public abstract int gibAnzahl();

    public abstract void setzeLinkerNaechster(TERMELEMENT newElement);

    public abstract void setzeRechterNaechster(TERMELEMENT newElement);

    public abstract boolean isAVL();

    public abstract String infix();

    public abstract void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits,  boolean oPositive,int erg, int decimalPlaces);

    public abstract void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits,  boolean oPositive,int erg, int decimalPlaces);
    
    public abstract ArrayList collect( ArrayList dest );
}
