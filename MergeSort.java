import java.util.Arrays;

public class MergeSort {

    Boolean operation = true; // divide = true, add = false

    public static Boolean main(String args[]) {
      int[] myIntArray = {5, 4, 2, 1};

      sort(myIntArray);
    }

    private static void sort(int arr[]){
      // inital split on parsed array
      int left = new int[arr.length / 2]; // set up memory space
      int right = new int[arr.length / 2]; // set up memory space

      System.arraycopy(arr, 0, left, 0, arr.length / 2);
      System.arraycopy(arr, arr.length / 2, right, 0, arr.length / 2);

      //if(operation){
        //divide(left, right);
      //} else{
        // merge(); // recursion
      //}

      System.out.println("ran");
    }
}
