import java.util.Stack;
import java.util.Scanner;
public class LeetCode {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch =='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if ((ch==')' && ch=='(') || (ch=='}' && ch=='{') || (ch==']' && ch=='[')) {
                    return false;
                    
                }
            }
        }
    
    return stack.isEmpty();
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paranthesis string");
        String input =sc.nextLine();
        boolean result =isValid(input);
        if(result){
            System.out.println("valid paranthesis");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
    
}
