package LabTwo;
import java.util.Scanner;
public class NameReverse {
    static Scanner scObj = new Scanner(System.in);

    static void NameRev(String name){					
//this is how you declare and program a function. check cpp notes.
        for(int i = (name.length()-1) ; i >= 0; i--)
            System.out.print(name.charAt(i));
    }

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scObj.nextLine();

        NameRev(name);
    }

}
