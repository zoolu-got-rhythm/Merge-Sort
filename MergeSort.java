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


    private static void divide(int oldLeft[], int oldRight[]){
      left = new int[oldLeft.length / 2];
      right = new int[oldRight.length / 2];

      //for (int i = 0; i < arr.length; i++) {

        // copy second half of an array and put into a new one.

        System.arraycopy(arr, 0, left, 0, arr1.length / 2);
        System.arraycopy(arr2, arr2.length / 2, right, 0, arr2.length / 2);

      //}
      System.out.println("left: " + Arrays.toString(left));
      System.out.println("right: " + Arrays.toString(right));

      if(left.length == 1) operation = false;

      divide(left, right); // recursion

    }
}

// copy, duplicate, check if divisible by 2, check if greater than 1
