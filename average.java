import java.util.Scanner;

public class average 
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       int sum=0;
      System.out.println("Enter the limit");
      int n=sc.nextInt();

      for(int i=0;i<n;i++)
      {
        System.out.println("Enter the number");
        int a=sc.nextInt();
        sum=sum+a;
      }

      double average=sum/n;

      System.out.println("The average is ="+average);


    }
}
