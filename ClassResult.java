package LabOne;

public class ClassResult {
		  public static void main(String[] args) {
		    
				int english=54;
				int phyed=39;
				int maths=47;
				int sci=67;
				int socsci=88;
				int total=(english+phyed+maths+sci+socsci);
				float percentage=total/5f;
				if(percentage>50)
				{
					System.out.println("Pass");
				}	
				else
				{
					System.out.println("Fail");
				}  
		    
		  }
}
