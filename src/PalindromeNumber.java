
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println(isPalindrome(x));

	}
	
	public static boolean isPalindrome(int x) {
		String temp = Integer.toString(x);

		char[] num = temp.toCharArray();
		
		int j = num.length;
		for(int i=0;i<=j/2 +1 ; i++) {
			if(j == 1)
				return true;
			if(num[i]==num[j - 1]) {
				j--;
			}
			else {
				return false;
			}
			
		}
		return true;
    }
}
