public class Bubble_sort {
    
    static void Bubble_sort(int[] a){
        int n=a.length;
        boolean flag=true;
        // n-1 iteration/pases
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                //Last i elements are already at correct position
                if(a[j]>a[j+1]){
                    flag=false;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        if(flag==true){
            return;
        }
    }
    public static void main(String[] args){
        int[] a={1,2,4,5,6};
        Bubble_sort(a);
        for(int i:a){
            System.out.println(i+" ");
        }

    }
}
