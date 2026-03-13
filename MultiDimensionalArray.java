public class MultiDimensionalArray{
    static void printarray(int [][] arr){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{1,5,3},{23,34,3}};
        printarray(arr);
    }
}