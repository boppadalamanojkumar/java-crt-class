
package manoj;

public class money {

	public static void main(String[] args) {
		int amount=15,n10=0,c5=0,c2=0,c1=0;
		System.out.println("given curency-->"+amount);
		if(amount>10) {
			n10=amount/10;
			amount=amount-(n10*10);
		}
		if(amount>=5) {
			c5=amount/5;
			amount=amount-(c5*5);
		}
		if(amount>=2) {
			c2=amount/2;
			amount=amount-(c2*2);
		}
		if(amount>0) {
			c1=1;
			
		}
		System.out.println("10 note-->"+n10);
		System.out.println("5 coins-->"+c5);
		System.out.println("2 coins-->"+c2);
		System.out.println("1 coins-->"+c1);
		
	}

}
