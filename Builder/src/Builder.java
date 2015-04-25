/**
Requirements:
	- Create a class called Builder.
	- Using the StringBuilder class, write a program which will accept a string from the keyboard, “Java is fun!”
	- Your program must determine and display the capacity of the string.
	- Append a second string, “I love it!” to the first string.
	- Require the user to enter a string “Yes, “
	- Insert the string, “Yes ” at the correct location, such that the output of the entire string will be “Java is fun. Yes, I love it!”
	- Display your output using clear and appropriate messages.
	- Document each statement concisely.
	- Save your complete console output to a text file to turn in with this assignment.
	- Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
 */
import java.util.Scanner;
public class Builder 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner keyboard = new Scanner(System.in);
		//user is prompted to type this string exactly as shown
		
		String answer = "\"Yes, \"";
		
		String javaFun = "Java is fun!";
		//java is fun string initialized and is given the length
		
		System.out.println("String: \""  + javaFun + "\"\nString length:\t\t"+javaFun.length());
				 
		StringBuilder newJavaFun = new StringBuilder(javaFun);
		//object is made to append and insert
		 
		System.out.println("String capacity:\t" + newJavaFun.capacity());
		//capacity given
		
		Thread.sleep(1000);
		 
		newJavaFun.append(" I Love It!");		
		//object appended
		
		System.out.println("\n\nEnter the string " + answer );
		System.out.println("Exactly as it says.");
		//prompts user to enter "Yes, " exactly including spaces and quotation marks
		String input = keyboard.nextLine();
		
		//While loop keeps asking user to enter it exactly until answer is correct
		while (!(input.equals(answer)))
		{
			System.out.println("Wrong.");
			Thread.sleep(1000);
			System.out.println("Here is the difference:");
			System.out.println("\nExpected \tYour entry");
			System.out.println(answer + "\t\t" + "\"" + input + "\"");
			Thread.sleep(2000);
			System.out.println("\n\nLet's try again.");
			System.out.println("Exactly as it says.");
			input = keyboard.nextLine();
		}
		//input is inserted between the two strings at the length value of the string
		
		Thread.sleep(1000);
		newJavaFun.insert(javaFun.length(),input);
		System.out.println(newJavaFun);		
	}
}