package AssignmentArray;

public class GreatestElement {
   public static int maxElement(int[]arr) {

       int max = arr[0];

       for (int i = 0; i < arr.length; i++) {

           if (max < arr[i]) {
               max = arr[i];


           }

       }return max;


   }

}




