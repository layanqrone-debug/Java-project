import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int[][]arr=new int[3][4];
System.out.println("write "+arr.length + "x"+ arr[0].length +"value");
    for(int row=0 ; row<arr.length ; row++) {
        for(int columns= 0; columns<arr[row].length; columns++){
        arr[row][columns]  = input.nextInt();
        }
    }
    int positive=0, negative=0 , zero=0 ,sumpos=0 , sumneg=0;
     for(int row=0 ; row<arr.length ; row++) {
        for(int columns= 0; columns<arr[row].length; columns++){
    if(arr[row][columns]>0){
        positive++;
        sumpos+=arr[row][columns];
    }
    if (arr[row][columns]<0) {
        negative++;
        sumneg=arr[row][columns];
    }
    if  (arr[row][columns]==0){
        zero++;
    }
        }
             }
    System.out.println("positive values "+positive +" sum positive number "+sumpos);
    System.out.println("negative values "+negative+" sum of negative number "+sumneg);
    System.out.println("zero values"+zero);
    
    int sumfirstrow=0 ;
for(int columns=0 ;columns<arr[0].length; columns++){
    sumfirstrow+=arr[0][columns] ;
}
    System.out.println("sum of first row"+sumfirstrow);
    
    int sumseconcol=0;
    for (int row=0; row<arr.length ; row++){
       sumseconcol+=arr[row][2]; 
    }
    System.out.println("sum of second columns"+sumseconcol);
    
        }
    }   

