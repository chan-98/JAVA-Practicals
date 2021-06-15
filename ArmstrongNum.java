package LabTwo;
    import java.util.Scanner;
public class ArmstrongNum {
    static Scanner scObj = new Scanner(System.in);

    static void ArmstCheck(int num){

        int[] dec = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int buff = num;

        short i;
        for(i = 0; buff != 0 ; i++){
            dec[i] = buff%10;
            buff /= 10;
        }

        int answer = 0;
        for (int j : dec){
            answer += power(j, i);
        }

        if(num == answer)
            System.out.println(+ num + " is an Armstrong number");
        else
            System.out.println(+ num + " is not an Armstrong number");

    }

    static int power(int b, int p){

        int cube = 1;
        for(short i = 0; i < p; i++)
            cube *= b;

        return cube;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int num = scObj.nextInt();

        ArmstCheck(num);

    }

}
