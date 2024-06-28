package jspiders.p1;

public class Demo1 {
	int x = 10;
	void test() {
		System.out.println("running test method");
	}
}

class Demo2 extends Demo1
{
	int y = 20;
	void disp()
	{
		System.out.println("running disp() method");
	}
}


//Demo2 inherits members from Demo1
//Demo1 is called as Base class or super class or parent class
//Demo2 is called as Derived class or sub class or child class