	import java.util.Scanner;
	public class EvenOddCounter 
	{
	public static void isEven(int number){ 
	if((number%2)==0)
	{
	System.out.println("The number is Even number");
	}
	else
	{
	System.out.println("The number is Odd number");
	}
	}
	public static void main(String args[])
	{
	int n,Evencount=0,Oddcount=0,num=0;
	System.out.println("Enter any number: ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	isEven(num); 
	for(n=1;n<=100;n++) 
	{
	if(n%2==0)//
	{
	Evencount++;
	  
	}
	else
	{
	Oddcount++;

	}
	}

	System.out.println("The Total number of Even Numbers is: "+Evencount);
	System.out.println("The Total number of Odd Numbers is: "+Oddcount);
	}
}

