import java.util.Scanner;
class SmartATM {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double Balance = 1000.0 ;
        int pin = 1234;
        int attempts = 0;
        boolean LoogedIn = false ;
         //login system 
            while (attempts<3){
              System.out.println("Enter your PIN ");
              int Enterpin = input.nextInt();
             if(Enterpin == pin){
                LoogedIn=true ;
             System.out.println("Login successful");
                break;
             }
             else {
                attempts++;
             }
              if (attempts<3){
             System.out.println("Incorrect try again");
              System.out.println("Attempts remaining:"+ attempts);
             }
              else {
              System.out.println("Account access blocked");
              }
              }
                //main menu 
              if(LoogedIn){
               int choice;
               do{
                  System.out.println("====Smart ATM====");
                  System.out.println("optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   ");

                  choice = input.nextInt();
                 
                     switch (choice){

                     case 1 :
                     System.out.printf("your balance is %.2f%n",Balance );
                        break;
                        
                     case 2 :
                      System.out.println("Enter deposit amount : ");
                      double deposit = input.nextDouble();
                         if (deposit>0){
                           Balance += deposit; 
                          System.out.printf("deposit successful. Balance%.2f",Balance);      
                          }else {
                          System.out.println("MUST BE POSITIVE!.");    }                        break;
                        
                          case 3 :
                         System.out.println("Enter Withdraw amount : ");
                         double withdraw = input.nextDouble();
                          if(withdraw<=0){
                         System.out.println("Invalid amount : ");}
                         else if(withdraw>Balance){
                          System.out.println("Insufficient balance");                          }else{
                          Balance -=  withdraw;    
                          System.out.println("successful withdraw. Balance"+Balance );                                                     } 
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
                               int currentpin = input.nextInt();
                              if (currentpin==pin){
                             System.out.println("Enter new 4-digits PIN : ");                              int Newpin = input.nextInt();
                             if (Newpin >= 1000 && Newpin <= 9999)   {
                              pin = Newpin;
                              System.out.println("PIN changed successfully");                    }        
                              else{
                              System.out.println("must be 4-digits");
                               }
                             } else{
                             System.out.println(" incorrect current PIN ");                         }
                             break;                    
                                 case 6 :
                                  System.out.println("thank you ");break;
                        
                                                         
                                   }   
                                    } while (choice != 6);
                                    System.out.println("Invalid option. choos 1-6");    
                                 }
                                 input.close();
                                    }
                                    }
 
/*
Enter your PIN 
1234
Login successful
====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
1
your balance is 1000.00
====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
2
Enter deposit amount : 
800
deposit successful. Balance1800.00====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
4
Account status:silver
====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
3
Enter Withdraw amount : 
290
successful withdraw. Balance1510.0
====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
5
Enter your current PIN : 
1234
Enter new 4-digits PIN : 
9841
PIN changed successfully
====Smart ATM====
optiones 1.Check Balance ,  2.Deposit Money ,  3.Withdraw Money ,  4.Account Status ,  5.Change PIN ,  6.Exit, pleas choose an option   
6
thank you 
*/
