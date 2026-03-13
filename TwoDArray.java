import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println("Enter the element of 3*3 matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter element ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
        System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    
}
