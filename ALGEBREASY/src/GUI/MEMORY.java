package src.GUI;


public class MEMORY
{
    private String Exercise;
    public MEMORY Next;
    private double Solution;
    public MEMORY()
    {
    }

    public String readExercise()
    {
        return Exercise;
    }
    
    public MEMORY returnNext()
    {
        return Next;
    }
    
    public void writeExercise(String K)
    {
        Exercise = K;
    }
    
    public void setNext(MEMORY N)
    {
        Next = N;
    }
    
    public void writeSolution(double S)
    {
        Solution = S;
    }
    
    public double readSolution()
    {
        return Solution;
    }
}
