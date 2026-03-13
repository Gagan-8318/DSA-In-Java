public class Calculator {
    public static int calculateSum(int a,int b){
        return a+b;
    }
    public static int calculateDiff(int a,int b){
        return a-b;
    }
    public static void main(String[] args){
        Calculator c=new Calculator();
    //   int  x= c.calculateSum(10,20 );
    //   int y=  c.calculateDiff(10,20 );
     System.out.println("the sum is "+calculateDiff(10, 3));
    //   System.out.println("the diff is "+y);
      System.out.println("the diff"+c.calculateDiff(10, 5));
    //   System.out.println("the sum"+c.calculateSum(10,20));
    }
    
}
