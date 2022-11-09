import java.util.Scanner;

public class SISRunner
	{

		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("What would you like to do?");	
			System.out.println("1) add or delete a student");
			System.out.println("2) change student grades/schedule");
			System.out.println("3) sort students");
			int response = userInput.nextInt();
			
			if(response == 1)
				{
				//Add/delete student
				}
			else if(response == 2) 
				{
				//change student
				}
			else if(response == 3)
				{
				//sort student
				}
			else
				{
				System.out.println("That was not an option.");
				}
			
			
			
			
				


			}

	}
