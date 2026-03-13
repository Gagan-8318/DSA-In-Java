public class CheckDivisibility {
    static boolean check(int n){
        int sod=0;
        int pod=1;
        int x=n;
        while(n!=0){
            int digit=n%10;
             sod=sod+digit;
             pod=pod*digit;
             n=n/10;

        }
        int sum_of_product_and_digit_sum=sod+pod;
        System.out.println(sum_of_product_and_digit_sum);
        System.out.println(n%sum_of_product_and_digit_sum);
        if(x%sum_of_product_and_digit_sum==0){
            return true;

        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(check(9));
    }
}
