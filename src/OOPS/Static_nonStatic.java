package OOPS;

public class Static_nonStatic {

	String name="sekhar";  // Non-Static Global varible
	static int age=10;  //Static gloal variable
	
	public static void main(String[] args) {
		
		// how to call static method
		//1.direct calling
		sum();
		//2.calling class name
		Static_nonStatic.sum();
		
		//variables
		 System.out.println(age);
		System.out.println(Static_nonStatic.age);
		
		//How to call non static method
		//---Non static methods we need to create a object.
		Static_nonStatic obj=new Static_nonStatic();
		obj.sendmail(); // method calling
		System.out.println(obj.name);   // Gloabal variable
		
		//can i access static method by using object refrence ?   Yes 
		obj.sum();  
		
	
		
		 
		
	}
	
	public void sendmail(){  // non static method
		System.out.println("send mail");
	}
	public static void sum(){  // static method
		System.out.println("sum method");
	}

}
