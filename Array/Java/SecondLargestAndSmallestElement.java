public class SecondLargestAndSmallestElement {
    public static void getElements(int[] arr, int n){
        if(n==0||n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int Second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int Second_large = Integer.MIN_VALUE;
        int i ;
        for(i=0; i< n; i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for(i =0;i < n;i++){
            if(arr[i] < Second_small && arr[i] != small){
                Second_small =arr[i];

            }
            if(arr[i] > Second_large && arr[i] != large){
                Second_large =arr[i];
                
            }
        }
        
	System.out.println("Second smallest is "+Second_small);
	System.out.println("Second largest is "+Second_large);
    }
    public static void main(String[] args ){
        int[] arr = {1,2,5,14,6,8,9,65};
        int n = arr.length;
        getElements(arr,n);
    }
}
