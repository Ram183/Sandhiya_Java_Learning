package com.operator;

public class Unary_Operators {

	public static void main(String[] args) {

		/*
		 * Unary_Operators
		 * 
		 * postfix expr++ expr-- prefix ++expr --expr +expr -expr ~ !
		 * 
		 * 
		 */

		double number = 7.7;
		boolean flag = false;

		System.out.println("+number = " + (+number));

		System.out.println("-number = " + (-number));

		System.out.println("number = " + (++number));

		System.out.println("number = " + (--number));

		System.out.println("!flag = " + (!flag));

	}

}
