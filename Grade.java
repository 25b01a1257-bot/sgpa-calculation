import java.util.Scanner;
  class Grade{
public static void main(String args[]){
int i;
double gp;
double cred;
double total_cred=0;
double sgpa=0;
double total_sgpa;
double cgpa;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of subjects");
 int sub=s.nextInt();
for(i=1;i<=sub;i++){

System.out.println("Enter marks of Subject" + i +":");
int marks=s.nextInt();
if(marks>=90 && marks<=100){
  System.out.println("Grade:S");
  gp=10.0;
}
else if(marks>=80){
  System.out.println("Grade:A");
   gp=9.0;
}
else if(marks>=70){                                           
  System.out.println("Grade:B");
   gp=8.0;
}
else if(marks>=60){
  System.out.println("Grade:C");
   gp=7.0;
}
else if(marks>=50){
  System.out.println("Grade:D");
  gp=6.0;
}
  
else if(marks>=40) {
  System.out.println("Grade:E");
  gp=5.0;
}
   
else {
    System.out.println("Fail");
  gp=0;
   }
System.out.println("Enter credits for subject" +i);
cred=s.nextDouble();
   
sgpa=(sgpa+(cred*gp));
total_cred=(total_cred+cred);
}


total_sgpa=(sgpa)/total_cred;
System.out.println("SGPA:" + total_sgpa);
System.out.println("Enter the present sgpa:" );
double present_sgpa=s.nextDouble();
cgpa=(total_sgpa + present_sgpa)/2;
System.out.println("CGPA:" + cgpa);
   

} 
}







