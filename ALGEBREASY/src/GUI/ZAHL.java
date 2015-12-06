/*
Copyright (C) 2015  Rieger Lukas, Steinberg Kilian

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
    
package src.GUI;

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

    //public TERMELEMENT sortiertEinfÃƒÂ¼gen(char e) 
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

    public  void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg, int decimalPlaces){};

    public  void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg, int decimalPlaces) {};

}
