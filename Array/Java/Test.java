public class Test {
    public static int second_large(int[] arr , int n ){
        if(n < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int Second_small = Integer.MAX_VALUE;
        int i ;
        for(i = 0;i < n ; i++){
            if(arr[i] <  small){
                Second_small = small;
                small = arr[i];
            }else if(arr[i] < Second_small && arr[i] != small){
                Second_small = arr[i];
            }
        }
        return Second_small;
    }
    public static int secondLargest(int[] arr , int n ){
        if(n<2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int i ;
        for(i = 0; i < n ;i++){
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            }else if (arr[i] < secondLarge && arr[i] != large){
                secondLarge = arr[i];

            }
        }
        return  secondLarge;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,5,3,2,9,23};
        int  n = arr.length; 
        int secondSmallest = second_large(arr,n);
        System.out.println("Second smallest no  is : "+ secondSmallest );

         int sLargest = secondLargest(arr,n);
         System.out.println("Second largest elemnt is " + sLargest);
    }
}
