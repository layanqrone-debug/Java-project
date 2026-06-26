import java.util.Scanner;
public class Main {
public static void main (String[]args){
Scanner input = new Scanner(System.in);
int positive=0 ,negativie=0 , num , sum=0 , sumnegativie=0 , sumpositive=0;
System.out.print("Enter an integers or 0 to stop: ");
while (!input.hasNextInt()) {
System.out.println("ERROR! Letters or symbols are not allowed.");
System.out.print("Enter an integer or 0 to stop: ");
input.next();
}
num=input.nextInt();
while (num!=0){
if(num>0) {
positive++;
sumpositive += num ;}
if(num<0){
negativie++;
sumnegativie += num ;}
sum+= num;
System.out.print("Enter an integers or 0 to stop ");
num=input.nextInt();
}
System.out.printf("positive: %d\n negativie: %d\n",positive,negativie);
System.out.println("the sum of positive numbers : "+ sumpositive);
System.out.println("the sum of negative numbers : "+ sumnegativie);
System.out.println("the sum of all numbers : "+ sum);
}
}