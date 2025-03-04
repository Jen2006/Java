import java.util.Scanner;  
public class Shape {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String shape = sc.next();  
        if (shape.equals("circle")) {  
            double r = sc.nextDouble();  
            System.out.println(2 * Math.PI * r + " " + Math.PI * r * r);  
        } else if (shape.equals("rectangle")) {  
            double l = sc.nextDouble(), w = sc.nextDouble();  
            System.out.println(2 * (l + w) + " " + (l * w));  
        } else {  
            double s = sc.nextDouble();  
            System.out.println(4 * s + " " + (s * s));  
     }
   }
}