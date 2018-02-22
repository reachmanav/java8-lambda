package org.manav.lambda;

public class ClosureExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i+b));
	

	}

	private static void doProcess(int a, Process process) {
		process.process(a);		
	}

}

interface Process {
	void process(int i);
}