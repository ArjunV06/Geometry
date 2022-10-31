import java.util.*;
import java.io.*;
import java.lang.*;
public class Geometry
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(new File("geometry.dat"));
        int num = in.nextInt();
        for(int i = 0; i<num; i++)
        {
            calculate(in.nextDouble());
        }
    }
    public static void calculate(double input)
    {
        double working = input*input;
        working*=4*Math.PI;
        
        double working2 = input;
        working2=Math.pow(working2,3);
        working2*=4;
        working2/=3;
        working2*=Math.PI;
        
        working = (double)Math.round(working*1000)/1000;
        working2 = (double)Math.round(working2*1000)/1000;
        double v = working2;
        double sa = working;
        System.out.println("SA = " + sa + " V = " + v);
    
    }
}