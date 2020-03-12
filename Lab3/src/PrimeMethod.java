import java.util.Scanner;

public class PrimeMethod {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int Number = sc.nextInt();
		if(isPrime(Number)) 
			System.out.println("True");
			else
				System.out.println("False");
		sc.close();
	}
	public static boolean isPrime(int Number) {
		int count=0;
		for (int i=2;i<Number/2;i++) {
			if (Number%i==0);
			count++;
		}
		if(count>0)
			return false;
		else
			return true;
	}

}
 