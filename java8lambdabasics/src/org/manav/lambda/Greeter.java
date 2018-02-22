package org.manav.lambda;

public class Greeter {
	
	public void greet(Greeting greeting)  {
		greeting.perform();
	}

	public static void main(String[] args) {

		//Greeting normalGreeting = new HelloWorldGreeting();
		//normalGreeting.perform();

		Greeting lambdaGreeting =   () -> System.out.print("Hello World!!");
		
		Greeter greeter = new Greeter();
		greeter.greet(lambdaGreeting);
		
		

	}

}

