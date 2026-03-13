// import java.util.*;
// public class Rotate_Arrays {
//     public static void main(String[] args){
//         int[] arr={3,2,4,11,43,55,7,8};
//         int k=2;
//         int n=arr.length;
//         int [] temp= new int[n];
//         int index=0;
//         // find the last k elments
//         for(int i=n-k;i<n;i++){
//             temp[index++]=arr[i];
//         }

//         // first n-k elements
         
//         for(int i=0;i<n-k;i++){
//             temp[index++]=arr[i];

//         }
//         for(int i=0;i<temp.length;i++){
//             System.out.print(" "+ temp[i]);
//         }

//

import java.util.*;
public class Rotate_Arrays{
    static void reverse(int[] arr,int start,int end){
        int temp;
        while(start<end){
             temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;

        }
       
    }

 public static void main(String[] args){
    int [] arr={12,23,1,2,12,3,4,44};
    int k=2;int n=arr.length;
    k=k%n;
    reverse(arr, 0, n-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
    for(int i=0;i<n;i++){
        System.out.print("  "+ arr[i]);
    }
            
        }

}