package programmers;

public class reverseString {

	public static void main(String[] args) {          
		String str = "Jason";              
		StringBuffer sb = new StringBuffer(str);        
		String reverse = sb.reverse().toString();                
		System.out.println(reverse);
	}
}
