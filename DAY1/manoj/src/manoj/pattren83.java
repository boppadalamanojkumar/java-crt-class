package manoj;

public class pattren83 {

	public static void main(String[] args) { 
		String name="manoj";
		char ch=name.charAt(0);
		int diff = (int)('A'-'a');
		diff=diff<0?-1*diff:diff;
		if(ch>='a' && ch <='z') {
			ch=(char)(ch -diff);
		}
		System.out.println(ch);
	}

}
