package LabOne;

public class ArrayAverage {
	  public static void main(String[] args) {
	        // create a double array of 10 elements and find its average
	        double array3[]= {11, 23, 2, 65, 15, 19, 43, 55, 40, 32};
	        double s=0,average=0;
			for(int i=0;i<10;i++)
			{
				s=s+array3[i];
			}
	        System.out.println("Sum of all the elements is: " +s);
			average = s/10;
			System.out.println("Average of all the elements is:" +average);
	    
	  }

}
