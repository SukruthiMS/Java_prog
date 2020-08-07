import java.util.Scanner;

public class grade_cal {
	public static void main(String[] args) {
		Scanner i_p= new Scanner(System.in);
		System.out.println("Enter score 1:");
		int num1=i_p.nextInt();
		System.out.println("Enter score 2:");
		int  num2=i_p.nextInt();
		System.out.println("Enter score 3:");
		int  num3=i_p.nextInt();
		float avg;
		avg=(num1+num2+num3)/3;
		if(avg>35 & avg<45) {
			System.out.println("Grade E");
		}
		else if(avg>45 & avg<55) {
			System.out.println("Grade D");
		}
		else if(avg>55 & avg<65) {
			System.out.println("Grade C");
		}
		else if(avg>65 & avg<75) {
			System.out.println("Grade B");
			}
		else if(avg>75 & avg<85) {
			System.out.println("Grade A");
		}
		else if(avg>85 & avg<95) {
			System.out.println("Grade A+");
		}
		else if(avg>95 & avg<100) {
			System.out.println("Grade A++");
		}
		else {
			System.out.println("Invalid Input");
		}
}
}