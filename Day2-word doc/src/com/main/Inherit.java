package com.main;

import com.logic.a;
import com.logic.b;

public class Inherit {

	public static void main(String[] args) {
		
		b objectOfb = new b();
		a objectOfa = new a();
		
		objectOfa.displayInA();
		objectOfb.displayInA();
		objectOfb.displayInB();
	}

}
