
import java.util.Scanner;
public class spiralmatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix size row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

        int minr = 0;
        int minc = 0;
        int maxc = c - 1;
        int maxr = r - 1;
        int td = r * c;
        int count = 0;

        while (td != count) {


            // top wall

            for(int i= minr ,  j=minc;j<=maxc ; j++){
                System.out.println(arr[i][j]);
                count++;


            }
            minr++;
            //right wall
            for(int j= maxc ,  i=minr;i<=maxr ; i++) {
                System.out.println(arr[i][j]);
                count++;

            }
            maxc--;
                //bottom wall
                for(int i= maxr ,  j=maxc;j>=minc ; j--) {
                    System.out.println(arr[i][j]);
                    count++;

                }
            maxr--;
                    //left wall

            for(int j= minc ,  i=maxr;i>=minr ; i--) {
                System.out.println(arr[i][j]);
                count++;

            }
            minc++;

            }
    }

}
