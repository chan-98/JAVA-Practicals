package LabTwo;
import java.util.Scanner;
public class CaseChange {
    static Scanner scObj = new Scanner(System.in);

    static void toUpper(String text){
        System.out.println(text.toUpperCase());
    }

    static void toLower(String text){
        System.out.println(text.toLowerCase());
    }

    public static void main(String[] args) {

        System.out.print("Enter a text to change its case: ");
        String text = scObj.nextLine();

        System.out.print("Enter the case to which you want to convert to - 'Lower' or 'Upper': ");
        String caSe = scObj.nextLine();

        switch(caSe){
            case "Upper": 
                toUpper(text);
            break;

            case "Lower":
                toLower(text);
            break;

            default:
                System.out.println("Invalid case.\nTry re-running.");
        }

    }

}
