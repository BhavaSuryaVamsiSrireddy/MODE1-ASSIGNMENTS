package com.main;

import com.logic.Aa;

public class OopExercises {

	public static void main(String[] args) {
		
        Aa objA = new Aa();
        System.out.println("in main(): ");
       // System.out.println("objA.a = "+objA.a); we cannot able to access the private variables outside the class.
       // objA.a = 222; we can access them only by getters and modify them by setters.
        System.out.println("objA.getA() = "+objA.getA());
        objA.setA(222);

	}

}
