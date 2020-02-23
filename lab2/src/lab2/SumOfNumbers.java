package lab2;
import java.util.*;
public class SumOfNumbers {
	public static void main(String[] args) {
		int i=0,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		for(i=0;i<num+1;i++) {
			sum +=i ;	
		}
		 System.out.println("The sum of numbers:"+sum);
		 sc.close();
	}
} 
	
