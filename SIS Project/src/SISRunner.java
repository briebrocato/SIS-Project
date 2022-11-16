import java.io.IOException;
import java.util.Scanner;

public class SISRunner
	{
		static Scanner userStringInput = new Scanner(System.in);
	    static Scanner userIntInput=new Scanner(System.in);
		public static void main(String[] args) throws IOException

			{
				
			Roster.rosterFill();
			
			System.out.println("What would you like to do?");
			System.out.println("1) add or delete a student");
			System.out.println("2) change student grades/schedule");
			System.out.println("3) sort students");
			int number = userIntInput.nextInt();
			
			if(number == 1)
				{
					AddStudent.menu();
				}
			else if (number == 2)
				{
					ChangeGrade.changeStudent();
				}
			else if(number == 3)
				{
				SortStudents.sortRoster();
				}
				
			
			
				
				
			
//				Main Menu
//				What would you like to do?
//				add or delete a student
//				change student grades/schedule
//				sort students
	
				



			}
}

