package com.simplilearn;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeValidCase {

	//TestCase1
	@Test
	public void test1() {

		    //EO and AO are tested
           	AgeValidation agevalid=new AgeValidation();
           	assertEquals("right to vote",agevalid.AgeValidation(10));
           	
	}
	
	//TestCase2
		@Test
		public void test2() {

			    //EO and AO are tested
	           	AgeValidation agevalid=new AgeValidation();
	           	assertEquals("no right to vote",agevalid.AgeValidation(15));
	           	
		}

}
