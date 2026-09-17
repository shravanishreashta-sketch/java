 import java.util.Scanner;
  public class voters {
    public static void main (String[]args)
    

{ Scanner obj =new Scanner (System.in);
    System.out.println ("enter the name of voter:");
    String name =obj. nextLine ();
    System.out.println("enter the age of the voter:");
    int age = obj.nextInt() ;
    if (age>18){
        System.out.println(name+"is eligible to vote,beacause his age is"+age);
    }
    else{
        System.out.println(name+"is not eligible to vote ,because his age is"+age);
    }

}
} 
    

