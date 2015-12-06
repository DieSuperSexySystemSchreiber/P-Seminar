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
    along with ALGEBREASY.  If not, see <http://www.gnu.org/licenses/>.
 */
package src.GUI;

import java.util.ArrayList;
public abstract class TERMELEMENT
{
    public abstract void präfix();

    public abstract int gibHöhe();
    //public abstract TERMELEMENT sortiertEinfÃƒÂ¼gen(OPERATOR e);

    public abstract int gibAnzahl();

    public abstract void setzeLinkerNaechster(TERMELEMENT newElement);

    public abstract void setzeRechterNaechster(TERMELEMENT newElement);

    public abstract boolean isAVL();

    public abstract String infix();

    public abstract void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits,  boolean oPositive,int erg, int decimalPlaces);

    public abstract void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits,  boolean oPositive,int erg, int decimalPlaces);
    
    public abstract ArrayList collect( ArrayList dest );
}
