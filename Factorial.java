
public class Factorial {

	static void factorial(int n){
		int ans=1;
		for(int i=1;i<=n;i++){
			if(n==0){
				System.out.println(ans);
				break;
				}
			ans=ans*i;			
		}
		System.out.println(ans);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial.factorial(5);
	}

}
