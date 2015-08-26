import java.util.Scanner;
public class DivingRightIn {

	public static void main(String[] args) {
		Scanner question = new Scanner(System.in);
	
		System.out.println("What is your name?");
		String name = question.nextLine();
		System.out.println("Hello, " + name + ". My name is Jarvis. Nice to meet you");
		
		System.out.println("What year were you born in?");
		int year = question.nextInt();
		System.out.println("Thank you. How old does that make you?");
		int age = question.nextInt();
		if (age<17)
			System.out.println("Awesome! Be careful when you start driving.");
		else if (age==17)
			System.out.println("Wow! Me too.");
		else 
			System.out.println("You're really old.");
		
		for (int i = 0; i<=age; i++)
			if (i==1)
				System.out.println("In " + (year+i) + " you were 1 year old." );
			else 
				System.out.println("In " + (year+i) + " you were " + i + " years old." );
		
		
		System.out.println("You are " + (age*7) + " years old in dog years.");
		
		question.close();
		

	}

}
