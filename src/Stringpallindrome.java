
import java.util.Scanner;
public class Stringpallindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseword = "";

         for(int i=str.length()-1;i>=0;i--){

          char     str2 = str.charAt(i);

             reverseword += str2;

         }

         if(str.equals(reverseword)){
             System.out.println("the string is pallindrome");

         }

         else{
             System.out.println("not pallindrome");
         }


    }


}
