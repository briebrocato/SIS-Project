import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Roster
	{
		static public ArrayList <Student> roster = new ArrayList <Student>();
		public static void rosterFill() throws IOException
			{
				String firstName;
				String lastName;
				double gpa;
				String firstPeriod;
				String firstPeriodGrade;
				String secondPeriod;
				String secondPeriodGrade;
				String thirdPeriod;
				String thirdPeriodGrade;
				Scanner file = new Scanner(new File("studentData.txt"));
				while(file.hasNext())
					{
						firstName=file.next();
						lastName=file.next();
						 gpa = 0.0;
						firstPeriod=file.next();
						firstPeriodGrade=file.next();
						secondPeriod=file.next();
						secondPeriodGrade=file.next();
						thirdPeriod=file.next();
						thirdPeriodGrade=file.next();
						roster.add(new Student (firstName, lastName,gpa,firstPeriod,firstPeriodGrade,secondPeriod,secondPeriodGrade,thirdPeriod,thirdPeriodGrade));
					}
				
			}

	}
