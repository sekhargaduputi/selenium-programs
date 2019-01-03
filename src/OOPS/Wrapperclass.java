package OOPS;

public class Wrapperclass {
	//Wrapper class is nothing but convert into integers
	
	
	public static void main(String args[]){
		
		String s="100";
		System.out.println(s+20);
		
		//Data convert string to int
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		
		//Integer,Double,boolean
		//string to double
		String g="12.33";
		Double j=Double.parseDouble(g);
		System.out.println(j+20);
		
		//String to character
		String f="true";
		Boolean b=Boolean.parseBoolean(f);
		System.out.println(b);
		
		//int to string;
		int k=200;
		System.out.println(k+20);
		String c=String.valueOf(k);
		System.out.println(c+20);
		
		String d="100a";
		int l=Integer.parseInt(d);
		System.out.println(l+20); ///output is number format exception getting
		
	}

}
