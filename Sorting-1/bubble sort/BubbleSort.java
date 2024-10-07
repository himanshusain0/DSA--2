import java.io.*;
import java.util.*;
class BubbleSort{
    public static  void  bubbleSort(int arr[],int n){
       
        for(int i = 0 ;i<n;i++){
            boolean swaped = false;
            for(int j = 0 ;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element" );
        for(int i =0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}