package baekjun;

import java.util.Scanner;

public class Ex2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		String str = scan.nextLine();
		
		scan.close();
        
		int count = 0;
 
		for (int i = 0; i < str.length(); i++) {
 
			char ch = str.charAt(i);
 
			if(ch == 'c') {			
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {		
						i++;		
					}
					else if(str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}
		        
					else if(str.charAt(i + 1) == '-') {	
						i++;
					}
				}
			}
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	
						i++;
					}
				}
			}
		    
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	
						i++;
					}
				}
			}
 
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	
						i++;
					}
				}
			}
		    
			count++;
 
		}
 
		System.out.println(count);
		
	}
}
