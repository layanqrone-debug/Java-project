 import java.util.Scanner;
 public class Functions {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   String type = " ";
   int Applenum=0 , totalnum=0 ;
    while(true){
System.out.print("enter a laptop type or /finish/ to end ");
     
      //hasNextInt() : to detect if the user typed a number so we can show an error massage before processing 
     if (input.hasNextInt()) {
System.out.println("ERROR! numbers are not allowed.");
input.next();
   continue; 
}
     //nextLine() : reads an entire line of text including spaces 
     //trim() : removes any accidental spaces from the beginning and the end 
     //toLowerCase() : converts all letters in the string to lowercase to make it insensitive for 
type = input.nextLine().trim().toLowerCase();
     
      //equals() : compares two string to check if they are identical   
    if(type.equals("finish")){
    break;
}
     
     //isEmpty() : to prevent the program from processing if the user just presses 'Enter' 
        if (type.isEmpty()){
            continue;
        } 
     
     //startsWith() : checks if the string begins with specific prefix 
     if(type.startsWith("apple")) {
         Applenum++;
     }
        totalnum++;
    }
     System.out.printf("\nApple laptops: %d\nTotal laptops: %d\n ", Applenum , totalnum);

  //close() : closes the 'Scanner' object prevent memory leaks
     input.close();
 }
 }
/*
enter a laptop type or /finish/ to end Apple MacBook 13pro
enter a laptop type or /finish/ to end apple mini Macbook
enter a laptop type or /finish/ to end aPple 2020
enter a laptop type or /finish/ to end samsung Galaxy
enter a laptop type or /finish/ to end 0
ERROR! numbers are not allowed.
enter a laptop type or /finish/ to end samsung book4 ultra
enter a laptop type or /finish/ to end enter a laptop type or /finish/ to end finish

Apple laptops: 3
Total laptops: 5
 
=== Code Execution Successful ===
*/
