import java.util.Scanner;
public class countconsonent {

    public static void main(String[] args){

      Scanner sc= new Scanner(System.in);

      String str = sc.nextLine();
int count =0;
      char arr[] = str.toCharArray();
      for(char ch :arr) {

          if (ch>= 65 && ch<=122){

             if ( ch!='a'&&ch!='A'&&ch!='e'&&ch!='E'&&ch!='i'&&ch!='I'
                     &&ch!='o'&&ch!='O'&&ch!='u'&&ch!='U'){
                 count++;
             }

          }


      }
        System.out.println(count);
    }

}
