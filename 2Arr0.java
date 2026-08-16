import java.util.Scanner;
public class 2Arr0{
public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("enter size of first array ");
    int size1 = input.nextInt();
    int[] values1 = new int[size1];
    System.out.print("enter size of second array ");
    int size2 = input.nextInt();
    int[] values2 = new int[size2];
    
    System.out.print("enter "+ values1.length+" numbers ");
    for(int i=0 ; i<values1.length ; i++ )
     values1[i] = input.nextInt();
     
    System.out.print("enter "+ values2.length+" numbers ");
    for(int i=0 ; i<values2.length ; i++ )
    values2[i] = input.nextInt();
    
if(identical(values1 , values2)) {
    System.out.print("the array are identical");
}    
 else{
    System.out.print("the array are not identical"); 
}    
 else{
    System.out.print("the array are not identical"); 
 }   
}

public static boolean identical(int[] numbers1 , int[] numbers2){
    if(numbers1.length!=numbers2.length)
    return false ;
    for(int i =0 ; i<numbers1.length;i++)
    if(numbers1[i]!=numbers2[i]){
        return false;
    }
        return true;
    }
}


