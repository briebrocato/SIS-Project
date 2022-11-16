import java.io.IOException;
import java.util.Scanner;

public class ChangeGrade
	{
		static Scanner userStringInput = new Scanner(System.in);
	    static Scanner userIntInput=new Scanner(System.in);
		static int student =0; 
		public static void changeStudent()throws IOException
			{
				Roster.rosterFill();
				showRoster();

			}
		public static void showRoster()  
		    {
		        for (int i =0; i< Roster.roster.size(); i++)
		        {
		            System.out.println((i+1)+") "+ Roster.roster.get(i).getFirstName()+" "+Roster.roster.get(i).getLastName()+" "+Roster.roster.get(i).getGpa()+" "+Roster.roster.get(i).getFirstPeriod()+" "+Roster.roster.get(i).getFirstPeriodGrade()+" "+Roster.roster.get(i).getSecondPeriod()+" "+Roster.roster.get(i).getSecondPeriodGrade()+" "+Roster.roster.get(i).getThirdPeriod()+" "+Roster.roster.get(i).getThirdPeriodGrade());
		        }

		        student = userIntInput.nextInt();
		        if(student>Roster.roster.size())
		        {
		            showRoster();
		        }

		        System.out.println("");
		        choice();
		    }
		private static void choice()
			{
				int choiceChange=0;
				System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) Grades");
				System.out.println("2) Classes");
				choiceChange = userIntInput.nextInt();
				if(choiceChange==1)
					{
						changeGradesChoice();
					}
				else if(choiceChange==2)
					{
						changeClassesChoice();
					}
				else
					{
						choice();
					}
			}
		
		private static void changeGradesChoice()
			{
				int choiceGrades =0;
				System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) First Period Grades");
				System.out.println("2) Second Period Grades");
				System.out.println("3) Third Period Grades");
				choiceGrades = userIntInput.nextInt();
				if(choiceGrades==1)
					{
						changeFirstGrade();
					}
				else if(choiceGrades==2)
					{
						changeSecondGrade();
					}
				else if(choiceGrades==3)
					{
						changeThirdGrade();
					}
				else
					{
						changeGradesChoice();
					}
			}
		

		private static void changeFirstGrade()
			{
	            System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod()+" "+Roster.roster.get(student-1).getFirstPeriodGrade());
	            int changeGrade=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) A");
				System.out.println("2) A-");
				System.out.println("3) B+");
				System.out.println("4) B");
				System.out.println("5) B-");
				System.out.println("6) C+");
				System.out.println("7) C");
				System.out.println("8) C-");
				System.out.println("9) D+");
				System.out.println("10) D");
				System.out.println("11) D-");
				System.out.println("12) F");
				changeGrade = userIntInput.nextInt();
				if(changeGrade==1)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("A");
					}
				else if(changeGrade==2)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("A-");
					}
				else if(changeGrade==3)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("B+");
					}
				else if(changeGrade==4)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("B");
					}
				else if(changeGrade==5)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("B-");
					}
				else if(changeGrade==6)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("C+");
					}
				else if(changeGrade==7)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("C");
					}
				else if(changeGrade==8)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("C-");
					}
				else if(changeGrade==9)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("D+");
					}
				else if(changeGrade==10)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("D");
					}
				else if(changeGrade==11)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("D-");
					}
				else if(changeGrade==12)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("F");
					}
				for (int i =0; i< Roster.roster.size(); i++)
			        {
			            System.out.println(Roster.roster.get(i).getFirstName()+" "+Roster.roster.get(i).getLastName()+" "+Roster.roster.get(i).getGpa()+" "+Roster.roster.get(i).getFirstPeriod()+" "+Roster.roster.get(i).getFirstPeriodGrade()+" "+Roster.roster.get(i).getSecondPeriod()+" "+Roster.roster.get(i).getSecondPeriodGrade()+" "+Roster.roster.get(i).getThirdPeriod()+" "+Roster.roster.get(i).getThirdPeriodGrade());
			        }	
			}
		private static void changeSecondGrade()
			{
	            System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod()+" "+Roster.roster.get(student-1).getFirstPeriodGrade());
	            int changeGrade=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) A");
				System.out.println("2) A-");
				System.out.println("3) B+");
				System.out.println("4) B");
				System.out.println("5) B-");
				System.out.println("6) C+");
				System.out.println("7) C");
				System.out.println("8) C-");
				System.out.println("9) D+");
				System.out.println("10) D");
				System.out.println("11) D-");
				System.out.println("12) F");
				changeGrade = userIntInput.nextInt();
				if(changeGrade==1)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("A");
					}
				else if(changeGrade==2)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("A-");
					}
				else if(changeGrade==3)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("B+");
					}
				else if(changeGrade==4)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("B");
					}
				else if(changeGrade==5)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("B-");
					}
				else if(changeGrade==6)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("C+");
					}
				else if(changeGrade==7)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("C");
					}
				else if(changeGrade==8)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("C-");
					}
				else if(changeGrade==9)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("D+");
					}
				else if(changeGrade==10)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("D");
					}
				else if(changeGrade==11)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("D-");
					}
				else if(changeGrade==12)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("F");
					}
				for (int i =0; i< Roster.roster.size(); i++)
			        {
			            System.out.println(Roster.roster.get(i).getFirstName()+" "+Roster.roster.get(i).getLastName()+" "+Roster.roster.get(i).getGpa()+" "+Roster.roster.get(i).getFirstPeriod()+" "+Roster.roster.get(i).getFirstPeriodGrade()+" "+Roster.roster.get(i).getSecondPeriod()+" "+Roster.roster.get(i).getSecondPeriodGrade()+" "+Roster.roster.get(i).getThirdPeriod()+" "+Roster.roster.get(i).getThirdPeriodGrade());
			        }
				
			}
		private static void changeThirdGrade()
			{
	            System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod()+" "+Roster.roster.get(student-1).getFirstPeriodGrade());
	            int changeGrade=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) A");
				System.out.println("2) A-");
				System.out.println("3) B+");
				System.out.println("4) B");
				System.out.println("5) B-");
				System.out.println("6) C+");
				System.out.println("7) C");
				System.out.println("8) C-");
				System.out.println("9) D+");
				System.out.println("10) D");
				System.out.println("11) D-");
				System.out.println("12) F");
				changeGrade = userIntInput.nextInt();
				if(changeGrade==1)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("A");
					}
				else if(changeGrade==2)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("A-");
					}
				else if(changeGrade==3)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("B+");
					}
				else if(changeGrade==4)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("B");
					}
				else if(changeGrade==5)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("B-");
					}
				else if(changeGrade==6)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("C+");
					}
				else if(changeGrade==7)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("C");
					}
				else if(changeGrade==8)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("C-");
					}
				else if(changeGrade==9)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("D+");
					}
				else if(changeGrade==10)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("D");
					}
				else if(changeGrade==11)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("D-");
					}
				else if(changeGrade==12)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("F");
					}
				for (int i =0; i< Roster.roster.size(); i++)
			        {
			            System.out.println(Roster.roster.get(i).getFirstName()+" "+Roster.roster.get(i).getLastName()+" "+Roster.roster.get(i).getGpa()+" "+Roster.roster.get(i).getFirstPeriod()+" "+Roster.roster.get(i).getFirstPeriodGrade()+" "+Roster.roster.get(i).getSecondPeriod()+" "+Roster.roster.get(i).getSecondPeriodGrade()+" "+Roster.roster.get(i).getThirdPeriod()+" "+Roster.roster.get(i).getThirdPeriodGrade());
			        }
				
			}
		private static void changeClassesChoice()
			{
				int choiceClasses =0;
				System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) First Period ");
				System.out.println("2) Second Period ");
				System.out.println("3) Third Period ");
				choiceClasses = userIntInput.nextInt();
				if(choiceClasses==1)
					{
						changeFirstClass();
					}
				else if(choiceClasses==2)
					{
						changeSecondClass();
					}
				else if(choiceClasses==3)
					{
						changeThirdClass();
					}
				else
					{
						changeClassesChoice();
					}
				
			}
		private static void changeFirstClass()
			{
				System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod());
	            int changeClasses=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) Biology");
				System.out.println("2) English");
				System.out.println("3) Algebra");
				changeClasses = userIntInput.nextInt();
				if(changeClasses==1)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("Biology");
					}
				else if(changeClasses==2)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("English");
					}
				else if(changeClasses==3)
					{
						Roster.roster.get(student-1).setFirstPeriodGrade("Algebra");
					}
				
			}
		private static void changeSecondClass()
			{
				System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod());
	            int changeClasses=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) Biology");
				System.out.println("2) English");
				System.out.println("3) Algebra");
				changeClasses = userIntInput.nextInt();
				if(changeClasses==1)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("Biology");
					}
				else if(changeClasses==2)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("English");
					}
				else if(changeClasses==3)
					{
						Roster.roster.get(student-1).setSecondPeriodGrade("Algebra");
					}
				
			}
		private static void changeThirdClass()
			{
				System.out.println(Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName()+" "+Roster.roster.get(student-1).getFirstPeriod());
	            int changeClasses=0;
	            System.out.println("What Do you want to change about "+Roster.roster.get(student-1).getFirstName()+" "+Roster.roster.get(student-1).getLastName());
				System.out.println("1) Biology");
				System.out.println("2) English");
				System.out.println("3) Algebra");
				changeClasses = userIntInput.nextInt();
				if(changeClasses==1)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("Biology");
					}
				else if(changeClasses==2)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("English");
					}
				else if(changeClasses==3)
					{
						Roster.roster.get(student-1).setThirdPeriodGrade("Algebra");
					}
				for (int i =0; i< Roster.roster.size(); i++)
			        {
			            System.out.println(Roster.roster.get(i).getFirstName()+" "+Roster.roster.get(i).getLastName()+" "+Roster.roster.get(i).getGpa()+" "+Roster.roster.get(i).getFirstPeriod()+" "+Roster.roster.get(i).getFirstPeriodGrade()+" "+Roster.roster.get(i).getSecondPeriod()+" "+Roster.roster.get(i).getSecondPeriodGrade()+" "+Roster.roster.get(i).getThirdPeriod()+" "+Roster.roster.get(i).getThirdPeriodGrade());
			        }

			}

	}
