import java.util.Scanner;

public class DeleteStudent
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void deleteStudent() {
			
			System.out.println("Pick a Student to Delete: ");
			// lists students from another class
			
			System.out.println();
			System.out.println("Are you sure you want to delete +name+? (1) Yes (2) No" );
			int delete = userInput.nextInt();
			if(delete == 1) {
				// deletes
			}
			else if(delete == 2) {
				
				//Return
			}
			else {
				deleteStudent();
			}
		}
	}
