public class DATENKNOTEN extends TERMELEMENT
{
    public TERMELEMENT linkerNaechster;
    public TERMELEMENT rechterNaechster;

    OPERATOR inhalt;
    public DATENKNOTEN(OPERATOR inhalt)
    {
        this.inhalt = inhalt;
        linkerNaechster = new ZAHL();
        rechterNaechster = new ZAHL();
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
        System.out.println(inhalt.op);
        linkerNaechster.präfix();
        rechterNaechster.präfix();
    }

    

public int gibHöhe() {
    return 1+ Math.max(linkerNaechster.gibHöhe(),rechterNaechster.gibHöhe());
}

public TERMELEMENT sortiertEinfügen(OPERATOR e) {
    
    if(e.op>inhalt.op) {
        rechterNaechster=rechterNaechster.sortiertEinfügen(e);
}
else if(e.op<inhalt.op) {
     linkerNaechster=linkerNaechster.sortiertEinfügen(e);
}
else { System.out.println("Was kannst du eigentlich?");
}
return this;
}


public int gibAnzahl() {
    return 1+linkerNaechster.gibAnzahl()+rechterNaechster.gibAnzahl();
}
public OPERATOR[] baumSortieren(int anz,OPERATOR[] liste) {
     liste[anz++]=inhalt ;
     OPERATOR[] lliste=linkerNaechster.baumSortieren(anz,liste);
     return rechterNaechster.baumSortieren(anz+linkerNaechster.gibAnzahl(),lliste);
     
     
    
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
    return rechterNaechster.infix()+inhalt.op+linkerNaechster.infix();
}
}