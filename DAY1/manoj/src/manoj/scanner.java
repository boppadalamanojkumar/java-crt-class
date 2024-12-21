package manoj;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number");
		int n=num.nextInt();
		if((n>='0')&&(n<='9'))
		{
			System.out.println("yes it is  a numeric value");
		}
		else
		{
			System.out.println("not numeric value");
		}
	}

}
 