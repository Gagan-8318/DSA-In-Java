// Solution class to check if a string is a palindrome
class Solution {
    // Function to check if a string is a palindrome
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        // Loop to check if the string is a palindrome
        while (left < right) {
            // Skip non-alphanumeric characters on the left side
            if (!Character.isLetterOrDigit(s.charAt(left))) 
                left++;
            // Skip non-alphanumeric characters on the right side
            else if (!Character.isLetterOrDigit(s.charAt(right))) 
                right--;
            // If characters are different, it's not a palindrome
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) 
                return false;
            else {
                // Move towards the middle if characters are the same
                left++; 
                right--;
                int a;
            }
        }
        return true;  // The string is a palindrome if the loop completes
    }
}

// Main class to test the Solution class
public class Is_PalindromOrNot {
    public static void main(String[] args) {
        Solution solution = new Solution();  // Create an instance of the Solution class
        String str = "ABCDCBA";  // String to check for palindrome

        // Check if the string is a palindrome using the Solution class
        boolean ans = solution.isPalindrome(str);

        // Output the result
        if (ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
