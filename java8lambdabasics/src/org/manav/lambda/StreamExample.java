package org.manav.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {


		List<Person> people = Arrays.asList(
				new Person("Manav","Shah",33),
				new Person("Dhaval","Chini",18),
				new Person("Dabal","Chaman",28),
				new Person("Puja","Shikhare",34)
		);
		
		
		System.out.println(people.stream().findFirst()); 
		System.out.println("-------------");
		
		//System.out.println(people.stream().filter(p -> p.getLastName().startsWith("C")));
		
		people.stream()
			  .filter(p -> p.getLastName().startsWith("C"))
			  .forEach(p-> System.out.println(p));
		
		System.out.println("-------------");
		
		System.out.println(people.stream()
		  .filter(p -> p.getLastName().startsWith("C"))
		  .count());
		
		
		System.out.println("---Sorting based on comparator----------");
		people.stream()
		  .filter(p -> p.getLastName().startsWith("C"))
		  .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))		  
		  .forEach(p-> System.out.println(p));
		
		
		
	}

}
