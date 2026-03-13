class solution{
    public boolean isPalindrome(String s){
        int left=0;
        int right =s.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;

            }

        }
        return true;
    }
}

public class isPalindromOrNot{ 
    public static void main(String[] args){
        solution solution=new solution();
        String str="ABCDCbA";
        boolean ans=solution.isPalindrome(str);
        if(ans){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrom");
        }
    }
}