package org.manav.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {


		int [] someNumbers = {1,2,3,4};
		int key = 2;
		
		process(someNumbers,key, (Integer a, Integer b)  -> System.out.println(a.intValue()+b.intValue()) );

	}
	
	public static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer)  {
	
		for (int i:someNumbers)  {
			biConsumer.accept(new Integer(i), new Integer(key));
		}
	
	}

}
