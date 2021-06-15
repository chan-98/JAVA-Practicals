package LabOne;

public class ConcatenatedDNA {
	public static void main(String[] args) {
	    
		  // basically merging of 2 strings
		    
		        String dna1 = "ACGTTTAGCTCCGAT";
				String dna2 = "AATTCCGGCCTTAACCGG";
				String DNA;
				DNA = dna1.concat(dna2);
				System.out.println("DNA1: " +dna1+ "and its length is " +dna1.length());
				System.out.println("DNA2: " +dna2+ "and its length is " +dna2.length());
				System.out.println("Concated DNA Sequence: " +DNA+ "and its length is " +DNA.length());
		    
	}

}
