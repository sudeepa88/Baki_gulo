package java_recursion;

public class isPalindrome {
	static String str= new String();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brr="nano";
		//String str[]=new String[brr.length()];
		int n=brr.length()-1;
		 
		worship(brr,n);
		if(brr.equals(str)) {
			   System.out.println(brr+" is a palindrome");
		   }else {
			   System.out.println(brr+" is not a palindrome");
		   }
		

	}
   public static void worship(String arr,int n) {
	   //String str= new String();
	   
	   if(n==0) {
		   //System.out.println(arr);
		   str+=arr.charAt(0);
	   }else {
		   str+=arr.charAt(n);
		   worship(arr,n-1);
		   
	   }
	   
	   
	   
		   
   }
   
   
}
