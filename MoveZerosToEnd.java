public class MoveZerosToEnd {
    static void movetoend(int[] arr){
        int n=arr.length;
        int index=0;
        //move all non zeros to the starting 
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        //fill the remaining indexes with zeros
        while(index < n){
            arr[index++]=0;
        }
    }
    public static void main(String[] args) {
        int [] arr={12,2,0,43,0,2,3,0,3,0,50,0,0};
        movetoend(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
}
