package com.promineotech;

import java.util.*;


public class TestDemo {
int a;
int b;
static int random;


	public int addPositive(int a, int b) {
		if (b > 0) {
			int answer = a+b;
			return answer;
	    }else {
	    	System.out.println("Both parameters must be positive"); 
            throw new IllegalArgumentException();
		}
		
}
	
	
	public static int randomNumberSquared() {
		getRandomInt();
		try {
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return random * random;
		
		}

static int getRandomInt() {
	Random random = new Random();
	return random.nextInt(10)+1;
		}
}
	