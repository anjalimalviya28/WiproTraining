import java.util.*;

interface P_info {
    void name(String name);
    void email(String email);
    void address(String address);
}

interface C_info {
    void rollNo(String rollNo);
    void subjects(String[] subjects);
}

class Student implements P_info, C_info {
    String name;
    String email;
    String address;
    String rollNo;
    String[] subjects;

    

    public void name(String name) {
        this.name = name;
    }

    
    public void email(String email) {
        this.email = email;
    }

    
    public void address(String address) {
        this.address = address;
    }



    
    public void rollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    
    public void subjects(String[] subjects) {
        this.subjects = subjects;
    }
}

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Student student = new Student();

        // Input personal information
        System.out.println("Enter name: ");
        student.name = scanner.next();

        System.out.println("Enter email: ");
        student.email = scanner.next();

        System.out.println("Enter address: ");
        student.address = scanner.next();

        
        System.out.println("Enter roll number: ");
        student.rollNo = scanner.next();

        System.out.println("Enter the number of subjects: ");
        int numsubjects = scanner.nextInt();
        scanner.next(); // Consume the newline character

        String[] subjects = new String[numsubjects];
        for (int i = 0; i < numsubjects; i++) {
            System.out.println("Enter course " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }
        student.subjects(subjects);

        // Display student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.name);
        System.out.println("Email: " + student.email);
        System.out.println("Address: " + student.address);
        System.out.println("Roll No: " + student.rollNo);
        System.out.print("subjects: ");
        for (String subject : student.subjects) {
            System.out.print(subject+ " ");
        }
        System.out.println();

        scanner.close();
    }
}
