import java.util.Scanner;
public class vowelsConsonants {
    public static void countVowelsConsonants(String s) {
       s=s.toLowerCase();
       int vowels=0;
       int consonants=0;
       for(char c :s.toCharArray()){
        if(c>='a' && c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
            else{
                consonants++;
            }

        }
       }
       System.out.println("vowels:"+vowels);
       System.out.println("consonants:"+consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countVowelsConsonants(str);
    }
}