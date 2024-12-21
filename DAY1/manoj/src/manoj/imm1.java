package manoj;

public class imm1 {

	public static void main(String[] args) {
		String data="hello";
		StringBuffer str = new StringBuffer("welcome");
		long pT = System.currentTimeMillis();
		for(int i=1;i<1000;i++) {
			data=data+1;
		}
		long cT = System.currentTimeMillis();
		long diffT=cT-pT;
		
		long pT1 = System.currentTimeMillis();
		for(int i=1;i<1000;i++) {
			str=str.append(""+i);

	}
	long cT1 = System.currentTimeMillis();
	long diffT1=cT1-pT1;
	System.out.println("from String--->"+diffT);
	System.out.println("from StringBuffer--->"+diffT1);
}
}