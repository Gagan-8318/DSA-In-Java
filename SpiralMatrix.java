import java.util.Scanner;
public class SpiralMatrix {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
//    /*  public*/static int[][] MakePascal(int n){
//     int ans[][]=new int[n][];
//     for(int i=0;i<n;i++){
//         ans[i]=new int[i+1];
//         ans[i][0]=ans[i][i]=1;
//         for(int j=1;j<i;j++){
//             ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
//         }
//     }
//     return ans;

//     }
static void TraversalSpiralMatrix(int [][] matrix,int r,int c){
    int toprow=0;
    int bottomrow=r-1;
    int leftcol=0;
    int rightcol=c-1;
    int totalcount=1;
    
    while(totalcount<=r*c){
        //Top row ->leftcol to rightcol
        for(int j=leftcol;j<=rightcol && totalcount<=r*c;j++){
            matrix[toprow][j]=totalcount;
 totalcount++;
        }
        toprow++;

        //Right column -> top row to bottom row
        for(int i=toprow;i<=bottomrow && totalcount<=r*c;i++){
            matrix[i][rightcol]=totalcount;
             totalcount++;

        }
        rightcol--;
       
        //bottm row -> right col to left column
        for(int i=rightcol;i>=leftcol && totalcount<=r*c;i--){
            matrix[bottomrow][i]=totalcount;
            totalcount++;
        }
        bottomrow--;

        //Left col ->bottom row to top row
        for(int i=bottomrow;i>=toprow && totalcount<=r*c;i--){
            matrix[i][leftcol]=totalcount;
            totalcount++;
        }
        leftcol++;
    }
}
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the size of row");
       int r=sc.nextInt();
       System.out.println("enter the size of column");
       int c=sc.nextInt();
       int [][] matrix=new int[r][c];
       TraversalSpiralMatrix(matrix,r, c);
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(matrix[i][j]+"  ");
        
        }
        System.out.println();
       }

    }
    
}
