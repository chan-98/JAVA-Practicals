package LabTwo;

public class Fibonacci {
	 public static void main(String args[]) {
		  long first=0;
		  long ini=1;
		  long next;
		  long end=50;
		  
		  System.out.print(first+" \n "+ini);
		  for(int i=2; i<end; i++)
		  {
		   next = ini + first;
		   System.out.print("\n" +next);
		   first = ini;
		   ini = next;
		  }
		 }

}
