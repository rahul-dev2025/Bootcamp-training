import java.util.Scanner;
public class lcs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        int count=0 , maxcount =0;
        for(int i=0;i<n;i++){
            if(i==0){
                count++;
            }
            else{

                 if(arr[i]>arr[i-1]){
                     count++;
                 }
                 else{
                     count=1;
                 }

            }


        }
        if(count>maxcount){
            maxcount=count;

            System.out.println(maxcount);
        }

    }


}
