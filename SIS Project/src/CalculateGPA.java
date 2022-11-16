import java.text.DecimalFormat;

public class CalculateGPA
	{
	public static void calculate()
		{
		
		double add = 0.00;
		String count = " ";
		
		
		for(int i = 0; i < Roster.roster.size(); i++)
			{
			String first = Roster.roster.get(i).getFirstPeriodGrade();
			String second = Roster.roster.get(i).getSecondPeriodGrade();
			String third = Roster.roster.get(i).getThirdPeriodGrade();
			for(int j = 0; j < 3; j++)
				{
					if(j == 0)
						{
						count = first;
						}
					else if(j == 1)
						{
						count = second;
						}
					else if(j == 2)
						{
						count = third;
						}
					
					 if (count.equals ("A+"))
						 {
						add+= 4.00;	 
						 }	
					 else if (count.equals("A"))
							{
							 add+= 3.67;	
							}
					else if (count.equals("A-"))
						{
						 add+= 3.33;	
						}
					else if (count.equals("B+"))
						{
						    add+= 3.00;
						}
					else if (count.equals("B"))
						{
						    add+= 2.67;
						}
					else if (count.equals ("B-"))
						{
						    add+= 2.33;
						}
					else if (count.equals("C+"))
						{
						    add+= 2.00;
						}
					else if (count.equals("C"))
						{
						    add+= 1.67;
						}
					else if (count.equals("C-"))
						{
						 add+= 1.33;	
						}
					else if (count.equals ("D+"))
						{
						  add+= 1.00;
						}
					else if (count.equals ("D"))
						{
						    add+= 0.67;
						}
					else if (count.equals("D-"))
						{
						 add+= 0.33;	
						}
					else if (count.equals ("F"))
						{
						    add+= 0;
						}
					else
						{
						    System.out.println ("Invalid first");
						}
				}
			double average = add/3;
			DecimalFormat d = new DecimalFormat("0.00");
			Roster.roster.get(i).setGpa(d.format(average));
			add = 0.00;
			}
	
	
	
		
		}
	
	}
	
	
	

	

			

						
		
				
				 
		
	
	
	
	
	
	
	

