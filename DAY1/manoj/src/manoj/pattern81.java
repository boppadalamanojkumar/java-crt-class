package manoj;

public class pattern81 {

	public static void main(String[] args) {
		String name1="manoj kumar";
		String name2="poshankumar";
		name1= name1+name2;
		name2= name1.substring(0, name1.length()-name2.length());
		System.out.println(name2);
	}

}
