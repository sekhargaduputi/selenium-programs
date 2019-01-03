package OOPS;

public class Car {
	//Global varibale or class variable
	int mod;
	int wheel;
		
	
	public static void main(String args[]){
		//new car------- is nothing but object of car class
		// new keyword is used to create a object.
		//a,b is object refrence variable
		
		Car a= new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=3;
		
		c.mod=2017;
		c.wheel=2;
		
		System.out.println(a.mod);
		System.out.println(b.wheel);
		
		System.out.println("After shifting the refrences");
		
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod );
		
		
	}

}
