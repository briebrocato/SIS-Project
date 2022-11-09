import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Roster
	{
		static public ArrayList <Student> roster = new ArrayList <Student>();
		public void rosterFill() throws IOException
			{
				String firstName;
				String lastName;
				String firstPeriod;
				String firstPeriodGrade;
				String secondPeriod;
				String secondPeriodGrade;
				String thirdPeriod;
				String thirdPeriodGrade;
				Scanner file = new Scanner(new File( "StudentData" ));
				while(file.hasNext())
					{
						firstName=file.next();
						lastName=file.next();
						firstPeriod=file.next();
						firstPeriodGrade=file.next();
						secondPeriod=file.next();
						secondPeriodGrade=file.next();
						thirdPeriod=file.next();
						thirdPeriodGrade=file.next();
						roster.add(new Student (firstName, lastName,firstPeriod,firstPeriodGrade,secondPeriod,secondPeriodGrade,thirdPeriod,thirdPeriodGrade));
					}
				
			}

	}
