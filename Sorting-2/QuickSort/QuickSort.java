public class QuickSort {
    public static int partition(int[] arr,int l ,int h ){
        int i = l ;
        int pivot = arr[l];
        for(int j = l+1;j<=h;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;

            }
        }
        int temp = arr[l];
        arr[l ]= arr[i];
        arr[i]= temp;
        return i;

    }
    public static void quickSort(int[] arr,int l , int h ){
        if( l < h){
            // 1.divide the array into sub problems
            int m = partition(arr,l,h);
            // 2. conquer those subproblems
            quickSort(arr, l,m-1);
            quickSort(arr, m+1, h);
        }
    }
    public static void  printArr(int[] arr,int n){
        for(int i =0 ; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] arr={50,20,70,90,10,13,17,21};
        int n = arr.length;
        System.out.println("Array before sort is :");
        printArr(arr,n);

        quickSort(arr,0,n-1);

        System.out.println("Array after sort is :");
        printArr(arr,n);

    }
}
