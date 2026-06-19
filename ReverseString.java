/*import java.util.Scanner;

public class revString {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String rev= "";
        for(int i=str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
         System.out.println(rev);
    }
   
    
}*/
import java.util.Scanner;

public class ReverseString {
    public static String reverseStr(String s) {
      char[] c =s.toCharArray();
      int low=0;
      int high=c.length-1;
      while(low<high){
        char temp=c[low];
        c[low]=c[high];
        c[high]=temp;
        low++;
        high--;
      }
      return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String reversed = reverseStr(s);

        System.out.println("Reversed String: " + reversed);
    }
}