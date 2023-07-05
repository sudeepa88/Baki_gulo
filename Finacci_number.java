package java_recursion;

import java.util.Scanner;

public class Finacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your desired nth term: ");
         n = sc.nextInt();
         calculateFibonacci(n);
         System.out.println("The nth term of the fibonacci series is: "+ calculateFibonacci(n));
	}
	
	public static int calculateFibonacci(int sum){
		if(sum==0||sum==1) {
			return sum;
		}else {
			return calculateFibonacci(sum-1)+calculateFibonacci(sum-2);
		}
	}

}
