import java.util.Scanner;
public class replacecharacter {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
System.out.println("enter the word String");
        String word = sc.nextLine();
        System.out.println("enter the pattern");
        String pattern = sc.nextLine();
        System.out.println("enter the replacemment");
        char  temp = sc.nextLine().charAt(0);
        int i=0;
        StringBuilder result = new StringBuilder();
        while(i<word.length()){
            boolean match = true;

            for(int j=0; j<pattern.length();j++){


                if(i+j >= word.length() || word.charAt(i+j)!=pattern.charAt(j)){
                    match = false;
                    break;
                }
            }

            if(match){

                result.append(temp);
                i+=pattern.length();
            }
            else{
                result.append(word.charAt(i));
                i++;


            }



        }

        System.out.println(result);


    }



}
