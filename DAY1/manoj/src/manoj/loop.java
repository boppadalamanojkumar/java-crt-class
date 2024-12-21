package manoj;

public class loop {

	public static void main(String[] args) {
		int n=8907,rem,nn=0;
		while(n!=0) {
			rem=n%10;
			nn=nn*10+rem;
			System.out.println(rem);
			n=n/10;
		}
		System.out.println("reverse number--->"+nn);

	}

}
