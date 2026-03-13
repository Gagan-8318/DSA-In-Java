public class solution1 {
    static int LengthOfLastWord(String s){
        int i=s.length()-1;
while(i>=0 && s.charAt(i) ==' '){
    i--;
}
int length=0;
while(i>=0 && s.charAt(i)!=' '){
    length++;
    i--;
}
return length;
    }
    public static void main(String[] args) {
        System.out.println(LengthOfLastWord("hello word"));
    }
}
