package Java;

public class MergeSort {
    public static void mergeProcedure(int[] arr ,int l , int mid,int r ){
        int i , j ,k;
        int  n1 =mid -l+1;
        int n2 = r-mid;
        int[] lSubArray = new int[n1]; 
        int[] rSubArray = new int[n2];

        for(i = 0 ; i<n1;i++){
            lSubArray[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            rSubArray[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while (i < n1 && j < n2) {
            if(lSubArray[i]<=rSubArray[j]){
                arr[k]= lSubArray[i];
                i++;
            }
            else{
                arr[k]= rSubArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=lSubArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rSubArray[j];
            j++;
            k++;
        }


    }



    public static void mergeSort(int[] arr ,int i ,int j){
        if(i<j){
            int mid = i+(j-i)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr, mid+1, j);
            mergeProcedure(arr,i,mid ,j);
        }
    }


    public static void printArr(int[] arr ,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {50,20,40,90,88,11,13};
        int n = arr.length;
        System.out.println("Array before Sorted");
        printArr(arr,n);
        mergeSort(arr,0,n-1);

        System.out.println("Array after the sorted ");
        printArr(arr,n);
    }
}
