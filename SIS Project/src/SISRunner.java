
public class SISRunner
	{

		static String category = "";

		static int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8},
					{6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 0}, {2, 5, 1, 7, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};

					    public static void main(String[] args) {
					    maximumNumber();
					    minimumNumber();
					    average();
					    }
					     public static void maximumNumber()
					     {
					         int largestNumber=0;
					         for(int row = 0; row < myArray.length; row++)	
					        {
							for(int col =0; col < myArray[0].length; col++)
								{
								if(myArray[row][col]>largestNumber)
					                {
					                    largestNumber =myArray[row][col];
					                }
								}
							}
					        System.out.println("The largest number is"+largestNumber);
					     }
					     public static void minimumNumber()
					     {
					         int smallestNumber=0;
					         for(int row = 0; row < myArray.length; row++)	
					        {
							for(int col =0; col < myArray[0].length; col++)
								{
								if(myArray[row][col]<smallestNumber)
					                {
					                    smallestNumber=myArray[row][col];
					                }
								}
							}
					        System.out.println("The minium number is"+smallestNumber);
					     }
					     public static void average()
					     {
					         double average=0;
					         for(int row = 0; row < myArray.length; row++)	
					        {
							for(int col =0; col < myArray[0].length; col++)
								{
								
					                    average =average+myArray[row][col];
					                
								}
							}
					        average=average/(myArray.length*myArray[0].length);
					        System.out.println("The average is "+average);
					     }
	}
