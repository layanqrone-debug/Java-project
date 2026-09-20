 import java.util.Scanner;
 public class Functions {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   String type = " ";
   int Applenum=0 , totalnum=0 ;
    while(true){
System.out.print("enter a laptop type or /finish/ to end ");

     if (input.hasNextInt()) {
System.out.println("ERROR! numbers are not allowed.");
input.next();
   continue; 
}
type = input.nextLine().trim().toLowerCase();
        
    if(type.equals("finish")){
    break;
}
        if (type.isEmpty()){
            continue;
        }
     if(type.startsWith("apple")) {
         Applenum++;
     }
        totalnum++;
    }
     System.out.printf("\nApple laptops: %d\nTotal laptops: %d\n ", Applenum , totalnum);
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
