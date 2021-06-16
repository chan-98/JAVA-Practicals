package LabThree;

public class GeneticCode {

	String aa;
	public String PrintCodon(String aa) //PrintCodon is the method (function) defined as:
	{
		String str="";		//need to give null "" because single char string
		if(aa.equalsIgnoreCase("F"))   
		{
			str="UUU/UUC";
		}
		else if(aa.equalsIgnoreCase("L"))
		{
			str="UUA/UUG/CUU/CUC/CUA/CUG";
		}
		else if(aa.equalsIgnoreCase("I"))
		{
			str="AUU/AUC/AUA";
		}
		else if(aa.equalsIgnoreCase("M"))
		{
			str="AUG";
		}
		else if(aa.equalsIgnoreCase("V"))
		{
			str="GUU/GUC/GUA/GUG";
		}
		else if(aa.equalsIgnoreCase("S"))
		{
			str="UCU/UCC/UCA/UCG";
		}
		else if(aa.equalsIgnoreCase("P"))
		{
			str="CCU/CCA/CCG/CCC";
		}
		else if(aa.equalsIgnoreCase("T"))
		{
			str="ACU/ACC/ACG/ACA";
		}
		else if(aa.equalsIgnoreCase("A"))
		{
			str="GCU/GCC/GCA/GCG";
		}
		else if(aa.equalsIgnoreCase("Y"))
		{
			str="UAU/UAC";
		}
		else if(aa.equalsIgnoreCase("H"))
		{
			str="CAU/CAC";
		}
		else if(aa.equalsIgnoreCase("Q"))
		{
			str="CAA/CAG";
		}
		else if(aa.equalsIgnoreCase("N"))
		{
			str="AAU/AAC";
		}
		else if(aa.equalsIgnoreCase("K"))
		{
			str="AAA/AAG";
		}
		else if(aa.equalsIgnoreCase("D"))
		{
			str="GAU/GAC";
		}
		else if(aa.equalsIgnoreCase("E"))
		{
			str="GAA/GAG";
		}
		else if(aa.equalsIgnoreCase("C"))
		{
			str="UGU/UGC";
		}
		else if(aa.equalsIgnoreCase("W"))
		{
			str="UGG";
		}
		else if(aa.equalsIgnoreCase("R"))
		{
			str="CGU/CGC/CGA/CGG";
		}
		else if(aa.equalsIgnoreCase("S"))
		{
			str="AGU/AGC";
		}
		else if(aa.equalsIgnoreCase("R"))
		{
			str="AGA/AGG";
		}
		else if(aa.equalsIgnoreCase("G"))
		{
			str="GGU/GGA/GGC/GGG";
		}
		return str;
		
		//stringName.equalsIgnoreCase compares 2 strings without having to convert toUpper or toLower.
		//Can use switch cases also but need to give multiple for lower and upper or convert toUpper,
		//not sure if its possible to compare strings in switch.
	}
}
