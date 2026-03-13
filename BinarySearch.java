// class BinarySearch {
//     // Iterative Binary Search
//     public static int binarySearch(int arr[], int target) {
//         int left = 0, right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Prevents overflow

//             // Check if target is at mid
//             if (arr[mid] == target)
//                 return mid;

//             // If target is smaller, search left half
//             if (arr[mid] > target)
//                 right = mid - 1;
//             else
//                 left = mid + 1; // Search right half
//         }
//         return -1; // Element not found
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 3, 5, 7, 9, 11, 15, 18};
//         int target = 9;
//         int result = binarySearch(arr, target);
//         if (result == -1)
//             System.out.println("Element not found");
//         else
//             System.out.println("Element found at index: " + result);
//     }
// }

class BinarySearch{
    public static int binarySearch(int arr[], int target){
        int l=0,h=arr.length-1;
        while(l<=h){
           int mid=(l+h)/2;
           if(arr[mid]==target){
            return 1;
           }
           else if (arr[mid]>target) {
            h=mid-1;
            
           }
           else{
            l=mid+1;
           }

       

    }
    return -1;
}
public static void main(String[] args){
    int arrr[]={1,2,3,4,5,6,7,8,9,10};
    int target=2;
    int res=binarySearch(arrr, target);
    if(res==1){
        System.out.println("number is found");
    }
else{
    System.out.println("not found");
}
    
}
}