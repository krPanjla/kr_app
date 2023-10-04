
// Java program to demonstrate working of method
// overloading in Java

public class Sum {
	// Overloaded sum(). This sum takes two int parameters
	public int sum(int x, int y) { return (x + y); }

	// Overloaded sum(). This sum takes three int parameters
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	// Overloaded sum(). This sum takes two double
	// parameters
	public double sum(double x, double y)
	{
		return (x + y);
	}

	// Driver code
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
=======
// A Simple Java program to demonstrate
// method overriding in java

// Base Class
class Parent {
	void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override void show()
	{
		System.out.println("Child's show()");
	}
}

// Driver class
class Main {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}
