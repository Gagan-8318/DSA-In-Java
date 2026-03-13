// import java.util.Scanner;

// public class ArrayDeclarartion {
//     public static void main(String[] args){
//         int[] arr= new int[5];
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the 5 element:");
//             for(int i=0;i<arr.length;i++){
//                 arr[i]=sc.nextInt();

//             }
//         int idx=2;
//         int data=90;
//         System.out.println("Array elements:");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
// }

import java.util.Scanner;
public class ArrayDeclarartion{
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int idx=2;
        int data=90;
        System.out.println("Array element:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}