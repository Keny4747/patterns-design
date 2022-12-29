package com.pruebas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class Operator {
	public static IntBinaryOperator binaryOperator = (x, y) -> {
		return Integer.max(x, y);
	};

	public static final String PREFIX = "__pref__";
	public static final String SUFFIX = "__suff__";

	public static UnaryOperator<String> operator = s -> {
		return PREFIX + s.trim() + SUFFIX;
	};

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x >y;
		
		boolean valid = isDivisible.apply(12,33);
		System.out.println(valid);
		
		//Function<String, Integer> adder1 = x->x.length();
		printResultOfLambda(x->x.length());
		BiFunction<Integer, Integer, Integer> max = Math::max;
		int mas=max.apply(50, 70);
		System.out.println(mas);
		
	}
	
	public static void printResultOfLambda(Function<String, Integer> function) {
	    System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
	}
}
