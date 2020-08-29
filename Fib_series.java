import java.util.Scanner;

/* 1 1 2 3 5 8 13 ... */
public class fiboSeri {

	public static void main(String[] args) {
		int k=0;
		int a=1,b=1;
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		System.out.print(" 1 1 ");
		while(k<=num)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	

	}

}