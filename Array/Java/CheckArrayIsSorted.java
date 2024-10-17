public class CheckArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] arr){
        int count = 0 ;
        for(int i =0; i < arr.length-1 ; i++){
            if(arr[i] <= arr[i+1]){
                count ++;
            }
            else {
                return false;
            }
        }
        return count>=0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9};
        boolean result = checkArrayIsSorted(arr);
        if(result == true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");

        }
    }
}
