package pkg;

public class Calculator {
	public int addition(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Inputs must be non-negative.");
		}
		return a + b;
	}

	public int multiplication(int a, int b) {
		{
	        if (a < 0 || b < 0) {
	            throw new IllegalArgumentException("Inputs must be non-negative.");
	        }
		return a * b;
		}
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("System");
		System.out.println(obj.addition(1,2));
		System.out.println(obj.multiplication(1,2));
	}
	

}
