
import java.util.Comparator;

public class SortGPA implements Comparator<Student> {
	 public int compare(Student studentOne, Student studentTwo) {
		 	if(studentOne.getGpa().equals(studentTwo.getGpa()))
			 	{
		 		return studentOne.getFirstName().compareTo(studentTwo.getFirstName());	
			 	}
		 	else
		 	{
		 		return studentOne.getGpa().compareTo(studentTwo.getGpa());
		 	}
		    
		  }
}
