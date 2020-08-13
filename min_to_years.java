import java.util.Scanner;

public class min_to_years {

	public static void main(String[] args) {
		System.out.println("Enter the Minutes");
		Scanner scan =new Scanner(System.in);
		int minu =scan.nextInt();
		int days= minu  /1440;// we get number of days
		int year = days/365;// we get number of years
		int r_days=days%365;//remaining days
		
		System.out.println(" the number of years = "+ year);
		System.out.println(" The remaining days = "+r_days);
		}
	}
