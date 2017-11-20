package recursion;

public class Palindrome {
	
	public boolean isPalindrome(String str){
		if(str.length()<2)
		return true;
		if(str.charAt(0)!=str.charAt(str.length()-1)){
			return false;
		}
		else{
			return isPalindrome(str.substring(1,str.length()-1));
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		System.out.println(pal.isPalindrome("nayan"));
	}

}
