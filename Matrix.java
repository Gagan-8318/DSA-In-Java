import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of row");
        int row=sc.nextInt();
        System.out.println("Enter the number of column");
        int cols=sc.nextInt();
        int[][] matrix=new int[row][cols];
        System.out.println("enter the element in matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        System.out.println("original matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
