import java.util.Scanner;

class temp
{

  void get_celsius()
  {  Scanner temp1=new Scanner(System.in);
     System.out.println("Enter the temperaturein fahrenheit");
     double fah=temp1.nextDouble();
     double c= (fah-32)*5/9;
     System.out.println("The temperature in celsius is"+c);
  }

  void get_fahrenhiet()
  {  Scanner temp3=new Scanner(System.in);
    System.out.println("Enter the temperaturein celsius");
   double cel=temp3.nextDouble();
   double f= (cel * 9/5) + 32;
    System.out.println("The temperature in fahrenheit is"+f);
    }

}

public class temperature
{  
 public static void main(String[]args)
  {
      temp temp2=new temp();
     

      temp2.get_celsius();
      temp2.get_fahrenhiet();

  }
}