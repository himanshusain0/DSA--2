import java.util.*;
import java.io.*;
class LinerSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many number of element");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        int ind = -1;
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            System.out.println("element  is not present in array ");
        }else{
            System.out.println("element is present at indexv " + ind);
        }

    }
}
