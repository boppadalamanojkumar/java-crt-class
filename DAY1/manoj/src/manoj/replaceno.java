package manoj;
import java.util.Scanner;
public class replaceno {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n,l,index=0,p=1,res=0;
		System.out.println("enter  no");
		n=sc.nextInt();
		while(n!=0) {
			l=n%10;
			n=n/10;
			index++;
			if(index==2) {
				l=1+7;
			}
			res=res+1*p;
			p=p*10;
			
	}
		System.out.println(res);
	}
}
