import java.util.*;

public class MissingArray {
    public static  int missNum(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s2 = 0 ;
        for(int i = 0 ; i< n ;i++){
            s2 = s2 + nums[i];
        }
        return (sum-s2);
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = missNum(arr);
        System.out.println("result " + result);
    }
}
