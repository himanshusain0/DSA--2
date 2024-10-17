public class RemoveDuplicate {
    public static int duplicateNumers(int[] arr){
        int i =0 ;
        for(int j =0 ; j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int k = duplicateNumers(arr);
        System.out.println("Number of duplicate is " + k);
        System.out.println(" After Remove the  duplicates");
        for(int i = 0 ;i<k;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
