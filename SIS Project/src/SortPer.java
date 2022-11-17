
import java.util.Comparator;

public class SortPer implements Comparator<Student> {
	 public int compare(Student studentOne, Student studentTwo) {
		 	if(studentOne.getFirstPeriod().equals(studentTwo.getFirstPeriod()))
			 	{
		 		if(studentOne.getSecondPeriod().equals(studentTwo.getSecondPeriod()))
				 	{
		 			if(studentOne.getThirdPeriod().equals(studentTwo.getThirdPeriod()))
				 		{	
		 				return studentOne.getFirstName().compareTo(studentTwo.getFirstName());
				 		}
		 			else
		 			{
		 				return studentOne.getThirdPeriod().compareTo(studentTwo.getThirdPeriod());
		 			}
				 	}
		 		else
			 		{
			 		return studentOne.getSecondPeriod().compareTo(studentTwo.getSecondPeriod());	
			 		}
		 			
			 
		 			
			 	}
		 	else
		 	{
		 		return studentOne.getFirstPeriod().compareTo(studentTwo.getFirstPeriod());
		 	}
		    
		  }
}
