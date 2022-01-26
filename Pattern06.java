
public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				if((i==1||i==2||i==3)&&(j==1||j==2||j==3)){
					System.out.print(" ");
					continue;
					}
				if((i==1||i==2||i==3)&&(j==4)){
					System.out.print("@");
					continue;
					}
				System.out.print("@");
			}
			System.out.println();
		}
	}

}

