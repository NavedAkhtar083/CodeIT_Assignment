import java.util.Scanner;
public class Reverse_string
{

    public static void main(String[] args) 
    {
     String rev=" ";
     Scanner scn =new Scanner(System.in);
     System.out.print("Enter the String: ");
     String str =scn.nextLine();
     System.out.println();
     
     for(int i=str.length()-1; i>=0 ;i--)
        {
         rev = rev + str.charAt(i);
        }
     System.out.println("Reversed String is :" +rev);
     
    }
    
}
