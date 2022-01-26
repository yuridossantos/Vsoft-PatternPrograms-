
public class PrimeNumber {


	static void checkPrime(int num){  
		boolean flag=true;      

		if(num<=1){  
			System.out.println(num+" is not a prime number");      
		}

		else{  
			for(int i=2;i<=num/2;i++){      
				if(num%i==0){      
					System.out.println(num+" is not a prime number");      
					flag=false;      
					break;      
				}      
			}      
			if(flag){ System.out.println(num+" is a prime number"); }  
		}
	}
	public static void main(String[] args) {
		PrimeNumber.checkPrime(19);		
	}		  
}

