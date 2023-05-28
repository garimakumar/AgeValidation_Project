package com.simplilearn;

public class AgeValidation {

	
	public String AgeValidation(int age) {
		
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "no right to vote";
		}
	}
}
