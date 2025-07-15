import java.util.Scanner;

/* int : nextInt ; string : nextLine */

public class BasicDetails {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("The Basic Details of the user are as written below : \n");

    System.out.println("Enter your name: ");
    String name=sc.nextLine();
    System.out.println("Your name is : "+name);

    System.out.println("Enter your rollno: ");
    long rollno=sc.nextLong();
    System.out.println("Your roll no is: "+rollno);

    System.out.println("Enter your branch: ");
    String branch=sc.nextLine();
    sc.nextLine();
    System.out.println("Your branch is: "+branch);

    System.out.println("Enter your email: ");
    String email=sc.nextLine();
    System.out.println("Your email is:  "+email);

    System.out.println("Enter your College Name: ");
    String college=sc.nextLine();
    System.out.println("Your college name is: "+college);

    System.out.println("Enter your address: ");
    String address=sc.nextLine();
    System.out.println("Your address is : "+address);

    }




}