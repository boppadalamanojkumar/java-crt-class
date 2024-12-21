package manoj;
import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		Scanner xy=new Scanner(System.in);
		System.out.println("enter the value");
	    char ch=xy.next().charAt(0);
		if((ch>='a')&&(ch<='z'))
		{
			System.out.println("yes it is  a alphabet");
		}
		else if((ch>='A')&&(ch<='Z')){
			System.out.println("yes it is alphabet");
		}
		else
		{
			System.out.println("not a alphabet");
		}
	}
	}
