import java.util.Scanner;

public class Recursion1 {
    
    static void print_n(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
      
        print_n(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        print_n(n);

    }
}
