//Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
//If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

//Input: 45 45 45

//Expected Output:
//Triangle cannot be formed

import java.util.Scanner;
class problem2{
    public static void main(String args[]){
        int angle=0;
        Scanner scan=new Scanner(System.in);
        int angle1=scan.nextInt();
        int angle2=scan.nextInt();
        int angle3=scan.nextInt();
        if(angle==180)
        {
            System.out.println("it forms a triangle");
        }
        else
        {
            System.out.println("Triangle cannot be formed");
        }
    }
}