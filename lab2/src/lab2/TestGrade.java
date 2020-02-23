package lab2;
import java.util.Scanner;
public class TestGrade {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the test score1:");// score 1
			double score1= sc.nextDouble();
			System.out.println("Enter the test score2:");// score 2
			double score2= sc.nextDouble();
			System.out.println("Enter the test score3:");// score 3
			double score3= sc.nextDouble();
			double average=(score1+score2+score3)/3;
			System.out.println("average of Scores is "+ average);
			if(average>=90 && average<=100) {
				System.out.println("You are awarded with A grade");
			}
			if(average>=80 && average<=89) {
				System.out.println("you are awarded with B Grade ");
			}
			if(average>=70 && average<=79) {
				System.out.println("you are awarded with C Grade ");
			}
			if(average>=60 && average<=69) {
				System.out.println("you are awarded with D Grade ");
			}
			if(average<60 ) {
				System.out.println("you are awarded with F Grade ");
			}
			sc.close();
		}

	}


