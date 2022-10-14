import java.util.*;
import java.io.*;

class electribillcount
{
	public static void main(String ar[])
	{
		System.out.println("Enter unit use : ");
		Scanner sc=new Scanner(System.in);
		int unit=sc.nextInt();
		int price=0;
		if(unit<=100)
		{
			price=unit*10;
		}
		else if(unit>100 && unit<200)
		{
			price=(unit-100)*15;
			price=price+1000;
		}
		else if(unit>200)
		{
			price=(unit-200)*20;
			price=price+2500;
		}
		System.out.println("You electricity bill amount is : "+price);
	}
}