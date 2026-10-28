import java.util.Scanner;
class SmartATM {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double Balance = 400.0 ;
        int pin = 1234;
        int attempts = 0;
        boolean LoggedIn = false ;
        double withdrawdailylimit = 500;
        double totalwithdraw = 0.0; 
        int transactioncount = 0 ;
         //login system 
            while (attempts<3){
              System.out.println("Enter your PIN ");
                if(!input.hasNextInt()){
             System.out.println("Invaild PIN ! ");    
                    input.next();
                  attempts++ ;
                } else  {
              int Enterpin = input.nextInt();
             if(Enterpin == pin){
                LoggedIn=true ;
             System.out.println("Login successful");
                break;
             
                } else {
               attempts++ ;     
                 System.out.println("Incorrect try again");
             }
                }
              if (attempts<3){

System.out.println("Attempts remaining:"+ (3-attempts));
             }else {
System.out.println("Account access blocked");
              }
              
            }
                //main menu 
              if(LoggedIn){
               int choice;
               do{
System.out.println("====Smart ATM====");
System.out.println("optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, 7.Transaction History , pleas choose an option   ");

    if (!input.hasNextInt()) {
        System.out.println("Invalid input! Enter a number from 1 to 7.");
        input.next();
    }
                   
                  choice = input.nextInt();
                 
                     switch (choice){

                     case 1 :
System.out.printf("your balance is %.2f%n",Balance );
                        break;
                        
                     case 2 :
System.out.println("Enter deposit amount : ");
                         if(!input.hasNextDouble()) {
System.out.println("Invaild ! just numbers ");
    input.next();
                         }
                             else{
                      double deposit = input.nextDouble();
                                 
                         if (deposit>0){
                           Balance += deposit; 
                           transactioncount++;  
System.out.printf("deposit successful. Balance%.2f\n",Balance);      
                          }
                             else {
System.out.println("MUST BE POSITIVE!.");    } 
                             } 
                             break;
                        
                          case 3 :
System.out.println("Enter Withdraw amount : ");
              if(!input.hasNextDouble()) {
  System.out.println("Invalid input ! please input numeric amount  ");
        input.next();
              }   
              else{
        double withdraw = input.nextDouble();                
             if(withdraw<=0){
System.out.println("Invalid amount : ");}
          else if(withdraw>Balance){
System.out.println("Insufficient balance");   }
else if(totalwithdraw + withdraw >withdrawdailylimit) {
System.out.println(" Daily limit exceeded ");
          }
          else{
           Balance -=  withdraw;  
           totalwithdraw += withdraw;  
        transactioncount++;  
System.out.println("successful withdraw. Balance "+ Balance );
          if(Balance<100){
    System.out.println(" warinig:your balance is low !" );              }
          }
          } 
                           break;
                              case 4 :
               if( Balance<500){
System.out.println("Account status:Basic");                                
                             }
       else if( Balance<2000){
System.out.println("Account status:silver");                                
                             }
else{
                                                           System.out.println("Account status:Gold");                                }
                             break;
                        
                               case 5 :
System.out.println("Enter your current PIN : ");
         if(!input.hasNextDouble()){
System.out.println("only numbers ");  
             input.next();
                             }
                             else{
int currentpin = input.nextInt();
                   if (currentpin==pin){
System.out.println("Enter new 4-digits PIN : ");   
                   int Newpin = input.nextInt();
            if (Newpin >= 1000 && Newpin <= 9999)   {
                 pin = Newpin;
System.out.println("PIN changed successfully");                    }        
                              else{
System.out.println("must be 4-digits");
                               }
                             } else{
System.out.println(" incorrect current PIN ");                         }
                             }
                             break;  
                             
                                 case 6 :
System.out.println("thank you ");
                             break;

                         case 7 :
System.out.printf("number of succesful transactions %d\n",transactioncount);
                             break;                             
               }    
            } while (choice != 7);
                                    System.out.println("Invalid option. choos 1-6");    
                                 }
input.close();
}
}
/*

*/
