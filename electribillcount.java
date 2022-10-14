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
		if(unit<=100) // When your unit will be less then 100
		{
			price=unit*10; // unit less then or equal to 100 it will cost you 10rs/unit
		}
		else if(unit>100 && unit<=200) // when unit will be less then or equal to 200
		{
			price=(unit-100)*15; // first 100 unit will cost 10rs/unit after that till 200 unit it will cost 15rs/unit
			price=price+1000;
		}
		else if(unit>200) // when unit more then 200 unit
		{
			price=(unit-200)*20; // after 200 unit it will cost you 20rs/unit
			price=price+2500;
		}
		System.out.println("You electricity bill amount is : "+price);
	}
}
