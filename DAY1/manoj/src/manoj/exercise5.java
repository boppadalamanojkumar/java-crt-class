package manoj;

public class exercise5 {

	public static void main(String[] args) {
			String data = "welcome to java world";
			data = data.toUpperCase();
		


	String data1 = "Welcome to Java World";

	data1 = data1.toUpperCase();

	int[] count = {
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
			};
	char ch = ' ';
	int index;
	for(int i=0;i<data1.length();i++) {
		ch = data1.charAt(i);
		if(ch >='A' && ch <='Z') {
			index = (int)(ch -65);
			count[index]++;// 'A'  65 % 65
		}
	}
	int i = 0;
	for(int i1=0;i<26;i++) {
		if(count[i] > 0)
		System.out.println("["+(char)(i+65)+"]--->"+count[i]);
	}
	}
		}

