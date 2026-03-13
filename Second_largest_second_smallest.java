import java.util.Arrays;
public class Second_largest_second_smallest {

    public static void getElement(int[] arr,int n){
        if(n==0 || n==1){
            System.out.println(-1 +" " + -1);
            return;
        }
        Arrays.sort(arr);
        int small=arr[1];
        int large=arr[n-2];
        System.out.println("second smallest is"+ small);
        System.out.println("second largest is"+ large);
    }
    
}
public class main(){
    public static void main(string[] args){
        int arr[]={23,132,44,3,123,45,43231,765,78,666632,5545,};
        int n=arr.length;
        Second_largest_second_smallest.getElement(arr, n);
    }
}