package Array.Java;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,2,4};
        int large = arr[0];
        for(int a = 1;a<arr.length-1;a++){
            if(arr[a]>large){
                large = arr[a];
            }
        } 
        System.out.println("largest element is : " + large);

    }
}
