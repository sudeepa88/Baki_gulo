package java_recursion;

public class power_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=3;
		int j=4;
		power_Check(k,j);
		System.out.println("The element is "+k+" and the power is "+j+" is "+power_Check(k,j));

	}
	
	
	public static int power_Check(int a,int b) {
		if(b==1) {
			return a;
		}else if(b==0){
			return 1;
		}else {
			return a*power_Check(a,b-1);
		}
	}

}
