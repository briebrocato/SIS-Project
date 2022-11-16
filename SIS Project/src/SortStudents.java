import java.util.Scanner;

public class SortStudents
	{
		public static void sortRoster()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Sort Students");
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by period");
			int answer = userInput.nextInt();
			
			if(answer == 1)
				{
					sortLastName();
				}
			else if (answer == 2)
				{
					sortGPA();
				}
			else if(answer == 3)
				{
					sortPeriod();
				}
			


			}
		
		public static void sortLastName()
			{
				
			}
		
		public static void sortGPA()
			{
			CalculateGPA.calculate();
			}
		
		public static void sortPeriod()
			{
				
			}
		
		
	}
