//Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
import java.util.Scanner;
class problem1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a integer:");
        int a =scan.nextInt();
        System.out.println("enter the string value");
        String b=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the char value");
        char c=scan.next().charAt(0);
    }
}