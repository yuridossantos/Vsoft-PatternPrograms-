
public class Armstrong {

	static void isArmstrongNumber(int n) {
		int digts=0;
		int remainder=0;
		int result=0;
		int number=n;

		for(;number!=0; number/=10){
			digts++;			
		}
		number = n;
		for(;number!=0; number/=10){
			remainder = number%10;
			result += Math.pow(remainder,digts);
		}

		if(result == n){System.out.println(n+" is an armstrong number.");}
		else {System.out.println(n+" is NOT an armstrong number.");}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong.isArmstrongNumber(153);
	}

}
