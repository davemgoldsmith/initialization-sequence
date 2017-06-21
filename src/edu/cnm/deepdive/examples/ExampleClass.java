package edu.cnm.deepdive.examples;

public class ExampleClass {

	{
		value = 1;
		System.out.println("Instance initialization block");
	}
	
	public final int value;
	public static final int DEFAULT_VALUE = -1;
	public int anotherValue = getAnotherValue();
	
	static {
		System.out.println("Static initialization block");
	}

	public ExampleClass() {
		this(DEFAULT_VALUE);
		System.out.println("ExampleClass()");
	}

	public ExampleClass(int value) {
		System.out.println("ExampleClass(int)");
		// this.value = value;
	}
	
	private static int getAnotherValue(){
		System.out.println("getAnotherValue()");
		return 2;
	}

}
