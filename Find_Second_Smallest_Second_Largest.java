class Solution{
    static void find2ndSmallestLargest(int arr[]){
        int small=Integer.MAX_VALUE, secondSmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE, secondlarge=Integer.MIN_VALUE;
        //find smallest and largest
        int min=arr[0], max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<min){
                min=arr[i+1];
            }
            if(arr[i+1]>max){
                max=arr[i+1];
            }
        }
        // find the second smalllest and second largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondSmall && arr[i]!=min){
                secondSmall=arr[i];
            }
            if(arr[i]>secondlarge && arr[i]!=max){
                secondlarge=arr[i];
            }
        }
        System.out.println("Second Smallest: "+secondSmall);
        System.out.println("Second Largest: "+secondlarge);
    }

}

public class Find_Second_Smallest_Second_Largest {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,0,9,3,7,8,6};
        Solution.find2ndSmallestLargest(arr);
    }
}   