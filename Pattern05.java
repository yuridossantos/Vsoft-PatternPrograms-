
public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		for(int i=0;i<5;i++){
			for(int j=k;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
			k-=1;
		}
	}

}

