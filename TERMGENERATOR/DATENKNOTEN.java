import java.util.Arrays;
import java.util.Random;

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
        nums[0] = (int) sub - getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    private int getRand(int min, int max) {
        Random rand = new Random();
        
        int toReturn= (int)Math.sqrt ( Math.pow ( Math.sqrt( Math.pow( Math.abs(rand.nextInt((max - min) + 1 )+ min) ,2) ) ,2));
       
        return  toReturn;
    }

    public void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,double erg) {
        if (substitutions<1 | bracketDepth<1) {
            this.setzeRechterNaechster(new ZAHL((int)erg));
        }
        else {
            String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);
            int[] newSubs=splitSubs(substitutions-1);
            switch (operator) {
                case "+":
                int plus1 = (int) erg - getRand(0, (int) erg);
                int plus2 = (int) erg - plus1;

                //this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));
                this.setzeRechterNaechster(new DATENKNOTEN("+"));

                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,plus1);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,plus2);

                //return number1 + "+" + number2;
                break;
                case "-":
                int min1 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
                int min2 = (int) (min1 - erg);

                // int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeRechterNaechster(new DATENKNOTEN("-"));

                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,min1);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,min2);

                //return number3 + "-" + number4;
                break;
                case "*":
                int mul1 = (int) erg / getRand(1, (int) erg);
                int mul2 = (int) erg / mul1;

                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeRechterNaechster(new DATENKNOTEN("*"));

                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,mul1);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,mul2);

                //return number5 + "*" + number6;
                break;
                case "/":
                int div1 = (int) erg * getRand(1, (int) erg);
                int div2 = (int) erg / div1;

                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeRechterNaechster(new DATENKNOTEN("/"));

                this.rechterNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,div1);
                this.rechterNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,div2);

                //return number7 + "/" + number8;
                break;
            }
        }
    }

    public void linkerTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivision,int bracketDepth,int substitutions,int digits, boolean oPositive,double erg) {
        if (substitutions==0) {
            this.setzeLinkerNaechster(new ZAHL((int) erg));
        }
        else {
            String operator=getRechenzeichen(aoAddition,aoSubstraction,aoMultiplication,aoDivision);
            int[] newSubs=splitSubs(substitutions-1);
            switch (operator) {
                case "+":
                int plus1 = (int) erg - getRand(0, (int) erg);
                int plus2 = (int) erg - plus1;

                //this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));
                this.setzeLinkerNaechster(new DATENKNOTEN("+"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,plus1);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,plus2);

                //return number1 + "+" + number2;
                break;
                case "-":
                int min1 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
                int min2 = (int) (min1 - erg);

                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("-"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,min1);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,min2);

                //return number3 + "-" + number4;
                break;
                case "*":
                int mul1 = (int) erg / getRand(1, (int) erg);
                int mul2 = (int) erg / mul1;

                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("*"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,mul1);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,mul2);

                //return number5 + "*" + number6;
                break;
                case "/":
                int div1 = (int) erg * getRand(1, (int) erg);
                int div2 = (int) erg / div1;

                //int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("/"));

                this.linkerNaechster.rechterTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,(bracketDepth-1)-1,newSubs[0],digits,oPositive,div1);
                this.linkerNaechster.linkerTermErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivision,bracketDepth-1,newSubs[1],digits,oPositive,div2);

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

    public String infix()
    {
        return "("+rechterNaechster.infix()+inhalt+linkerNaechster.infix()+")";
    }
}