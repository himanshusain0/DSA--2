package java;
import java.io.*;
import java.util.*;
class OneMOreSlection {
    static void selectionSort(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {20,50,10,15,17,25,65};
      selectionSort(arr);
      System.out.print(Arrays.toString(arr));
    }
}