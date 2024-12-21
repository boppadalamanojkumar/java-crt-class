package manoj;

public class immutablereadonly {

	public static void main(String[] args) {
		
		//readonly
		//Immutable
		
	String data1="hallo";
	String data2="heelo";
	
	if (data1 == data2) {
		System.out.println("same");
	}
	else {
		System.out.println("not");
	}
	String data3=new String("hi");
	String data4=new String("he");
	if(data1 == data4)
		System.out.println("not same");
	}

}
