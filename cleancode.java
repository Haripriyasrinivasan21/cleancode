Construction of house
import java.io.*;
import java.util.*;
class Standard
{
    Standard()
    {
       double Standard_materials;
        double area;
double total_cost;
 
        Scanner i = new Scanner(System.in);
 
        System.out.print("Enter the Standard materials : ");
        Standard_materials= i.nextDouble();
 
        System.out.print("Enter the area : ");
        area = i.nextDouble();
 
        total_cost = Standard_materials * area;
 
        System.out.println(total_cost);
    }
}
class Construction1 extends Standard
{
public static void main(String args[])
{
Standard o3 = new Standard();
}
}
SIMPLE INTEREST
import java.io.*;
import java.util.*;
class Test
{
    // static block
    static
    {
        double PAmount, ROI, TimePeriod, simpleInterset;
Scanner sc = new Scanner(System.in);

System.out.print(" Please Enter the Principal Amount : ");
PAmount = sc.nextDouble();

System.out.print(" Please Enter the Rate Of Interest : ");
ROI = sc.nextDouble();

System.out.print(" Please Enter the Time Period in Years : ");
TimePeriod = sc.nextDouble();

simpleInterset = (PAmount * ROI * TimePeriod) / 100;

System.out.println("\n The Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterset);
    }
}
class Simple extends Test
{
public static void main(String args[])
{
Test o2= new Test();
}
}
COMPOUND INTEREST
import java.io.*;
import java.util.*;
public class Compound
{
    // static block
    Compound()
    {
       double Principal_Amount = 0.0;
        double Interest_Rate = 0.0;
        double Time_Period = 0.0;
        double CompoundInterest = 0.0;
 
        Scanner i = new Scanner(System.in);
 
        System.out.print("Enter the Principal Amount : ");
        Principal_Amount = i.nextDouble();
 
        System.out.print("Enter the Time Period : ");
        Time_Period = i.nextDouble();
 
        System.out.print("Enter the Interest Rate : ");
        Interest_Rate = i.nextDouble();
 
        CompoundInterest = Principal_Amount * Math.pow((1 + Interest_Rate/100),Time_Period);
 
        System.out.println("");
        System.out.println("Compound Interest : "+CompoundInterest);    
    }
}
public class Test
{
public static void main(String aargs[])
{
 compound o1 = new Compound();
}
}


