//Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
//If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

//Input: 45 45 45

//Expected Output:
//Triangle cannot be formed

import java.util.Scanner;
class Problem2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Taking input for three angles
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();

        // Calculate the sum of angles
        int angleSum = angle1 + angle2 + angle3;

        // Check if the sum is 180
        if (angleSum == 180) {
            System.out.println("It forms a triangle");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
