import java.util.Scanner;

public class Solution {
    public static void reverse(int arr[], int start, int end ){
        // int start = arr[0];
        // int end= arr.length;
        while(start <= end ){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static  void rotate(int[] nums, int  n, int k) {
        if(n==0){
            return ;
        }
        k=k%n;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int d = sc.nextInt();

        rotate(arr,n,d);
        for(int i =0 ; i <n ; i++ ){
            System.out.print(arr[i] + " ");
        }
    }

}

