
public class Student
	{

		private String studentName;
		private String firstPeriod;
		private String firstPeriodGrade;
		private String secondPeriod;
		private String secondPeriodGrade;
		private String thirdPeriod;
		private String thirdPeriodGrade;
	    public Student (String sN, String fp, String fpg, String sp, String spg, String tp, String tpg)
	        {
	        	studentName=sN;
	        	firstPeriod=fp;
	        	firstPeriodGrade=fpg;
	        	secondPeriod=sp;
	        	secondPeriodGrade=spg;
	        	thirdPeriod=tp;
	        	thirdPeriodGrade=tpg;
	        }
	    public String getStudentName()
	        {
	        return studentName;
	        }
	    public void setStudentName(String studentName)
	        {
	        this.studentName = studentName;
	        }
	    public String getFirstPeriod()
	        {
	        return firstPeriod;
	        }
	    public void setFirstPeriod(String firstPeriod)
	        {
	        this.firstPeriod = firstPeriod;
	        }
	    public String getSecondPeriod()
	        {
	        	
	        return secondPeriod;
	        }
	    public void setSecondPeriod(String secondPeriod)
	        {
	        this.secondPeriod = secondPeriod;
	        }
	    public String getThirdPeriod()
	        {
	        return thirdPeriod;
	        }
	    public void setThirdPeriod(String thirdPeriod)
	        {
	        this.thirdPeriod = thirdPeriod;
	        }
	}
