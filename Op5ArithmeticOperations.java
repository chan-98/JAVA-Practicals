package LabThree;

//We need to import the Add, Sub, Multi, Div classes from package "LabThree"
//Since they're a handful, import the whole package!
//Remember the whole package LabThree consists of the Genetic Code class too!
//Next time don't create such complicated names, and create a whole another package!
//We'll be working with packages more and more so ***REMEMBER THIS***

import java.util.Scanner;
import LabThree.*;

public class Op5ArithmeticOperations {
	
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Arithmetic Operations");
		System.out.println("Enter 2 numbers : ");
		a = myInput.nextInt();		// make sure to use the same variables used in the other classes!
		b = myInput.nextInt();
		
		Op1AdditionClass add = new Op1AdditionClass();	//See! They're a handful!
		Op2SubtractionClass sub = new Op2SubtractionClass();
		Op3MultiplicationClass prod = new Op3MultiplicationClass();
		Op4DivisionClass div = new Op4DivisionClass();
		
		System.out.println("Sum: " +add.getNum(a,b));
		System.out.println("Difference: " +sub.getNum(a,b));
		System.out.println("Product: " +prod.getNum(a,b));
		System.out.println("Ratio: " +div.getNum(a,b));
		
		myInput.close();
	}


}
