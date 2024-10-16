import  java.util.Arrays;


public class SecondLargest {
    public static void getElement(int[] arr ,int n){
        if(n==0||n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small= arr[0];
        int largest = arr[n-2];
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + largest );
    }
    public static void main(String[] args) {
        int[] arr = {5,8,6,756,222,2,45,5};
        int n = arr.length;
        getElement(arr,n);

    }
}
