package com.vogella.ide.counter.util;

public class Counter {
	public int count (int x){
		if (x < 0 || x >= 255) {
			throw new RuntimeException("x should be between 1 and 255");
		}
		
		int counter = 0;
		for (int i = 1; i<= x; ++i) {
			counter +=i ;
		}
	    return counter;
	  }
}
