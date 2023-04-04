package controller;

import br.edu.fateczl.StringStack;

public class PalindromeController {
	
	public PalindromeController() {
		super();
	}
	
	public Boolean isPalindrome(String s) {
		if (s.intern() == reverseString(s).intern()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private String reverseString(String s) {
		StringStack stack = new StringStack();
		int sLegth = s.length();
		String reverseS = "";
		
		for (int i = 0; i < sLegth; i++) {
			stack.push(String.valueOf(s.charAt(i)));
		}
		
		while (!stack.isEmpty()) {
			reverseS += stack.pop();
		}
		
		return reverseS;
		
	}
	
}
