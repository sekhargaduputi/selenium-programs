package OOPS;

public class Functions {
	
	//Main method----Starting point of executions.
	public static void main(String args[]){
		Functions obj=new Functions();
		//one object will be created,obj is the refrence variable,refering to this object.
		//after creating object the copy of all non static methods will be given to this object.
		
		obj.test();
		int x=obj.data();
		System.out.println(x);
		String s1=obj.qa();
		System.out.println(s1);
		int y=obj.divison(10, 20);
		System.out.println(y);
		
	
	}
	//non statics methds:
	//Void means--------void is nothing but should not be ruturn any value.
	
	//return type=void.
	public void test(){   //no input no output
		System.out.println("test method");
	}
	//return type==int.
	public int data(){  // no input but some output
		System.out.println("data method");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;  
	}
	//return type---String
	public String qa(){    // no input but some output
		System.out.println("qa method"); 
		String s="Selenium";
		return s;
	}
	 //return type---int
	//x,y-----input parameters/arguments
	public int divison(int x, int y){   //
		System.out.println("division method");
		int d=x/y;
		return d;
		
	}
}
