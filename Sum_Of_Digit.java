public class Sum_Of_Digit {
    static int Sum_Of_Digit(int n){
        int sum;
        if(sum<=9)

       if(n/10==0){
        return n;
       }
        sum= Sum_Of_Digit(n/10)+n%10;
       return sum;

    }
    public static void main(String[] args) {
        
        System.out.println(Sum_Of_Digit(18456));
    }
    
}
