public class RemoveDuplicate {
    static int removeduplicate(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3,4,4,4,5};
        int k=removeduplicate(arr);
        System.out.println("number of unique elements:"+k);
        for(int i=0;i<k;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
