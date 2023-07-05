package java_recursion;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the desired natural number: ");
        int n=sc.nextInt();
       
        calculateNatural(n);
        System.out.println("The summation of natural numbers upto "+n+" is: "+calculateNatural(n));
	}
	
	public static int calculateNatural(int sum) {
		if(sum==0||sum==1) {
			return sum;
		}else {
			return sum+calculateNatural(sum-1);
		}
	}

}
