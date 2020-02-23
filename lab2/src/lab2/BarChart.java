package lab2;
import java.util.*;
public class BarChart { 
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sales for Store 1:");
		int salesForStore1=sc.nextInt();
		System.out.println("Enter the Sales for Store 2:");
		int salesForStore2=sc.nextInt();
		System.out.println("Enter the Sales for Store 3:");
		int salesForStore3=sc.nextInt();
		System.out.println("Enter the Sales for Store 4:");
		int salesForStore4=sc.nextInt();
		System.out.println("Enter the Sales For Store 5:");
		int salesForStore5=sc.nextInt();
		sc .close();
		System.out.println(" Sales For Store 1:"+getSaleString(salesForStore1));
		System.out.println(" Sales For Store 2:"+getSaleString(salesForStore2));
		System.out.println(" Sales For Store 3:"+getSaleString(salesForStore3));
		System.out.println(" Sales For Store 4:"+getSaleString(salesForStore4));
		System.out.println(" Sales For Store 5:"+getSaleString(salesForStore5));
		
	}

	private static String getSaleString(int salesForStore1) {
		String salesForStore1str= "";
		for( int i=0;i<(salesForStore1/100);i++) {
			salesForStore1str=salesForStore1str+"*";
			
		}
		return salesForStore1str;
		//System.out.println(" Sales For Store 1:"+salesForStore1str);
	}
}