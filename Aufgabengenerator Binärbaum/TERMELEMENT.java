public abstract class TERMELEMENT
{
    public abstract void präfix();
    public abstract void unterbäumeErstellen(int anz);
    public abstract int gibHöhe();
    public abstract TERMELEMENT sortiertEinfügen(OPERATOR e);

    public abstract int gibAnzahl();
    public abstract OPERATOR[] baumSortieren(int nr,OPERATOR[] liste);
    public abstract boolean isAVL();
    public abstract String infix();
}
