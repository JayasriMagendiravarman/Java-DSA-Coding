//Write a program to take x and print multiples of x till 1000.

//Input:

//100

//Expected Output:

//100

//200

//300

//400

//500

//600

//700

//800

//900

//1000
import java.util.Scanner;
class problem6{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the input");
        int x=scan.nextInt();
        for(int i=x; i<=1000; i=i+100)
        {
          System.out.println(i);
            
        }

    }
}