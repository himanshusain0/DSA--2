import java.util.*;
import java.io.*;
public class BinarySearch {
    public static int binarySearch(int[] arr ,int target){
        int low =0;
        int high = arr.length-1;
        while (low<= high){
            int mid = low+ (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return 0;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many number of element");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
       int result = binarySearch(arr,x);
        if(result==0){
            System.out.println("element  is not present in array ");
        }else{
            System.out.println("element is present at indexv " + result);
        }

    }
}
