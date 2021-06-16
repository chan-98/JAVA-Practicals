package LabThree;

import java.util.Scanner;

import LabThree.GeneticCode;		//labthree package, genetic code class.

public class AAtoCodon {

	public static void main(String[] args) {
	
		Scanner myInput=new Scanner(System.in);
		System.out.println("Enter the single letter code of an amino acid :");
		String aa = myInput.nextLine();
		GeneticCode g=new GeneticCode();
		System.out.println("Codon : "+g.PrintCodon(aa));
		
		myInput.close();
	}

}