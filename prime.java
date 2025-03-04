import java.util.Scanner;

public class prime {

    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();

      Boolean is_prime= true;
       
      for(int i=2;i<=n/2;i++)
      {
        if (n%i==0)
          is_prime=false;
      }

     if (is_prime)
     System.out.println(n+" is a prime number");
     else
     System.out.println(n+" is not a prime number");
     


    }
}
