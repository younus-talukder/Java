package animal;
import java.util.Scanner;

public class SumOdd {
	public static void main(String[] args) {
		int i,n,sum=0;
		System.out.println("Input number of terms : ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("\nThe odd numbers are :");
		
		for (i = 1; i <= n; i++) {
			System.out.println( 2 * i - 1);
			sum += 2 * i - 1;
		}
		 System.out.println("\nThe Sum of odd Natural Number upto n terms : \n" + sum); 
	}
	}
