
import java.util.Comparator;

public class SortName implements Comparator<Student> {
	 public int compare(Student studentOne, Student studentTwo) {
		 	if(studentOne.getLastName().equals(studentTwo.getLastName()))
			 	{
		 		return studentOne.getFirstName().compareTo(studentTwo.getFirstName());	
			 	}
		 	else
		 	{
		 		return studentOne.getLastName().compareTo(studentTwo.getLastName());
		 	}
		    
		  }
}
