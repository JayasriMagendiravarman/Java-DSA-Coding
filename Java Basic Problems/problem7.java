import java.util.Scanner;
class problem7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first name");
        String firstname=scan.nextLine();
        System.out.println("enter the lastname");
        String lastname=scan.nextLine();
        System.out.println("enter the n value");
        int n=scan.nextInt();
        for(int i=1; i<=n; i=i+1)
        {
            System.out.println(firstname+lastname);
        }
    }
}
