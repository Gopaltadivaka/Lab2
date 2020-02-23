package lab2;

import java.util.Scanner;

public class BankCharges {
	public static void main(String[] args) {
		int Basefare= 10;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of checks written:");
		int numberOfChecks = sc.nextInt();
		if(numberOfChecks<20) {
			double charges = Basefare+(numberOfChecks*0.10);
			System.out.println("Monthly bank Charges for your Usage is"+charges);
		}
		if(numberOfChecks>=20 && numberOfChecks<40) {
			double charges = Basefare+(numberOfChecks*0.08);
			System.out.println("Monthly bank Charges for your Usage is"+charges);
		}
		if(numberOfChecks>=40 && numberOfChecks<60) {
			double charges = Basefare+(numberOfChecks*0.06);
			System.out.println("Monthly bank Charges for your Usage is"+charges);
		}if(numberOfChecks>=60) {
			double charges = Basefare+(numberOfChecks*0.04);
			System.out.println("Monthly bank Charges for your Usage is"+charges);
		}
		sc.close();
	}

}
