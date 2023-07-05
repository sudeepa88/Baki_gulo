package java_recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number = 5;
		int factorial=calculateFactorial(number);
		
		System.out.println("Factorial of "+number+" is:"+factorial);

	}
	
	public static int calculateFactorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*calculateFactorial(n-1);
		}
	}

}
