package manoj;

public class pattern7 {

	public static void main(String[] args) {
		/*      1 2 3 4 
		 *       2 3 4 
		 *        3 4 
		 *         4 
		 *        3 4
		 *       2 3 4
		 *      1 2 3 4 
		 *          
		 */
		int mc=4,sp=20;
		for(int t=1,i=1;t<=4;t++,i++) {
			for(int k=1;k<=sp;k++) {
				System.out.println(" ");
			}
			for(int c=i;c<=mc;c++) {
				System.out.println(c+"  ");
			}
		}
	}

}
