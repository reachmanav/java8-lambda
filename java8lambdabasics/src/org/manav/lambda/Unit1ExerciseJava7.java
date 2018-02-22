package org.manav.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {

	//public void sortList
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("Manav","Shah",33),
				new Person("Dhaval","Chini",18),
				new Person("Dabal","Chaman",28),
				new Person("Puja","Shikhare",34)
		);
		
		
		
		//Step 1:Sort
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
				
		// Step 2: Call a method which will print the list
		printConditionally(people, new Condition()  {

			@Override
			public boolean printSelective(Person p) {
				return true;
			}
			
		});
		
		//Step 3: Print only those people whose last name begins with "C" 
		System.out.println("-----------------------------------------------------");
		System.out.println("Printing all persons with last name beginning as C");
		System.out.println("-----------------------------------------------------");
		
		printConditionally(people, new Condition()  {
			@Override
				public boolean printSelective(Person p) {
					return p.getLastName().startsWith("C");
				}					
			});		
		
		
		//Step 4: Print only those people whose First name begins with "M" 
		System.out.println("-----------------------------------------------------");
		System.out.println("Printing all persons with first name beginning as M");
		System.out.println("-----------------------------------------------------");

				printConditionally(people, new Condition()  {

					@Override
					public boolean printSelective(Person p) {
						return p.getFirstName().startsWith("M");
					}					
				});		
	}

	
	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person onePerson:people)  {
			if (condition.printSelective(onePerson))  {
				System.out.println(onePerson);
			}
		}
	}
		

}

interface Condition {
	
	public boolean printSelective(Person p);
}
