/*
Copyright (C) <2015>  <name of author>

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

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.math.*;
import java.text.DecimalFormat;
import java.math.MathContext;

public class DATENKNOTEN extends TERMELEMENT
{
    public TERMELEMENT linkerNaechster;
    public TERMELEMENT rechterNaechster;

    String inhalt;
    public DATENKNOTEN(String inhalt)
    {
        this.inhalt = inhalt;
        linkerNaechster = new ZAHL();
        rechterNaechster = new ZAHL();
    }

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

    public void setzeLinkerNaechster(TERMELEMENT newElement)
    {
        linkerNaechster = newElement;
    }

    public void setzeRechterNaechster(TERMELEMENT newElement)
    {
        rechterNaechster = newElement;
    }

    public void präfix()
    {
        System.out.println(inhalt);
        linkerNaechster.präfix();
        rechterNaechster.präfix();
    }

    public int[] splitSubs(int sub) {
        int[] nums=new int[2];
        nums[0] = (int) sub - (int)getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    private int getRand(int min, int max) {
        Random rand = new Random();
        System.out.println(min+" , "+max);
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    private int getDivident(int number, boolean oPos)
    {
        if( number==0 ) {
            return 1;
        }
        System.out.println(number+","+ oPos);
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
        if (current<1) {
            return dividents[getRand(0,0)];
        }
        return dividents[getRand(0,current-1)];
    }

    private int getDigitCount(int number) {
        String s=String.valueOf(number);
        if( number<0) {
            return s.length()-1;
        }
        else {

            return s.length();
        }
    }

    public void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg, int decimalPlaces) {
        if (substitutions<1 || bracketDepth<1) {
            System.out.println(erg+" Ergebnis rechts");
            this.setzeRechterNaechster(new ZAHL(erg));
        }
        else {
            String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);
            int[] newSubs=splitSubs(substitutions-1);

            switch (operator) {
                case "+":

                int plus1=0;
                int plus2=0;
                //!!!!!
                if (oPositive==true){
                    plus1=(int) getRand((int) 0, (int) erg);    
                }
                else{
                    if( erg>=0) {
                        plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1))+(int) erg, (int) Math.pow(10,digits )-1);
                    }
                    else if(erg < 0) {
                        plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1)), (int) (Math.pow(9,digits )-1)+(int) erg);
                    }
                }
                //!!!!!
                plus2 =(int) erg-plus1;
                System.out.println(plus1+" , "+plus2);
                //System.out.println(" "+plus1+" "+plus2);
                //this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));
                this.setzeRechterNaechster(new DATENKNOTEN("+"));

                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits, oPositive,plus1,decimalPlaces);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,plus2,decimalPlaces);

                //return number1 + "+" + number2;
                break;
                case "-":
                //!!!!
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
                // int[] newSubs=splitSubs(this.substitutions-1);
                this.setzeRechterNaechster(new DATENKNOTEN("-"));
                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits, oPositive,min1,decimalPlaces);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,min2,decimalPlaces);

                //return number3 + "-" + number4;
                break;
                case "*":
                int divident= getDivident(erg,oPositive);
                int mul1 = divident;
                if(mul1==0) {
                    mul1=1;
                }
                int mul2 = erg / mul1;

                int Fg= mul1>mul2 ? mul1 : mul2;
                int Fk= mul1>mul2 ? mul2 : mul1;

                /**int dMul1=getDigitCount(mul1);
                int dMul2=getDigitCount(mul2);

                int Fg= dMul1>dMul2 ? dMul1 : dMul2;
                int Fk= dMul1>dMul2 ? dMul2 : dMul1;*/

                int DecFg;
                int DecFk;
                int BoundLow=0;
                int BoundHigh=decimalPlaces;
                if (decimalPlaces!=0)
                {
                    if((getDigitCount(Fg)+ decimalPlaces-digits) >=0)
                        BoundLow=getDigitCount(Fg)+ decimalPlaces-digits;
                    if((digits-getDigitCount(Fk))<=decimalPlaces)
                        BoundHigh=digits-getDigitCount(Fk);
                }
                DecFg=getRand(BoundLow, BoundHigh);
                DecFk=decimalPlaces-DecFg;

                int FolZeFg=decimalPlaces-DecFg;
                int FolZeFk=decimalPlaces-DecFk;

                Fg=Fg*(int)Math.pow(10,FolZeFg);
                Fk=Fk*(int)Math.pow(10,FolZeFk);
                //int[] newSubs=splitSubs(this.substitutions-1);
                this.setzeRechterNaechster(new DATENKNOTEN("*"));
                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,Fg,decimalPlaces);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,Fk,decimalPlaces);
                //return number5 + "*" + number6;
                break;
                case "/":
                int upperbound=((int)Math.pow(10,digits)/Math.abs(erg));
                int div1;
                int div2;

                if (upperbound < (int)Math.pow(10,(digits-decimalPlaces))){
                    div1=getRand(1,upperbound);

                }
                else {
                    div1=getRand(1, (int)Math.pow(10,(digits-decimalPlaces)));
                }
                div2=erg*div1;

                int decDivs=0;
                int decDivd=decimalPlaces;

                div2=div2*(int)Math.pow(10,(decimalPlaces-decDivd));
                div1=div1*(int)Math.pow(10,(decimalPlaces-decDivs));
                //int[] newSubs=splitSubs(this.substitutions-1);
                this.setzeRechterNaechster(new DATENKNOTEN("/"));
                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits, oPositive,(int)div2,decimalPlaces);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,(int)div1,decimalPlaces);

                //return number7 + "/" + number8;
                break;
            }
        }
    }

    public void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,int erg,int decimalPlaces) {
        if (substitutions<1 || bracketDepth<1) {
            System.out.println(erg+" Ergebnis links");
            this.setzeLinkerNaechster(new ZAHL(erg));
        }
        else {
            String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);
            int[] newSubs=splitSubs(substitutions-1);

            switch (operator) {
                case "+":

                int plus1=0;
                int plus2=0;
                if (oPositive==true){
                    plus1=(int) getRand((int) 0, (int) erg);    
                }
                else{
                    if( erg>=0) {
                        plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1))+(int) erg, (int) Math.pow(10,digits )-1);
                    }
                    else if(erg < 0) {
                        plus1 =(int)  getRand((int) (-1*(Math.pow(10,digits)-1)), (int) (Math.pow(10,digits )-1)+(int) erg);
                    }
                }
                plus2 =(int) erg-plus1;
                //System.out.println(plus1+" , "+plus2);
                //this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));
                this.setzeLinkerNaechster(new DATENKNOTEN("+"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,plus1,decimalPlaces);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,plus2,decimalPlaces);

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
                this.setzeLinkerNaechster(new DATENKNOTEN("-"));
                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,min1,decimalPlaces);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,min2,decimalPlaces);

                //return number3 + "-" + number4;
                break;
                case "*":
                int divident= getDivident(erg,oPositive);
                int mul1 = divident;
                if(mul1==0) {
                    mul1=1;
                }
                int mul2 = erg / mul1;

                int Fg= mul1>mul2 ? mul1 : mul2;
                int Fk= mul1>mul2 ? mul2 : mul1;

                /**int dMul1=getDigitCount(mul1);
                int dMul2=getDigitCount(mul2);

                int Fg= dMul1>dMul2 ? dMul1 : dMul2;
                int Fk= dMul1>dMul2 ? dMul2 : dMul1;*/

                int DecFg;
                int DecFk;
                int BoundLow=0;
                int BoundHigh=decimalPlaces;
                if (decimalPlaces!=0)
                {
                    if((getDigitCount(Fg)+ decimalPlaces-digits) >=0)
                        BoundLow=getDigitCount(Fg)+ decimalPlaces-digits;
                    if((digits-getDigitCount(Fk))<=decimalPlaces)
                        BoundHigh=digits-getDigitCount(Fk);
                }
                DecFg=getRand(BoundLow, BoundHigh);
                DecFk=decimalPlaces-DecFg;

                int FolZeFg=decimalPlaces-DecFg;
                int FolZeFk=decimalPlaces-DecFk;

                Fg=Fg*(int)Math.pow(10,FolZeFg);
                Fk=Fk*(int)Math.pow(10,FolZeFk);
                //int[] newSubs=splitSubs(this.substitutions-1);
                this.setzeLinkerNaechster(new DATENKNOTEN("*"));
                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[1],digits,oPositive,Fg,decimalPlaces);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[0],digits,oPositive,Fk,decimalPlaces);
                //return number5 + "*" + number6;
                break;
                case "/":
                int upperbound=(int)Math.pow(10,digits)/Math.abs(erg);
                int div1;
                int div2;

                if (upperbound < (int)Math.pow(10,(digits-decimalPlaces))){
                    div1=getRand(1,(int)upperbound);

                }
                else {
                    div1=getRand(1, (int)Math.pow(10,(digits-decimalPlaces)));
                }
                div2=erg*div1;

                int decDivs=0;
                int decDivd=decimalPlaces;

                div2=div2*(int)Math.pow(10,(decimalPlaces-decDivd));
                div1=div1*(int)Math.pow(10,(decimalPlaces-decDivs));
                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("/"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,(int)div2,decimalPlaces);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,(int)div1,decimalPlaces);

                //return number7 + "/" + number8;
                break;
            }
        }
    }

    public int gibHöhe() {
        return 1+ Math.max(linkerNaechster.gibHöhe(),rechterNaechster.gibHöhe());
    }

    public int gibAnzahl() {
        return 1+linkerNaechster.gibAnzahl()+rechterNaechster.gibAnzahl();
    }

    public boolean isAVL()
    {
        if(linkerNaechster.gibHöhe()-rechterNaechster.gibHöhe()<=1|linkerNaechster.gibHöhe()-rechterNaechster.gibHöhe()>=-1)
        {
            return linkerNaechster.isAVL() &&rechterNaechster.isAVL();

        }
        return false;
    }

    public ArrayList collect(ArrayList dest) {
        dest.add("(");
        dest=rechterNaechster.collect(dest);
        dest.add(this.inhalt);
        dest=linkerNaechster.collect(dest);
        dest.add(")");
        return dest;
    }

    public String infix()
    {
        return "("+rechterNaechster.infix()+inhalt+linkerNaechster.infix()+")";
    }
}