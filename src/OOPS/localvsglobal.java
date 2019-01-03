package OOPS;

public class localvsglobal {
	
	//Global variable or class variable
	  
	int age=10;
	String name="sekhar";
	

	public static void main(String args[]){
		
		int i=10;                                // Local variable 
		System.out.println(i);
		
		//if we want access global variable we need to create object.
		localvsglobal obj=new localvsglobal();
		System.out.println(obj.name);
		System.out.println(obj.age );
		int f=obj.sum();
		System.out.println(f);
		
	}
	public int sum(){
		int i=15;         //Local variable for sum method
		int j=20;
		int c=i+j;
		return c;
		
	}

}
