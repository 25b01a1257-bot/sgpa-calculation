import java.util.Scanner;
class Grade{
public static void main(String args[]){
int i;
double sgpa;
double gp;
double cr;
double total=0;
Scanner s=new Scanner(System.in);
for(i=1;i<=9;i++){
System.out.println("Enter subject "+i+ "marks");
int marks=s.nextInt();
if(marks>=90){
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
else if(marks>=40){
System.out.println("Grade:E");
gp=5.0;
}
else{
System.out.println("Fail");
gp=0.0;
}
if(i==1||i==2||i==3||i==4||i==5)
   cr=3.0;
else if(i==6||i==7)
   cr=1.5;
else if(i==8)
   cr=1.0;
else 
  cr=0.5;
total =total+(cr*gp);
}
sgpa=total/19.5;
System.out.println("SGPA:" + sgpa);
}
}






