
public class Palindrome {

	static boolean isPalindrome(String word){
		int k = 0;
		int j = word.length()-1;
		for(int i=k;i<j;){
			if(word.charAt(k)!= word.charAt(j)) {
				return false;
			}
			k+=1;
			j-=1; 		
		}
		return true;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = Palindrome.isPalindrome("racecar");
		if(ans) {System.out.println("Yes.");}
		else {System.out.println("No.");}
	}
}
