import java.util.Scanner;

class shp
{

void get_circle()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the radius");
  double r=sc.nextDouble();
    
  System.out.println("The area of the circle is ="+(3.14*r*r));
  System.out.println("The perimeter of the circle is ="+(2*3.14*r));
}
void get_square()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length");
  double a=sc.nextDouble();
  System.out.println("The area of square is="+(a*a));
  System.out.println("The perimeter of squareis="+(4*a));

}
void get_rectangle()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length");
  double l=sc.nextDouble();
  System.out.println("Enter the widgth");
  double w=sc.nextDouble();
  System.out.println("The area of rectangle is="+(l*w));
  System.out.println("The perimeter of squareis="+(2*(l+w)));

}
}

public class shapes
 {

    public static void main(String[] args)
     {  shp s=new shp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                s.get_circle();
                break;
            case 2:
             s.get_rectangle();
             break;
            case 3:
               s.get_square();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        
    }

    
}