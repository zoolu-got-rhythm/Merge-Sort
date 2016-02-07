import java.util.Arrays;

public class MergeSort {

    public static Boolean operation = true; // divide = true, add = false

    public static void main(String args[]) {
      int[] myIntArray = {5, 4, 2, 1, 8, 3, 7, 9};
      
      sort(myIntArray);
    }

    public static void sort(int arr[]){
      // inital split on parsed array
      int[] left = new int[arr.length / 2]; // set up memory space
      int[] right = new int[arr.length / 2]; // set up memory space

      System.arraycopy(arr, 0, left, 0, arr.length / 2);
      System.arraycopy(arr, arr.length / 2, right, 0, arr.length / 2);

      // if(operation){
         divide(left, right);
      // }
      //else{
        // merge(); // recursion
      //}

      System.out.println("left: " + Arrays.toString(left));
      System.out.println("right: " + Arrays.toString(right));

    }

    public static void divide(int oldLeft[], int oldRight[]){
      int[] left = new int[oldLeft.length / 2];
      int[] right = new int[oldRight.length / 2];

        System.arraycopy(oldLeft, 0, left, 0, oldLeft.length / 2);
        System.arraycopy(oldRight, oldRight.length / 2, right, 0, oldRight.length / 2);

      System.out.println("left: " + Arrays.toString(left));
      System.out.println("right: " + Arrays.toString(right));

      if(left.length != 1){
        divide(left, right); // recursion
      } else{
        operation = false;
      }



    }

}
