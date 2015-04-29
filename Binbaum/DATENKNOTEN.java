public class DATENKNOTEN extends TERMELEMENT
{
    public TERMELEMENT linkerNaechster;
    public TERMELEMENT rechterNaechster;

    char inhalt;
    public DATENKNOTEN(char inhalt)
    {
        this.inhalt = inhalt;
        linkerNaechster = new ZAHL();
        rechterNaechster = new ZAHL();
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
        return toReturn;
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
        int[] nums=new int[1];
        nums[0] = (int) sub - getRand(0, (int) sub);
        nums[1] = (int) sub - nums[0];

        return nums;
    }

    private int getRand(int min, int max) {
        Random rand = new Random();

        return  rand.nextInt((max - min) + 1) + min;
    }

    public void rechterTermErsetzen(boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication,boolean aoDivsion,int bracketDepth,int substitutions,int digits, boolean oPositive,double result) {
        if (substitutions==0) {
            this.setzeRechterNaechster(new ZAHL(result));
        }
        else {
            char operator=getRechenzeichen(rzPlus,rzMinus,rzMal,rzDiv);
            switch (operator) {
                case "+":
                int number1 = (int) erg - getRand(0, (int) erg);
                int number2 = (int) erg - number1;

                int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));
                this.setzeRechterNaechster(new DATENKNOTEN(

                        this.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);
                //return number1 + "+" + number2;
                case "-":
                int number3 = (int) erg + getRand((int) erg - 1, (int) erg * 2);
                int number4 = (int) (number3 - erg);

                int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

                this.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

                //return number3 + "-" + number4;
                case "*":
                int number5 = (int) erg / getRand(1, (int) erg);
                int number6 = (int) erg / number5;

                int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

                this.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

                //return number5 + "*" + number6;
                case "/":
                int number7 = (int) erg * getRand(1, (int) erg);
                int number8 = (int) erg / number7;

                int[] newSubs=splitSubs(this.substitutions-1);

                this.setzeLinkerNaechster(new DATENKNOTEN("+".charAt(0)));

                this.linkerNaechster.termErsetzen(aoAddition,aoSubstraction,aoMultiplication,aoDivsion,bracketDepth,newSubs[0],digits.oPositive);

                //return number7 + "/" + number8;
            }
        }
    }

    public void linkerTermErsetzen()

    
    
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
            return rechterNaechster.infix()+inhalt+linkerNaechster.infix();
        }
    }