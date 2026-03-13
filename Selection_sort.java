public class Selection_sort {
    static void Selection_sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min_index]){
                        min_index=j;
                    }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={7,4,2,100,90};
        Selection_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
