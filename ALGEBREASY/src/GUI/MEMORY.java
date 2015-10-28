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
