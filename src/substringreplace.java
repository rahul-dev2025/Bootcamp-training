import java.util.Scanner;
public class substringreplace {
    public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("enter the full name");
String name = sc.nextLine();
System.out.println("enter the student id");
String studentid = sc.nextLine();
String word[] = name.trim().split("\\s+");

String firstname = "";
String lastname = "";

//if(word.length>=1){
//    firstname = word[0].toLowerCase();
//
//}
//
//if(word.length>=2){
//    lastname = word[word.length-1].toLowerCase();
//
//}
        boolean ffound = false;
        for(String words :word){
            if(!ffound){
                firstname = words;
                ffound = true;
            }
            else{
                lastname = words;
            }
        }

String username = firstname + "_" + lastname + "@" + studentid;

System.out.println(username);
    }



}
