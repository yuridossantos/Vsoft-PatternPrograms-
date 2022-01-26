
public class FibonaciSeries {

	static void fibonaci(int n){
		int firstNumber=0;
		int secondNumber=1;
		
		for(int i=1;i<=n;i++) {
			int nextNumber=0;
			System.out.print(firstNumber + " ");
			nextNumber = firstNumber + secondNumber; 
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonaciSeries.fibonaci(5);
	}

}
