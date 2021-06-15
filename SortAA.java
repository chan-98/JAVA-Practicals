package LabOne;
import java.util.Arrays;
public class SortAA {

	public static void main(String[] args) {
		String[] aa={"Tyrosine","Arginine","Serine","Asparagine","Phenylalanine","Cysteine", "Glutamine","Valine","Glutamic acid","Alanine","Glycine","Histidine","Isoleucine","Leucine","Lysine","Methionine","Proline","Aspartic acid","Threonine","Tryptophan"};
		System.out.println("Array before sorting: "+Arrays.toString(aa));
		Arrays.sort(aa);
		System.out.print("Array after sorting: "+Arrays.toString(aa));
	}

}
