package manoj;

public class pattern5 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10	
		 * 11 12 13 14 15
		 * 
		 */
		//for(int r=1,n=1;r<=5;r++); {
			for(int r=1,n=1;r<=5;r++) {
				for(int c=1;c<=r;c++) {
					//System.out.print(c+" ");
					System.out.print(n++ +" ");
				}
				System.out.println();
	
		}
}
}