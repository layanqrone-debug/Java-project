import java.util.Scanner;
public class Palindrome {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);

     System.out.println("enter a word to check it if it is palindrome");
     String word = input.next();
     boolean  result =isPalindrome(word);
     if(result){
     System.out.print("this word is palindrome");
     }
        else {
     System.out.print("this word is not palindrome");

        }
}
    public static boolean isPalindrome(String word){
    char[] arr = word.toCharArray();
    int start = 0;
    int end = word.length()-1;
    while(start<end){
        if(arr[start]!=arr[end]){
            return false; 
        }
      start++;
    end--;        

    }
        return true;
    }

}
/*
enter a word to check it if it is palindrome
madam
this word is palindrome
*/
