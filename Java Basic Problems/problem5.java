//Write a program which takes two values x and y. Prints x for y number of times.

//Input:

//2 

//3

//Expected Output

//2

//2

//2


import java.util.Scanner;
class problem5{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        for(int i=1; i<=y; i=i+1)
        {
            System.out.println(x);
        }
        
    }
}