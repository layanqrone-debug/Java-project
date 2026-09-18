public  class Constructor{
    public static void main(String[]args){
    Student s1 = new Student();
    Student s2 = new Student("layan" , 20 , "MIS" , 3.8);
    Student s3 = new Student(s2);
    Student s4 = new Student("jana",2.6);
    s1.display();
    s2.display();
    s3.display();
    s4.display();
}
}
  class Student {
  String  name ;
  int  age ;
  String  major ;
  double  gpa ;  
//defult
  Student()  {
      
  }
    //parameterized
  Student(String n ,int a  ,String m , double g ) {
      this.name= n;
      this.age= a;
      this.major= m;
      this.gpa= g;
  } 
    //copy
   Student(Student s2) {
     name= s2.name;
      age= s2.age;
     major= s2.major;
    gpa= s2.gpa; 
}
   Student(String n , double g ){
 this.name= n;
 this.gpa= g;     
   }
 public void display(){
     System.out.println("name = "+name); 
     
     System.out.println("age = "+ age);
     
     System.out.println("major = "+major);
     
     System.out.println("gpa = "+gpa);
 }   
}
/*
output:
name = null
age = 0
major = null
gpa = 0.0
name = layan
age = 20
major = MIS
gpa = 3.8
name = layan
age = 20
major = MIS
gpa = 3.8
name = jana
age = 0
major = null
gpa = 2.6
    */
