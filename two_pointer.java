import java.util.*;
public class two_pointer{
    static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void sortzero(int [] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right) {
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==0){
                right--;;
            }
           
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        
       
       
    }

    public static void main(String[] args) {
        
        int [] arr={0,1,1,1,0,0,0,0,1,1,0};
        sortzero(arr);
  
    }


}