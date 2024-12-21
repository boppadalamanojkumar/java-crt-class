package manoj;

import java.util.Scanner;

public class polyndrom {

	public static void main(String[] args) {
		// Check given string is polyndrome or not
		//ex:13331--- yes
		//level----- yes
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.next();
		char ch;
		String newStr="";
		//12345
		//54321
		for(int i=0;i<data.length();i++) {
			ch=data.charAt(i);
			newStr= ch+newStr;
			
		}
		System.out.println("data from keyboard--->"+data);
		System.out.println("new Str-->"+newStr);
		if(data.contentEquals(newStr)==true) {
			System.out.println("polyndrome");
		}
		else {
			System.out.println("not");

		}
	    sc.close();

}
}