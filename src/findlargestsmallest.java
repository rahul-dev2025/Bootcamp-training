public class findlargestsmallest {

    public static void main(String [] args){

        int arr[] = { 23,45,21,4,5,7,6 };
        int smallest= arr[0];
        int largest = arr[0];
        for(int a=0;a<7;a++){

             //smallest = arr[0];

            if(smallest > arr[a]){

                smallest = arr[a];
            }

            if(largest<arr[a]){
                largest = arr[a];
            }

        }

        System.out.println(smallest);

        System.out.println(largest);
    }

}
