package jen1;
import java.util.Scanner;

class Person
{
	String name;
	int age;
	 
    void readDetails()
    {
    	Scanner sc=new Scanner (System.in);
    	
    	System.out.println("Enter the name and age");
    	name=sc.next();
    	age=sc.nextInt();
        sc.nextLine();
      
    }
}

class Student extends Person
{
	int regNo;
	double m1,m2,m3,total, avg;
	String result;
	
	void getDetails()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the regNo and marks");
		regNo=sc.nextInt();
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		
	}
	void calresult()
	{
		total=m1+m2+m3;
		avg=total/3;
		
		if (avg>80)
			result="Destination";
		else if (avg>60)
			result="First class";
		else if(avg>50)
			result="second class";
		else if (avg>40)
			result="Just pass";
		else
			result="Fail";
	}
	
	void Display()
	{
		System.out.print("\t|" + name);
		System.out.print("\t|" + age);
		System.out.print("\t|" + regNo);
		System.out.print("\t|" + m1);
		System.out.print("\t|" + m2);
		System.out.print("\t|" + m3);
		System.out.print("\t|" + total);
		System.out.print("\t|" + avg);
		System.out.print("\t|" + result);
	}

}

public class demo1 {
	public static void main(String[]args)
	{ Scanner sc=new Scanner (System.in);
		Student[] s=new Student[20];
		int n;
		System.out.print("Enter the number of students");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].readDetails();
			s[i].getDetails();
			s[i].calresult();
			
		}
		
		System.out.println(" \t_______________________________________________________________________________________");
        System.out.println("\t| Name \t| Age \t| RegNo \t| M1 \t| M2 \t| M3 \t| Total \t|\t|Average \t| Result|");
        System.out.println(" \t_______________________________________________________________________________________");
		
        for (int i=0;i<n;i++)
        {
        	s[i].Display();


    		System.out.println(" \t___________________________________________________________________________________");
        }
	}
}
