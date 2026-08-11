

import java.util.Scanner;

class Grade {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        System.out.print("Enter the number of subjects: ");
        int sub = s.nextInt();

        for (int student = 1; student <= n; student++) {

    
            double sgpa = 0;
            double total_cred = 0;
            double gp, cred;
           
            for (int i = 1; i <= sub; i++) {

                System.out.print("Enter marks of Subject " + i + ": ");
                int marks = s.nextInt();
                System.out.print("Enter credits for Subject " + i + ": ");
                cred = s.nextDouble();


                if (marks >= 90 && marks <= 100) {
                    System.out.println("Grade: S");
                    gp = 10.0;
                } else if (marks >= 80) {
                    System.out.println("Grade: A");
                    gp = 9.0;
                } else if (marks >= 70) {
                    System.out.println("Grade: B");
                    gp = 8.0;
                } else if (marks >= 60) {
                    System.out.println("Grade: C");
                    gp = 7.0;
                } else if (marks >= 50) {
                    System.out.println("Grade: D");
                    gp = 6.0;
                } else if (marks >= 40) {
                    System.out.println("Grade: E");
                    gp = 5.0;
                } else {
                    System.out.println("Fail");
                    gp = 0;
                }

                
                sgpa = sgpa + (cred * gp);
                total_cred = total_cred + cred;
            }

            double total_sgpa = sgpa / total_cred;

            System.out.println("SGPA = " + total_sgpa);

            System.out.print("Enter previous CGPA (or previous semester SGPA): ");
            double previous = s.nextDouble();

            double cgpa = (total_sgpa + previous) / 2;

            System.out.println("CGPA = " + cgpa);
        }

       
    }
}






