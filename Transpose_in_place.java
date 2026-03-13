public class Transpose_in_place {
    public static void transpose_in_place(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
    public static void printmatrix(int[][] matrix){
        for(int[] row:matrix){
            for(int val : row){
                System.out.println(val+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        int [][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("original matrix:");
        printmatrix(matrix);
        transpose_in_place(matrix);
        System.out.println("Transposed matrix:");
        printmatrix(matrix);
    }
}
