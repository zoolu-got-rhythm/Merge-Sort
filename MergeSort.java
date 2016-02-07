import java.util.Arrays;

public class MergeSort {

    public static Boolean operation = true; // divide = true, add = false

    public static void main(String args[]) {
      int[] myIntArray = {5, 4, 2, 1, 8, 3, 7, 9};

      sort(myIntArray);
    }

    public static void sort(int arr[]){
      System.out.println("parsed array is: " + Arrays.toString(arr));
      // inital split on parsed array
      int[] left = new int[arr.length / 2]; // set up memory space
      int[] right = new int[arr.length / 2]; // set up memory space

      System.arraycopy(arr, 0, left, 0, arr.length / 2);
      System.arraycopy(arr, arr.length / 2, right, 0, arr.length / 2);

      System.out.println("left: " + Arrays.toString(left));
      System.out.println("right: " + Arrays.toString(right));

      // if(operation){
         divide(left, right);
      // }
      //else{
        // merge(); // recursion
      //}


    }

    public static void divide(int oldLeft[], int oldRight[]){
      int[] left1 = new int[oldLeft.length / 2];
      int[] right1 = new int[oldLeft.length / 2];
      int[] left2 = new int[oldRight.length / 2];
      int[] right2 = new int[oldRight.length / 2];

      // split old left array into 2 parts
      System.arraycopy(oldLeft, 0, left1, 0, oldLeft.length / 2);
      System.arraycopy(oldLeft, oldLeft.length / 2, right1, 0, oldRight.length / 2);

      // split old right array into 2 parts
      System.arraycopy(oldRight, 0, left2, 0, oldLeft.length / 2);
      System.arraycopy(oldRight, oldLeft.length / 2, right2, 0, oldRight.length / 2);

      System.out.println("left side1: " + Arrays.toString(left1));
      System.out.println("right right1: " + Arrays.toString(right1));
      System.out.println("left side2: " + Arrays.toString(left2));
      System.out.println("right right2: " + Arrays.toString(right2));

      if(left1.length != 1){
        System.out.println("recursing");
        // sub arrays
        divide(left1, right1); // recursion
        divide(left2, right2); // recursion
      } else{
        operation = false;
        // merge(x, y); 
      }



    }

}
