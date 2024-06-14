package AssignmentArray;

public class SecondLargestNum {
    public static int SecondMaxNum(int[]arr){
        int max = arr[0];
        int second= arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];

            }

        }return second;
    }
}
