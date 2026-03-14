class solution {

    public void count(String str){
        int vowels=0,consonants=0,whitespaces=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
            else if(ch==' '){
                whitespaces++;

            }
        }
        System.out.println("total number of vowel "+ vowels);
                System.out.println("total number of consonants "+ consonants);
                        System.out.println("total number of whitespaces "+ whitespaces);


    }

}
public class Count_vowls_consonants_whitespaces {

    public static void main(String[] args) {
        String str="my name is Gagan";
        solution s=new solution();
        s.count(str);
    }
}