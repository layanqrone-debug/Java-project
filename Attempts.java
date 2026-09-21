import java.util.Scanner;
public class Attempts {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        while(attempts>0){
        System.out.print("Enter a number ");
     int num = input.nextInt();
     int result = num/3;   
        if ( result>3 || result==0 ){
   attempts--;
            if(attempts>0)
System.out.println("try another number ,Remaining attempts"+attempts);
            
                else {
            System.out.print("no more attempts");    }    
            
        
            }
         else{
         switch(result){
            case 1 : System.out.println("ONE");break;
            case 2 : System.out.println("TWO");break;
            case 3 : System.out.println("THREE");break;    
         }
    }

         
 } 
        
    }
}   
/*
Enter a number 1
try another number ,Remaining attempts2
Enter a number 0
try another number ,Remaining attempts1
Enter a number 9
THREE

*/
