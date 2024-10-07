package java;
import java.util.Scanner;
public class SelectionSort{
    public static  void selectionSort(int[] arr, int n){
        for(int i=0;i<=n-2;i++){
            int min =i;
            for(int j =i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min= j;
                }
                
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        System.out.println("sorted array");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the how many elements to sort ");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println();
        selectionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
