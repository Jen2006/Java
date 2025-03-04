import java.util.Scanner;
import java.lang.Math;


public class compound_interest
{ 
  public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the principle amount");
      double P=sc.nextDouble();

      System.out.println("Enter the rate of interest");
      double r=sc.nextDouble();

      System.out.println("Enter the time period");
      int t=sc.nextInt();

      System.out.println("Enter the number of times interest is coumpounded ");
      int n=sc.nextInt();


      double ci= P*Math.pow((1 + (r/n)),(n*t));
      
      System.out.println("The Compound Interest is "+ci);



   }
}
