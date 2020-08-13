
import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
	int choice;
	System.out.println("1.Hello\t 2.Hi \t 3.hey");
	Scanner scan=new Scanner(System.in);
	choice=scan.nextInt();
	switch(choice) {
	case 1: System.out.println("you choosed Hello");
			break;
	case 2: System.out.println("you choosed Hi");
			break;
	
	case 3: System.out.println("you choosed Hey");
			break;
	
	default:System.out.println("Invalid Input");
			
	
	}
	}
	}
