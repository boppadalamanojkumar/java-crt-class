package manoj;

public class loopreverse {

	public static void main(String[] args) {
		int n=8917,rem,nn=00;
		int d=1000;
		while(1==1) {
			rem=n/d;//8917/1000---8
			n=n%d;//917
			d=d/10;
			System.out.println(rem);
			if(n==0) break;
		}
	}
}
