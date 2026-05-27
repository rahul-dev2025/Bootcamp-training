public class deletesmallarrayelem {

  public static void main(String[] args){

      int arr[] = {4,5,2,8,6,7};
int k=0;
      int small= arr[0];
      for(int i=0;i<arr.length;i++){

          if(small > arr[i]){

              small= arr[i];

              k=i;
          }

      }

      for(int i =0;i<arr.length;i++){

          if(k==i){

              continue;
          }
          else{

              System.out.println(arr[i]);
          }


      }


  }


}
