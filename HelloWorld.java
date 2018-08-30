import java.util.Scanner;
/**
 * @author Bobby Rockers
 * This is a very basic hello world class used as an exampl
 * @param none
 */
public class HelloWorld {
	// This is a single comment line
	public static void main(String[] args){
		int myAge = 42;
		char mySex = 'M';
		double myHeight = 5.7;
		String name;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hello CIS 2323 my name is Bob");
		System.out.println("I am " + myAge + " years old.");
		System.out.println("I am a " + mySex);
		System.out.print("My height is " + myHeight + "\n");
		/* 
		This is a multi-line comment 
		System.out.println("Got this far"); */
		System.out.println("What is your name?");
		name = inputDevice.nextLine();
		System.out.println("Hello " + name + " welcome to class.");
	}
}