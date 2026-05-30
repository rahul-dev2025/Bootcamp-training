import java.util.Scanner;
public class removevowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vowel = "aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            char str3 = vowel.charAt(i);
            char str2 = str.charAt(i);

            if(vowel.indexOf(str2) !=-1){
                continue;

            }

            System.out.print(str2);
           }

    }


}
