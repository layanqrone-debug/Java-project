import java.util.Scanner;
public class GradeCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
     int grade2 ,grade1, plus   ;
        double GPA;
  System.out.print("Enter your grades ");      
      grade1 = input.nextInt();
      grade2 = input.nextInt();   
      System.out.println("the grades :"+ grade1 + " " + grade2); 

       //Arithmetic Operators 
      plus = grade1 + grade2 ;
System.out.println("the sum of the grades is = " + plus);  
     GPA = plus/2.0 ;
System.out.println("the GPA is = " +GPA);  
        //Widening
System.out.println("THE PLUS "+ (double) plus);
        // narrowing(casting )
       int gpa = (int) GPA  ;
        System.out.println("Integer gpa "+ gpa);  
    }
}
/*
    Enter your grades 80
79
the grades :80 79
the sum of the grades is = 159
the GPA is = 79.5
THE PLUS 159.0
Integer gpa 79

*/
