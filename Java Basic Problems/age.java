import java.util.Scanner;
class age{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if(age<13)
        {
            System.out.println("child");
        }
        else if(age>13 && age<=19)
        {
            System.out.println("teenager");
        }
        else if(age>=20 && age>20)
        {
            System.out.println("adult");
        }
        else if(age>=60)
        {
            System.out.println("senior citizen");
        }
        else if(age<0 || age>150)
        {
            System.out.println("invalid input");
        }
    }
}