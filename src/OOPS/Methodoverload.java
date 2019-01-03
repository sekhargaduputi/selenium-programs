package OOPS;

//Method OverLoad:When the method name is same with different arguments or input parameters with in the same class.

public class Methodoverload {
	
	public static void main(String args[]){
		Methodoverload obj=new Methodoverload();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		obj.main(10, 20);
		
	}
	public static void main(int x){
		System.out.println("main method");
	}
	public static void main(int x,int y){
		System.out.println("Main method1");
	}
	// we can over load main method
	public void sum(){
		System.out.println("Sum method");
	}
	public void sum(int x){
		System.out.println("Sum method---1 input");
		System.out.println(x);
	}
	public void sum(int x,int y){
		System.out.println("Sum method---2 inputs");
		System.out.println(x+y);
	}
}
